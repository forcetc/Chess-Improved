package edu.neumont.learningChess.api;

public class PieceDescription {
	
	private TeamColor color;
	private boolean hasMoved;
	private PieceType pieceType;

<<<<<<< HEAD
	public PieceDescription(TeamColor color, boolean hasMoved, PieceType pieceType) {
		this.color = color;
		this.hasMoved = hasMoved;
		this.pieceType = pieceType;
=======
	public PieceDescription() {
		// TODO Auto-generated constructor stub
>>>>>>> 42a1ae5fc85c3564b02ba0367df467f24e59013b
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
