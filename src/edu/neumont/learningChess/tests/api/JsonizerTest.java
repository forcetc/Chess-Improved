package edu.neumont.learningChess.tests.api;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.neumont.learningChess.api.ChessGameState;
import edu.neumont.learningChess.api.Jsonizer;
import edu.neumont.learningChess.api.TeamColor;

public class JsonizerTest {
	
	@Test
	public void testJsonizer() {
		ChessGameState gameState = new ChessGameState();
		gameState.setMovingTeamColor(TeamColor.LIGHT);
		String initialJsonResult = Jsonizer.jsonize(gameState);
		ChessGameState fromJsonState = Jsonizer.deJsonize(initialJsonResult);
		String secondJsonResult = Jsonizer.jsonize(fromJsonState);
		assertEquals(gameState,fromJsonState);
	}

	@Test
	public void testDeJsonizer() {
		fail();
	}
}
