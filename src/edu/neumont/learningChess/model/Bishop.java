package edu.neumont.learningChess.model;

import java.util.Enumeration;

import edu.neumont.learningChess.api.Location;
import edu.neumont.learningChess.api.PieceType;

public class Bishop extends ChessPiece{
	
	
	public Bishop(){
		type = PieceType.BISHOP;
	}


	@Override
	public Enumeration<Location> getLegalMoves(ChessBoard board, Location loc) {
		// TODO: finish this method
		return null;
	}

}
