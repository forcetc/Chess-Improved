package edu.neumont.learningChess.model;

import java.util.Enumeration;

import edu.neumont.learningChess.api.Location;
import edu.neumont.learningChess.api.PieceType;

public class Knight extends ChessPiece{

	public Knight(){
		type = PieceType.KNIGHT;
	}

	@Override
	public Enumeration<Location> getLegalMoves(ChessBoard board) {
		// TODO Auto-generated method stub
		return null;
	}

}
