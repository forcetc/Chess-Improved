package edu.neumont.learningChess.api;

public class PieceDescription {
	
	private TeamColor color;
	private boolean hasMoved;
	private PieceType pieceType;

	public PieceDescription() {
		// TODO Auto-generated constructor stub
	}
	
	public TeamColor getColor() {
		return color;
	}

	public boolean isHasMoved() {
		return hasMoved;
	}
	
	public PieceType getPieceType() {
		return pieceType;
	}
}
