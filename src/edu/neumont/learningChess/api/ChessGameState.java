package edu.neumont.learningChess.api;

import edu.neumont.learningChess.model.ChessBoard;

public class ChessGameState {

	private MoveDescription moveDescription;
	private TeamColor teamColor;
	private ChessBoard chessBoard;
	
	public ChessGameState(ChessBoard chessBoard) {
		this.chessBoard=chessBoard;
	}

	public PieceDescription getPieceDescription(Location location) {
		PieceDescription description = new PieceDescription(null, false, null);
		description;
		return null;
	}

	public void setPieceDescription(Location location, PieceDescription pieceDescription) {

	}

	public TeamColor getMovingTeamColor() {
		return teamColor;
	}

	public void setMovingTeamColor(TeamColor teamColor) {
		this.teamColor = teamColor;
	}

	public MoveDescription getMoveDescription() {
		return moveDescription;
	}

	public void setMoveDescription(MoveDescription moveDescription) {
		this.moveDescription = moveDescription;
	}

	public byte[] serialize() {
		return null;
	}

	public void deserialize(byte[] buffer) {

	}
}
