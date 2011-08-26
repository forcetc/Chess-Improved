package edu.neumont.learningChess.model;

import java.util.Enumeration;
import java.util.Vector;

import edu.neumont.learningChess.api.Location;
import edu.neumont.learningChess.api.PieceType;

public class Knight extends ChessPiece {

	public Knight() {
		type = PieceType.KNIGHT;
	}

	@Override
	public Enumeration<Location> getLegalMoves(ChessBoard board, Location location) {

		Vector<Location> possibleMoves = new Vector<Location>();

		ChessPiece chessPiece = board.getPiece(location);

		if (chessPiece.getType() == PieceType.KNIGH7T) {
			int column = location.getColumn();
			int row = location.getRow();

			Location one = new Location(row + 2, column + 1);
			possibleMoves = checkLegalMoves(board.isValidLocation(one), one, possibleMoves);

			Location two = new Location(row + 2, column - 1);
			possibleMoves = checkLegalMoves(board.isValidLocation(two), two, possibleMoves);

			Location three = new Location(row - 2, column + 1);
			possibleMoves = checkLegalMoves(board.isValidLocation(three), three, possibleMoves);

			Location four = new Location(row - 2, column - 1);
			possibleMoves = checkLegalMoves(board.isValidLocation(four), four, possibleMoves);

			Location five = new Location(row - 1, column + 2);
			possibleMoves = checkLegalMoves(board.isValidLocation(five), five, possibleMoves);

			Location six = new Location(row - 1, column - 2);
			possibleMoves = checkLegalMoves(board.isValidLocation(six), six, possibleMoves);

			Location seven = new Location(row + 1, column + 2);
			possibleMoves = checkLegalMoves(board.isValidLocation(seven), seven, possibleMoves);

			Location eight = new Location(row + 1, column - 2);
			possibleMoves = checkLegalMoves(board.isValidLocation(eight), eight, possibleMoves);

			return possibleMoves.elements();

		}
		return possibleMoves.elements();
	}
}