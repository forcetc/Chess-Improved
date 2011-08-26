package edu.neumont.learningChess.api;

import edu.neumont.learningChess.model.ChessBoard;
import edu.neumont.learningChess.model.ChessPiece;
import edu.neumont.learningChess.model.ChessTeam;
import edu.neumont.learningChess.model.MoveHistory;

import java.util.Enumeration;

public class ChessGame {
	
	private ChessBoard board = new ChessBoard();
	private ChessTeam lightTeam = new ChessTeam();
	private ChessTeam darkTeam = new ChessTeam();
	private MoveHistory moveHistory = new MoveHistory();


    public ChessGame() {
        // TODO: finish this method

    }

    public ChessGame(ChessGameState gameState) {
        for (int row = 0; row < ChessBoard.NUMBER_OF_ROWS; row++) {
            for (int col = 0; col < ChessBoard.NUMBER_OF_COLUMNS; col++) {
                Location location = new Location(row, col);
                PieceDescription pieceDescription = gameState.getPieceDescription(location);
                TeamColor currentTeamColor;

                ChessPiece piece = (pieceDescription.getColor() == TeamColor.LIGHT) ?
                        lightTeam.getUnusedPiece(pieceDescription.getPieceType())
                        : darkTeam.getUnusedPiece(pieceDescription.getPieceType());

                board.setPiece(piece, location);
                piece.setHasMoved(true);

                currentTeamColor = gameState.getMovingTeamColor();
                moveHistory.push(gameState.getMostRecentMoveDescription());
            }

        }
        // TODO: finish this method

    }

    public ChessGameState getGameState() {


        //TODO:
        return null;
    }

    public MoveDescription getMoveDescription(Move move) {

        MoveDescription moveDescription = new MoveDescription(move);
        ChessPiece piece = board.getPiece(move.getFrom());

        if (piece != null && piece.isPossibleMove(move) && !piecesInPath(move)) {
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

    private Location getCurrentTeamsKingLocation() {

        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private boolean isPawnPromotion(Move move) {
        return false;
    }

    private boolean piecesInPath(Move move) {
        return false;
    }

    private Location getCastleRookLocation(Move move) {

        return null;
    }

    private Location getEnPassantLocation(Move move) {
        return null;
    }

    public boolean isCaptureMove(Move move) {
        return false;
    }


}
