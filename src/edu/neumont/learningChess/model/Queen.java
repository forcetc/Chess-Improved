package edu.neumont.learningChess.model;

import java.util.Enumeration;
import java.util.Vector;

import edu.neumont.learningChess.api.Location;
import edu.neumont.learningChess.api.PieceType;

public class Queen extends ChessPiece {

	public Queen() {
		type = PieceType.QUEEN;
	}

	@Override
	public Enumeration<Location> getLegalMoves(ChessBoard board, Location location) {
		Vector<Location> possibleMoves = new Vector<Location>();
		ChessPiece chessPiece = board.getPiece(location);
		
		if(chessPiece.type == PieceType.QUEEN) {
			int column = location.getColumn();
			int row = location.getRow();
			
			//x,-x,y,-y,y=x,y=-x
			
		
			//straight rows
			for (int i = 1; i<8; i++){
				
				Location n = new Location(row - i, column - i);
				

			}
			
			
			
			//diagonals
		}
		
		
		
		

		return null;
	}

}
