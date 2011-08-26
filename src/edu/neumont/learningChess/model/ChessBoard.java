package edu.neumont.learningChess.model;

import edu.neumont.learningChess.api.Location;
import edu.neumont.learningChess.api.Move;

public class ChessBoard {

	public static final int NUMBER_OF_ROWS = 8;
	public static final int NUMBER_OF_COLUMNS = 8;
	private ChessPiece grid[][] = new ChessPiece[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];

	public ChessPiece getPiece(Location location) {
		return grid[location.getRow()][location.getColumn()];
	}

	public void setPiece(ChessPiece piece, Location location) {
		grid[location.getRow()][location.getColumn()] = piece;
	}

//	public boolean piecesInPath(Move move) {
//		boolean piecesPresent = false;
//
//		int vertical = move.verticalDistance();
//		int horizontal = move.horizontalDistance();
//		int verticalStep = vertical / Math.abs(vertical);
//		int horizontalStep = horizontal / Math.abs(horizontal);
//
//		int movetype = 0; // 1 vertical, 2 horizontal, 3 diagonal
//
//		if ((vertical != 0) && (horizontal == 0)) {
//			movetype = 1;
//		} else if ((vertical == 0) && (horizontal != 0)) {
//			movetype = 2;
//		} else if ((vertical != 0) && (horizontal != 0)) {
//			movetype = 3;
//		}
//		Location fromLocation = move.getFrom();
//		
//		if (movetype == 1) {
//			for (int i = fromLocation.getRow(); (i < vertical*verticalStep) || (i > vertical*verticalStep); i+=verticalStep) 
//			{
//				piecesPresent = this.getPiece(new Location(i, fromLocation.getColumn()))!= null;
//			}
//		}else if (movetype == 2) {
//			for (int i = fromLocation.getColumn(); (i < horizontal*horizontalStep) || (i > horizontal*horizontalStep); i+=horizontalStep) 
//			{
//				piecesPresent = this.getPiece(new Location(fromLocation.getRow(), i))!= null;
//			}
//		}else if (movetype == 3) {
//			for (int i = fromLocation.getRow(), j= fromLocation.getColumn(); (i < vertical*verticalStep) || (i > vertical*verticalStep); i+=verticalStep, j+=horizontalStep) 
//			{
//				piecesPresent = this.getPiece(new Location(i, j))!= null;
//			}
//		}
//
//		return piecesPresent;
//		
//		
//		// if (vertical == 0) {
//		// for (int col = move.getFrom().getColumn() + horizontalStep; col <
//		// move.getTo().getColumn() - horizontalStep; col += horizontalStep) {
//		// Location location = new Location(move.getFrom().getRow(), col);
//		// piecesPresent = (this.getPiece(location) != null);
//		// }
//		// } else if (horizontal == 0) {
//		// for (int row = move.getFrom().getRow() + verticalStep; row <
//		// move.getTo().getRow() - verticalStep; row += verticalStep) {
//		// Location location = new Location(row, move.getFrom().getColumn());
//		// piecesPresent = (this.getPiece(location) != null);
//		// }
//		// } else if (Math.abs(vertical) == Math.abs(horizontal)){
//		// for (int row = move.getFrom().getRow() + verticalStep; row <
//		// move.getTo().getRow() - verticalStep; row += verticalStep) {
//		// for (int col = move.getFrom().getColumn() + horizontalStep; col <
//		// move.getTo().getColumn() - horizontalStep; col += horizontalStep) {
//		// Location location = new Location(row, col);
//		// piecesPresent = (this.getPiece(location) != null);
//		// }
//		// }
//		// }
//	}

	public boolean isValidLocation(Location location) {
		return (location.getRow() >= 0 && location.getRow() < ChessBoard.NUMBER_OF_ROWS)
				&& (location.getColumn() >= 0 && location.getColumn() < ChessBoard.NUMBER_OF_COLUMNS);
	}
}
