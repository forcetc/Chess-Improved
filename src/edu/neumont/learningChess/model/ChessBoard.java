package edu.neumont.learningChess.model;

import edu.neumont.learningChess.api.Location;

public class ChessBoard {

	public static final int NUMBER_OF_ROWS = 8;
	public static final int NUMBER_OF_COLUMNS = 8;
	private ChessPiece grid[][] = new ChessPiece[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
	
	public ChessPiece getPiece(Location location) 
	{
		return grid[location.getRow()][location.getColumn()];
	}
	
	public void setPiece(ChessPiece piece, Location location) {
		grid[location.getRow()][location.getColumn()] = piece;
	}

}
