package edu.neumont.learningChess.tests.api;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.neumont.learningChess.api.ChessGameState;
import edu.neumont.learningChess.api.Jsonizer;
import edu.neumont.learningChess.api.TeamColor;

public class JsonizerTest {
	
	@Test
	public void testToJson() {
		ChessGameState gameState = new ChessGameState();
		gameState.setMovingTeamColor(TeamColor.LIGHT);
		String initialJsonResult = Jsonizer.toJson(gameState);
		ChessGameState fromJsonState = Jsonizer.fromJson(initialJsonResult);
		String secondJsonResult = Jsonizer.toJson(fromJsonState);
		assertEquals(gameState,fromJsonState);
	}

	@Test
	public void testFromJson() {
		fail();
	}
}
