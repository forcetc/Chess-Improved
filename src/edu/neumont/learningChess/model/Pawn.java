package edu.neumont.learningChess.model;

import java.util.Enumeration;
import java.util.Vector;

import edu.neumont.learningChess.api.Location;
import edu.neumont.learningChess.api.PieceType;

public class Pawn extends ChessPiece {
	
	
	public Pawn() {
		type = PieceType.PAWN;
	}
	

	@Override
	public Enumeration<Location> getLegalMoves(ChessBoard board, Location loc) {
		Vector<Location> balls = new Vector<Location>();

		ChessPiece cp = board.getPiece(loc);

		if (cp.type == PieceType.KNIGHT) {
			int col = loc.getColumn();
			int row = loc.getRow();
		}
		return null;
	}

}
