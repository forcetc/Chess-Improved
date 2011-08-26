package edu.neumont.learningChess.api;


public class ChessGameState {

	private MoveDescription mostRecentMoveDescription;
	private TeamColor movingTeamColor;
	private static final int NUMBER_ROWS = 8;
	private static final int NUMBER_COLS = 8;
	private final PieceDescription[][] pieceDescriptions;
	
	public ChessGameState() {
		pieceDescriptions = new PieceDescription[NUMBER_ROWS][NUMBER_COLS];
	}

	public PieceDescription getPieceDescription(Location location) {
		return pieceDescriptions[location.getRow()][location.getColumn()];
	}

	public void setPieceDescription(Location location, PieceDescription pieceDescription) {
		pieceDescriptions[location.getRow()][location.getColumn()] = pieceDescription;
	}

	public TeamColor getMovingTeamColor() {
		return movingTeamColor;
	}

	public void setMovingTeamColor(TeamColor movingTeamColor) {
		this.movingTeamColor = movingTeamColor;
	}

	public MoveDescription getMostRecentMoveDescription() {
		return mostRecentMoveDescription;
	}

	public void setMostRecentMoveDescription(MoveDescription mostRecentMoveDescription) {
		this.mostRecentMoveDescription = mostRecentMoveDescription;
	}

			
}
