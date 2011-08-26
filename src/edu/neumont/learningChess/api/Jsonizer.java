package edu.neumont.learningChess.api;

import com.google.gson.Gson;


public class Jsonizer {
	
	static Gson gson = new Gson();
	
	public static String toJson(ChessGameState gameState){
		String result = gson.toJson(gameState);		
		return result;
	}
	
	public static ChessGameState fromJson(String jsonString) {
		ChessGameState gameState = gson.fromJson(jsonString, ChessGameState.class);
		return gameState;
	}
	
}
