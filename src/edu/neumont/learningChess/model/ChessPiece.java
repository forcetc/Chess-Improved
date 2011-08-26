package edu.neumont.learningChess.model;

import java.util.*;

import edu.neumont.learningChess.api.Location;
import edu.neumont.learningChess.api.Move;
import edu.neumont.learningChess.api.PieceType;

public abstract class ChessPiece {

		protected boolean hasMoved = false;
		protected PieceType type;

		public ChessPiece() {
		}	
		
		
		public Vector<Location> checkLegalMoves(boolean isValid, Location location,	Vector<Location> possibleMoves) {
			if (isValid) {
				possibleMoves.add(location);
			}

			return possibleMoves;
		}
		
		

		public boolean hasMoved() {
			return hasMoved;
		}

		public void setHasMoved(boolean hasMoved) {
			this.hasMoved = hasMoved;
		}

		public PieceType getType() {
			return type;
		}

        public boolean isPossibleMove(Move move){
            //TODO
            return true;
        }
		


		public boolean canAttack(ChessBoard board, Location target) {
			boolean attacks = false;
			for (Enumeration<Location> e = getLegalMoves(board, target); !attacks && e.hasMoreElements(); ) {
				Location location = e.nextElement();
				attacks = target.equals(location);
			}
			return attacks;
		}

		public boolean isLegalMove(ChessBoard board, Move move) {
			boolean isValid = false;

			for (Enumeration<Location> e = getLegalMoves(board, move.getFrom()); !isValid && e.hasMoreElements(); ) {
				Location there = e.nextElement();
				isValid = there.equals(move.getTo());
			}
			return isValid;
		}
		
		
		public abstract Enumeration<Location> getLegalMoves(ChessBoard board, Location loc);

		//Class simple name
		public String getName() {
			return this.getClass().getSimpleName();
		}


		public Iterator<Move> getPossibleMoves() {
			// TODO Auto-generated method stub
			return null;
		}
	}



