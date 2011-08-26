package edu.neumont.learningChess.model;

import java.util.Enumeration;

import edu.neumont.learningChess.api.Location;
import edu.neumont.learningChess.api.PieceType;

public class Pawn extends ChessPiece {
	
	
	public Pawn() {
		type = PieceType.PAWN;
	}

	@Override
	public Enumeration<Location> getLegalMoves(ChessBoard board, Location loc) {
		// TODO Auto-generated method stub
		return null;
	}

}
