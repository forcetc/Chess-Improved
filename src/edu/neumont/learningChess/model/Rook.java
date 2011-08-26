package edu.neumont.learningChess.model;

import java.util.Enumeration;

import edu.neumont.learningChess.api.Location;
import edu.neumont.learningChess.api.PieceType;

public class Rook extends ChessPiece {
	
	public Rook() {
		type = PieceType.ROOK;
	}
	@Override
	public Enumeration<Location> getLegalMoves(ChessBoard board, Location loc) {
		// TODO Auto-generated method stub
		return null;
	}

}
