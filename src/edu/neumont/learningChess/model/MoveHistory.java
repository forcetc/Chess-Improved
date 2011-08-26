package edu.neumont.learningChess.model;

import java.util.Enumeration;
import java.util.Stack;

import edu.neumont.learningChess.api.MoveDescription;

public class MoveHistory implements Enumeration<MoveDescription>{
	
	private boolean lastMovePawnMovedTwo;
	private Stack<MoveDescription> moves;
	
	public boolean isLastMovePawnMovedTwo() {
		return lastMovePawnMovedTwo;
	}

	public void setLastMovePawnMovedTwo(boolean lastMovePawnMovedTwo) {
		this.lastMovePawnMovedTwo = lastMovePawnMovedTwo;
	}

	public void push(MoveDescription moveDescription){
		
	}

	@Override
	public boolean hasMoreElements() {
		return !moves.isEmpty();
	}

	@Override
	public MoveDescription nextElement() {
		MoveDescription moveDescription = moves.pop();
		
		return moveDescription;
	}
}
