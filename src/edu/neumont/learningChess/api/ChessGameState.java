package edu.neumont.learningChess.api;

import edu.neumont.learningChess.model.ChessBoard;
import edu.neumont.learningChess.model.ChessPiece;

public class ChessGameState {

	private MoveDescription moveDescription;
	private TeamColor teamColor;
	private ChessBoard chessBoard;
	
	public ChessGameState(ChessBoard chessBoard) {
		this.chessBoard=chessBoard;
	}

	public PieceDescription getPieceDescription(Location location) {
		ChessPiece piece = chessBoard.getPiece(location);
		// TODO: figure out the piece color
		TeamColor pieceColor = null;
		boolean pieceHasMoved = piece.hasMoved();
		PieceType pieceType = piece.getType();
		PieceDescription description = new PieceDescription(pieceColor, pieceHasMoved, pieceType);
		return description;
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
