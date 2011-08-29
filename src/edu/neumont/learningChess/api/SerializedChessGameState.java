package edu.neumont.learningChess.api;

import java.util.ArrayList;
import java.util.List;

public class SerializedChessGameState {
	
	private static final int NUMBER_ROWS = 8;
	private static final int NUMBER_COLS = 8;
	public static byte[] serialize(ChessGameState chessGameState) {
		// TODO: finish this method
		byte[] serialized = new byte[32];
		
		return serialized;
	}
	
	public static ChessGameState deserialize(byte[] buffer) {
		// TODO: finish this method
		ChessGameState chessGameState = new ChessGameState();
		NibbleBoard nibbleBoard= new NibbleBoard(buffer);
		List<Integer> metaValues = new ArrayList<Integer>();
		for (int row = 0; row < NUMBER_ROWS; row++) {
			for (int col = 0; col < NUMBER_COLS; col++) {
				int value = nibbleBoard.get(row, col);
				
			}
		}
		return chessGameState;
	}
	
//	public byte[] serialize() {
//		byte[] buffer = new byte[32];
//		// TODO: finish this method
//		return buffer;
//	}
//
//	public void deserialize(byte[] buffer) {
////		List<Integer> metaValues = new ArrayList<Integer>();
//		NibbleBoard board = new NibbleBoard(buffer);
//		for (int row = 0; row < 8; row++) {
//			for (int col = 0; col < 8; col++) {
//				int value = board.get(row, col);
////				if(value == 1 || value == 2) // if the value is 1 or 2 then its a MetaBoard value.
////				{
////					metaValues.add(value);
////				}
//				ChessPiece piece = chessBoard.getPiece(new Location(row,col));
//				if(piece != null) {
//					TeamColor pieceColor = null;
//					// TODO: Get the color
//					boolean pieceHasMoved = piece.hasMoved();
//					PieceType pieceType = piece.getType();
//					this.pieceDescriptions[row][col] = new PieceDescription(pieceColor,pieceHasMoved,pieceType );
//				}
//			}
//		}
////		setMetaBoardValues(metaValues);
//	}
//
////	private void setMetaBoardValues(List<Integer> metaValues) {
////		// TODO Auto-generated method stub
////		
////	}
	
	
}
