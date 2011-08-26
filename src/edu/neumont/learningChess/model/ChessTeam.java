package edu.neumont.learningChess.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.neumont.learningChess.api.Move;
import edu.neumont.learningChess.api.PieceType;
import edu.neumont.learningChess.api.TeamColor;

public class ChessTeam {
	TeamColor color;
	List<ChessPiece> unusedChessPieces;
	List<ChessPiece> usedChessPieces;

	public ChessPiece getUnusedPiece(PieceType type) {
		ChessPiece piece = null;

		for (int i = 0; i < unusedChessPieces.size() && piece == null; i++) {
			ChessPiece chessPiece = unusedChessPieces.get(i);
			if (chessPiece.getType() == type) {
				piece = chessPiece;
			}
		}
		return piece;
	}

	public ChessPiece getUsedPiece(PieceType type) {
		ChessPiece piece = null;
		for (int i = 0; i < usedChessPieces.size() && piece == null; i++) {
			ChessPiece chessPiece = usedChessPieces.get(i);
			if (chessPiece.getType() == type) {
				piece = chessPiece;
			}
		}
		return piece;
	}

	public boolean containsPiece(ChessPiece chessPiece) {
		ChessPiece piece = null;
		for (int i = 0; i < unusedChessPieces.size() && piece == null; i++) {
			piece = unusedChessPieces.get(i);
			if (chessPiece.equals(piece)) {
				piece = chessPiece;
			}
		}
		for (int i = 0; i < usedChessPieces.size() && piece == null; i++) {
			piece = usedChessPieces.get(i);
			if (chessPiece.equals(piece)) {
				piece = chessPiece;
			}
		}
		return piece!=null;
	}

	public Iterator<Move> getPossibleMoves() 
	{
		List<Move> allPossibleMoves = new ArrayList<Move>();
		for (ChessPiece piece : usedChessPieces) {
			allPocibleMoves.addAll(piece.getPossibleMoves());
		}
		return allPossibleMoves.iterator();
	}
}
