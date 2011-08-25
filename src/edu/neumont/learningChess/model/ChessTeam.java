package edu.neumont.learningChess.model;

import java.util.List;

import edu.neumont.learningChess.api.PieceType;
import edu.neumont.learningChess.api.TeamColor;

public class ChessTeam {
	TeamColor color;
	List<ChessPiece> unusedChessPieces;
	List<ChessPiece> usedChessPieces;

	@SuppressWarnings("unused")
	public ChessPiece getUnusedPiece(PieceType type) {
		for (ChessPiece piece : unusedChessPieces) {
			
		}
		return null;
	}

	public ChessPiece getUsedPiece(PieceType type) {
		//TODO make method body
		return null;
	}

}
