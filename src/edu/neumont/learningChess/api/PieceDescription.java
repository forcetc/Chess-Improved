package edu.neumont.learningChess.api;

public class PieceDescription {
	
	private final TeamColor teamColor;
	private final boolean hasMoved;
	private final PieceType pieceType;

	public PieceDescription(TeamColor teamColor, boolean hasMoved, PieceType pieceType) {
		this.teamColor = teamColor;
		this.hasMoved = hasMoved;
		this.pieceType = pieceType;
	}
	
	public TeamColor getColor() {
		return teamColor;
	}

	public boolean isHasMoved() {
		return hasMoved;
	}
	
	public PieceType getPieceType() {
		return pieceType;
	}
}
