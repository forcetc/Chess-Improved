package edu.neumont.learningChess.api;

public class ChessGameState {
	public PieceDescription getPieceDescription(Location location) {
		return null;
	}
	public void setPieceDescription(Location location, PieceDescription pieceDescription){}
	public TeamColor getMovingTeamColor(){
		return null;
	}
	public void setMovingTeamColor(TeamColor teamColor){}
	public MoveDescription getMoveDescription(){
		return null;
	}
	public void setMoveDescription(MoveDescription moveDescription){}
	public byte[] serialize(){
		return null;
	}
	public void deserialize(byte[] buffer){}
}
