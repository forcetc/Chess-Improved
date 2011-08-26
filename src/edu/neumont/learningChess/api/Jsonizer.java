package edu.neumont.learningChess.api;

import com.google.gson.Gson;


public class Jsonizer {
	
	static Gson gson = new Gson();
	
	public static String toJson(ChessGame game){
		String result = gson.toJson(game);		
		return result;
	}
	
	public static ChessGameState fromJson(String jsonString) {
		ChessGameState gameState = gson.fromJson(jsonString, ChessGameState.class);
		return gameState;
	}
	
}
