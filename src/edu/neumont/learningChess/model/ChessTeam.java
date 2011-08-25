package edu.neumont.learningChess.model;

<<<<<<< HEAD
=======
import edu.neumont.learningChess.api.PieceType;
import edu.neumont.learningChess.api.TeamColor;
>>>>>>> 847cf876eb39f25664892f20681c70c865405dea

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
