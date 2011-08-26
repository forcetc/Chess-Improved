package edu.neumont.learningChess.model;

import java.util.Iterator;

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

	public boolean piecesInPath(Move move) {
		boolean piecesPresent = false;
		Iterator<Location> locatons = move.getMoveLocations();
		while(locatons.hasNext() && !piecesPresent)
		{
			if(getPiece(locatons.next())!= null)
				piecesPresent = true;
		}
		return piecesPresent;
	}

	public static boolean isValidLocation(Location location) {
		return (location.getRow() >= 0 && location.getRow() < ChessBoard.NUMBER_OF_ROWS)
				&& (location.getColumn() >= 0 && location.getColumn() < ChessBoard.NUMBER_OF_COLUMNS);
	}
}
