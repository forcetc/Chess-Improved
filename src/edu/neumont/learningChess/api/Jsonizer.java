package edu.neumont.learningChess.api;

import com.google.gson.Gson;


public class Jsonizer {
	
	static Gson gson = new Gson();
	
	public static String jsonize(ChessGameState gameState){
		String jsonizedGameStateString = gson.toJson(gameState);		
		return jsonizedGameStateString;
	}
	
	public static ChessGameState deJsonize(String jsonString) {
		ChessGameState gameState = gson.fromJson(jsonString, ChessGameState.class);
		return gameState;
	}
	
}
