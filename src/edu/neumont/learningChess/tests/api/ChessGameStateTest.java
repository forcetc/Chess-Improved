package edu.neumont.learningChess.tests.api;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.neumont.learningChess.api.ChessGameState;
import edu.neumont.learningChess.api.Location;
import edu.neumont.learningChess.api.Move;
import edu.neumont.learningChess.api.MoveDescription;
import edu.neumont.learningChess.api.PieceDescription;
import edu.neumont.learningChess.api.TeamColor;

public class ChessGameStateTest {

	@Test
	public void testGetAndSetPieceDescription() {
		ChessGameState chessGameState = new ChessGameState();
		
		PieceDescription firstPieceDescription = new PieceDescription(null, false, null);
		Location firstLocation = new Location(0,0);
		chessGameState.setPieceDescription(firstLocation, firstPieceDescription);
		assertTrue(chessGameState.getPieceDescription(firstLocation).equals(firstPieceDescription));
	}

	@Test
	public void testGetAndSetMovingTeamColor() {
		ChessGameState chessGameState = new ChessGameState();
		
		TeamColor firstTeamColor = TeamColor.LIGHT;
		chessGameState.setMovingTeamColor(firstTeamColor);
		assertTrue(chessGameState.getMovingTeamColor().equals(firstTeamColor));
	}

	@Test
	public void testGetAndSetMostRecentMoveDescription() {
		ChessGameState chessGameState = new ChessGameState();
		
		MoveDescription firstMoveDescription = new MoveDescription(new Move(new Location(1,2),new Location(3,4)));
		chessGameState.setMostRecentMoveDescription(firstMoveDescription);
		assertTrue(chessGameState.getMostRecentMoveDescription().equals(firstMoveDescription));
	}

}