package edu.neumont.learningChess.api;

import java.util.Arrays;


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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mostRecentMoveDescription == null) ? 0 : mostRecentMoveDescription.hashCode());
		result = prime * result + ((movingTeamColor == null) ? 0 : movingTeamColor.hashCode());
		result = prime * result + Arrays.hashCode(pieceDescriptions);
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ChessGameState other = (ChessGameState) obj;
		if (mostRecentMoveDescription == null) {
			if (other.mostRecentMoveDescription != null) {
				return false;
			}
		} else if (!mostRecentMoveDescription.equals(other.mostRecentMoveDescription)) {
			return false;
		}
		if (movingTeamColor != other.movingTeamColor) {
			return false;
		}
		if (!Arrays.equals(pieceDescriptions, other.pieceDescriptions)) {
			return false;
		}
		return true;
	}
	
	

			
}
