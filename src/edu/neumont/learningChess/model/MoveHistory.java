package edu.neumont.learningChess.model;

import java.util.Stack;

import edu.neumont.learningChess.api.MoveDescription;
import edu.neumont.learningChess.api.MoveType;

public class MoveHistory{
	
	private Stack<MoveDescription> moves;
	
	public boolean isLastMovePawnMovedTwo() {
		MoveDescription lastMove = moves.peek();
		return lastMove.getMoveType() == MoveType.PAWN_MOVE_TWO;
	}

	public void push(MoveDescription moveDescription){
		moves.push(moveDescription);
	}
	
	public MoveDescription pop() {
		return moves.pop();
	}
}
