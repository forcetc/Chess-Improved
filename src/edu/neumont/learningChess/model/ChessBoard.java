package edu.neumont.learningChess.model;

import edu.neumont.learningChess.api.Location;
import edu.neumont.learningChess.api.Move;

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

    private boolean piecesInPath(Move move) {
    	boolean piecesPresent = false;
    	
    	int vertical = move.verticalDistance();
    	int horizontal = move.horizontalDistance();
		int verticalStep = vertical / Math.abs(vertical);
		int horizontalStep = horizontal / Math.abs(horizontal);
    	
    	if (vertical == 0) {
    		for (int col = move.getFrom().getColumn() + horizontalStep; col < move.getTo().getColumn() - horizontalStep; col += horizontalStep) {
    			Location location = new Location(move.getFrom().getRow(), col);
    			piecesPresent = (this.getPiece(location) != null);
    		}
    	} else if (horizontal == 0) {
    		for (int row = move.getFrom().getRow() + verticalStep; row < move.getTo().getRow() - verticalStep; row += verticalStep) {
    			Location location = new Location(row, move.getFrom().getColumn());
    			piecesPresent = (this.getPiece(location) != null);
    		}
    	} else if (Math.abs(vertical) == Math.abs(horizontal)){
    		for (int row = move.getFrom().getRow() + verticalStep; row < move.getTo().getRow() - verticalStep; row += verticalStep) {
        		for (int col = move.getFrom().getColumn() + horizontalStep; col < move.getTo().getColumn() - horizontalStep; col += horizontalStep) {
        			Location location = new Location(row, col);
        			piecesPresent = (this.getPiece(location) != null);
        		}
    		}
    	}
    	
        return piecesPresent;
    }
}
