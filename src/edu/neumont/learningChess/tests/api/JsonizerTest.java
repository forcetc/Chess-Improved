package edu.neumont.learningChess.tests.api;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;

import edu.neumont.learningChess.api.ChessGameState;
import edu.neumont.learningChess.api.Jsonizer;
import edu.neumont.learningChess.api.TeamColor;

public class JsonizerTest {
	
	String fromJsonTestString = "";
	@Before
	public void init(){
		
	}

	@Test
	public void testToJson() {
		ChessGameState gameState = new ChessGameState();
		gameState.setMovingTeamColor(TeamColor.LIGHT);
		String initialJsonResult = Jsonizer.toJson(gameState);
		ChessGameState fromJsonState = Jsonizer.fromJson(initialJsonResult);
		String secondJsonResult = Jsonizer.toJson(fromJsonState);
		assertEquals(initialJsonResult, secondJsonResult);
	}

	@Test
	public void testFromJson() {
		
		
	}
}
