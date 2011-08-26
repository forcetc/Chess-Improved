package edu.neumont.learningChess.api;

import java.util.ArrayList;
import java.util.List;

import edu.neumont.learningChess.model.ChessBoard;
import edu.neumont.learningChess.model.ChessPiece;

public class ChessGameState {

	private MoveDescription mostRecentMoveDescription;
	private TeamColor movingTeamColor;
	private ChessBoard chessBoard;
	private final ChessGame chessGame;
	private static final int NUMBER_ROWS = 8;
	private static final int NUMBER_COLS = 8;
	private PieceDescription[][] pieceDescriptions;
	
	public ChessGameState(ChessBoard chessBoard, ChessGame chessGame) {
		this.chessBoard=chessBoard;
		this.chessGame = chessGame;
		pieceDescriptions = new PieceDescription[NUMBER_ROWS][NUMBER_COLS];
	}

	public PieceDescription getPieceDescription(Location location) {
		return pieceDescriptions[location.getRow()][location.getColumn()];
	}

	public void setPieceDescription(Location location, PieceDescription pieceDescription) {
		pieceDescriptions[location.getRow()][location.getColumn()] = pieceDescription;
	}

	public TeamColor getMovingTeamColor() {
		return movingTeamColor;
	}

	public void setMovingTeamColor(TeamColor movingTeamColor) {
		this.movingTeamColor = movingTeamColor;
	}

	public MoveDescription getMostRecentMoveDescription() {
		return mostRecentMoveDescription;
	}

	public void setMostRecentMoveDescription(MoveDescription mostRecentMoveDescription) {
		this.mostRecentMoveDescription = mostRecentMoveDescription;
	}

	public byte[] serialize() {
		byte[] buffer = new byte[32];
		// TODO: finish this method
		return buffer;
	}

	public void deserialize(byte[] buffer) {
//		List<Integer> metaValues = new ArrayList<Integer>();
		NibbleBoard board = new NibbleBoard(buffer);
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				int value = board.get(row, col);
//				if(value == 1 || value == 2) // if the value is 1 or 2 then its a MetaBoard value.
//				{
//					metaValues.add(value);
//				}
				ChessPiece piece = chessBoard.getPiece(new Location(row,col));
				if(piece != null) {
					TeamColor pieceColor = null;
					// TODO: Get the color
					boolean pieceHasMoved = piece.hasMoved();
					PieceType pieceType = piece.getType();
					this.pieceDescriptions[row][col] = new PieceDescription(pieceColor,pieceHasMoved,pieceType );
				}
			}
		}
//		setMetaBoardValues(metaValues);
	}

//	private void setMetaBoardValues(List<Integer> metaValues) {
//		// TODO Auto-generated method stub
//		
//	}
}
