package edu.neumont.learningChess.model;

import java.util.Enumeration;
import java.util.Vector;

import edu.neumont.learningChess.api.Location;
import edu.neumont.learningChess.api.PieceType;

public class Knight extends ChessPiece {

	public Knight() {
		type = PieceType.KNIGHT;
	}

	@Override
	public Enumeration<Location> getLegalMoves(ChessBoard board, Location loc) {

		Enumeration<Location> moves;
		//
		
		
		ChessPiece cp = board.getPiece(loc);
		
		if (cp.type == PieceType.KNIGHT){
		int col = loc.getColumn();
		int row = loc.getRow();
		
		
		Vector<Location> balls = new Vector<Location>();
		Location one = new Location(row+2, col+1);
		Location two = new Location(row+2, col-1);
		Location three = new Location(row-2, col+1);
		Location four = new Location(row-2, col-1);
		Location five = new Location(row-1, col+2);
		Location six = new Location(row-1, col-2);
		Location seven = new Location(row+1, col+2);
		Location eight = new Location(row+1, col-2);
		
		
		
		//off the board
		
		for(Location l : balls){
			if (!board.isValidLocation(balls)){
				balls.remove(l);
			}
		}
		
		moves = balls.elements();
		return moves;
		}
	}
}