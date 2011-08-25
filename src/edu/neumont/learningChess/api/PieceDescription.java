package edu.neumont.learningChess.api;

public class PieceDescription {
	
	private TeamColor color;
	private boolean hasMoved;
	private PieceType pieceType;

	public PieceDescription(TeamColor color, boolean hasMoved, PieceType pieceType) {
		this.color = color;
		this.hasMoved = hasMoved;
		this.pieceType = pieceType;
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
