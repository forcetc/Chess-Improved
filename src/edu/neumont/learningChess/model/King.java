package edu.neumont.learningChess.model;

import java.util.Enumeration;

import edu.neumont.learningChess.api.Location;
import edu.neumont.learningChess.api.PieceType;

public class King extends ChessPiece {

	public King() {
		type = PieceType.KING;
	}

	@Override
	public Enumeration<Location> getLegalMoves(ChessBoard board) {
		// TODO: finish this method
		return null;
	}

}
