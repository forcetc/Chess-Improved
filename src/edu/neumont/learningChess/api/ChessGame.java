package edu.neumont.learningChess.api;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import edu.neumont.learningChess.model.ChessBoard;
import edu.neumont.learningChess.model.ChessPiece;
import edu.neumont.learningChess.model.ChessTeam;
import edu.neumont.learningChess.model.King;
import edu.neumont.learningChess.model.MoveHistory;
import edu.neumont.learningChess.model.Rook;

public class ChessGame {
	
	private ChessBoard board = new ChessBoard();
	private ChessTeam lightTeam = new ChessTeam();
	private ChessTeam darkTeam = new ChessTeam();
	private TeamColor currentTeamColor = TeamColor.LIGHT;
	private MoveHistory moveHistory = new MoveHistory();
	private IPromotionListener promotionListener;


    public ChessGame() {
    	setupTeam(lightTeam, '0', '1');
    	setupTeam(darkTeam, '8', '7');
    }
    
    public ChessGame(ChessGameState gameState) {
        for (int row = 0; row < ChessBoard.NUMBER_OF_ROWS; row++) {
            for (int col = 0; col < ChessBoard.NUMBER_OF_COLUMNS; col++) {
                Location location = new Location(row, col);
                PieceDescription pieceDescription = gameState.getPieceDescription(location);

                ChessPiece piece = (pieceDescription.getColor() == TeamColor.LIGHT) ?
                        lightTeam.getUnusedPiece(pieceDescription.getPieceType())
                        : darkTeam.getUnusedPiece(pieceDescription.getPieceType());

                board.setPiece(piece, location);
                piece.setHasMoved(pieceDescription.hasMoved());
            }
        }
        currentTeamColor = gameState.getMovingTeamColor();
        moveHistory.push(gameState.getMostRecentMoveDescription());
    }

    public ChessGameState getGameState() {


        //TODO:
        return null;
    }

    public MoveDescription getMoveDescription(Move move) {

        MoveDescription moveDescription = new MoveDescription(move);
        ChessPiece piece = board.getPiece(move.getFrom());

        if (piece != null && piece.isPossibleMove(move) && !board.piecesInPath(move)) {
            Location castleRookLocation = getCastleRookLocation(move);
            Location enPassantLocation = getEnPassantLocation(move);

            if (castleRookLocation != null) {
                moveDescription.setCastlingRookPosition(castleRookLocation);
            } else if (enPassantLocation != null) {
                moveDescription.setEnPassantCapturedPawnLocation(enPassantLocation);
            } else if (isPawnPromotion(move)) {
                PieceType pawnPromotionPieceType = promotionListener.getPromotionPieceType();
                moveDescription.setPawnPromotionType(pawnPromotionPieceType);
                if (isCaptureMove(move)) {
                    moveDescription.setCapturedPiece(getPieceDescription(move.getTo()));
                }
            } else if (isCaptureMove(move)) {
                moveDescription.setCapturedPiece(getPieceDescription(move.getTo()));
            }

            if (causesCheck(moveDescription)) {
                moveDescription = null;
            }
        }


        return moveDescription;
    }


    public void makeMove(MoveDescription moveDescription) {
        // TODO: finish this method
    }

    public void unMakeMove() {
        // TODO: finish this method
    }

    public boolean isCheck() {
        // TODO: finish this method
        return false;
    }

    public boolean isCheckMate() {
        // TODO: finish this method
        return false;
    }

    public boolean isStaleMate() {
        // TODO: finish this method
        return false;
    }

    public Enumeration<Move> getPossibleMoves() {
        // TODO: finish this method
        return null;
    }

    public Enumeration<Move> getPossibleMoves(Location location) {
        // TODO: finish this method
        return null;
    }

    public Enumeration<Move> getGameHistory() {
        // TODO: finish this method
        return null;
    }

    public void setPromotionListener(IPromotionListener promotionListener) {
        this.promotionListener = promotionListener;
    }

    private void setupTeam(ChessTeam team, char mainRow, char pawnRow) {
    	
    	board.setPiece(team.getUnusedPiece(PieceType.ROOK), new Location(mainRow, 'a'));
    	board.setPiece(team.getUnusedPiece(PieceType.KNIGHT), new Location(mainRow, 'b'));
    	board.setPiece(team.getUnusedPiece(PieceType.BISHOP), new Location(mainRow, 'c'));
    	board.setPiece(team.getUnusedPiece(PieceType.QUEEN), new Location(mainRow, 'd'));
    	board.setPiece(team.getUnusedPiece(PieceType.KING), new Location(mainRow, 'e'));
    	board.setPiece(team.getUnusedPiece(PieceType.BISHOP), new Location(mainRow, 'f'));
    	board.setPiece(team.getUnusedPiece(PieceType.KNIGHT), new Location(mainRow, 'g'));
    	board.setPiece(team.getUnusedPiece(PieceType.ROOK), new Location(mainRow, 'h'));
		for (int i = 0; i < ChessBoard.NUMBER_OF_COLUMNS; i++) {
	    	board.setPiece(team.getUnusedPiece(PieceType.PAWN), new Location(pawnRow, 'a'+i));
		}
    }

    private PieceDescription getPieceDescription(Location location) {
        ChessPiece piece = board.getPiece(location);
        TeamColor teamColor = lightTeam.containsPiece(piece) ? TeamColor.LIGHT : TeamColor.DARK;
        PieceDescription pieceDescription = new PieceDescription(teamColor, piece.hasMoved(), piece.getType());
        return pieceDescription;
    }

    private boolean causesCheck(MoveDescription moveDescription) {
        boolean canAttackKing = false;
        Location kingLocation = getCurrentTeamsKingLocation();

        makeMove(moveDescription);

        Enumeration<Move> possibleMoves = getPossibleMoves();
        while (possibleMoves.hasMoreElements() && !canAttackKing) {
            Move move = possibleMoves.nextElement();
            canAttackKing = (move.getTo().equals(kingLocation));
        }

        unMakeMove();
        return canAttackKing;
    }
    
    private ChessTeam getCurrentTeam() {
    	return (currentTeamColor == TeamColor.LIGHT)? lightTeam: darkTeam;
    }

    private Location getCurrentTeamsKingLocation() {
        ChessPiece king = getCurrentTeam().getUsedPiece(PieceType.KING);
        Location location = null;
        for (int row = 0; (row < ChessBoard.NUMBER_OF_ROWS) && (location == null); row++) {
            for (int col = 0; (col < ChessBoard.NUMBER_OF_COLUMNS) && (location == null); col++) {
            	Location currentLocation = new Location(row, col);
            	if (board.getPiece(currentLocation) == king) {
            		location = currentLocation;
            	}
            }
        }
        return location;
    }

    private boolean isPawnPromotion(Move move) {
        // TOOD:
    	return false;
    }

    private Location getCastleRookLocation(Move move) {
    	Location rookLocation = null;
    	
    	King king = getPieceTypeAt(move.getFrom(), King.class);
    	if (king != null && (!king.hasMoved() && isTwoHorizontalSpace(move))){
    		Location tempRookLocation = suggestCastlingRookLocation(move);
    		Rook rook = getPieceTypeAt(tempRookLocation, Rook.class);
    		if(rook != null && !rook.hasMoved() && !board.piecesInPath(new Move(move.getFrom(),tempRookLocation)) && !isKingInCheckDuringMove(move) ){
    			rookLocation = tempRookLocation;	
    		}
    	}
        return rookLocation;
    }
    
    private boolean isKingInCheckDuringMove(Move move) {
    	boolean willBeInCheck = false;
    	Iterator<Location> locations = move.getMoveLocations();
    	ChessTeam otherTeam = currentTeamColor == TeamColor.LIGHT ? darkTeam : lightTeam;
    	while(locations.hasNext() && !willBeInCheck) {
    		Location location = locations.next(); 
   			willBeInCheck = canAttack(otherTeam, location);
    	}
    	return willBeInCheck;
	}
    
    private boolean isLegalMove(Move move) {
    	return !board.piecesInPath(move) && targetLocationIsEmptyOrEnemy(move.getTo());
    }

	private boolean targetLocationIsEmptyOrEnemy(Location location) {
		ChessTeam otherTeam = currentTeamColor == TeamColor.LIGHT ? darkTeam : lightTeam;
		return board.getPiece(location) == null || otherTeam.containsPiece(board.getPiece(location));
	}

	private boolean canAttack(ChessTeam otherTeam, Location location) {
		boolean canBeAttacked = false;
		
		Iterator<Move> moves = getLegalMoves(otherTeam);
		while(moves.hasNext() && !canBeAttacked) {
			Move move = moves.next();
			canBeAttacked = move.getTo().equals(location);
    	}
		return canBeAttacked;
	}

	private Iterator<Move> getLegalMoves(ChessTeam otherTeam) {
		List<Move> legalMoves = new ArrayList<Move>();
		Iterator<Move> possibleMoves = otherTeam.getPossibleMoves();
		for (Move move = possibleMoves.next(); possibleMoves.hasNext();) {
			ChessPiece piece = board.getPiece(move.getFrom());
			if(piece.isCapturingMove(move) && isLegalMove(move)) {
				legalMoves.add(move);
			}
		}
		return legalMoves.iterator();
	}

	@SuppressWarnings("unchecked")
	private <T extends ChessPiece> T getPieceTypeAt (Location location, Class<T> cls) {
    	T returnedPiece = null;
    	ChessPiece piece = board.getPiece(location);
    	if ((piece != null) && (piece.getClass().equals(cls))) {
    		returnedPiece = (T) piece;
    	}
    	return returnedPiece;
    }

    private Location suggestCastlingRookLocation(Move move) {
    	return new Location(move.getFrom().getRow(), move.horizontalDistance() > 0 ? 7 : 0);
	}

	private boolean isTwoHorizontalSpace(Move move) {
		return move.isHorizontal() && (Math.abs(move.horizontalDistance()) == 2);
	}

	private Location getEnPassantLocation(Move move) {
		// TODO Auto-generated method stub
        return null;
    }

    public boolean isCaptureMove(Move move) {
    	// TODO Auto-generated method stub
        return false;
    }
}