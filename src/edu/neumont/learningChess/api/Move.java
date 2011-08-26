package edu.neumont.learningChess.api;

import java.util.ArrayList;
import java.util.Enumeration;


public class Move {

	private Location from;
	private Location to;
	
	public Move(Location from, Location to) {
		this.from = from;
		this.to = to;
	}
	
	public Location getFrom() {
		return from;
	}
	
	public Location getTo() {
		return to;
	}
	
	public int verticalDistance() {
		return from.getRow() - to.getRow();
	}
	
	public int horizontalDistance() {
		return from.getColumn() - to.getColumn();
	}
	
	public String toString() {
		return from.toString() + " " + to.toString();
	}
	
	public Enumeration<Location> getMoveLocation()
	{
		
//		Enumeration<Location> locationsToReturn = new ArrayList<Location>();
//		if (isVertical()) {
//			for (int i = from.getRow(); (i < vertical*verticalStep) || (i > vertical*verticalStep); i+=verticalStep) 
//			{
//				locationsToReturn.
//			}
//		}else if (isHorizontal()) {
//			for (int i = from.getColumn(); (i < horizontal*horizontalStep) || (i > horizontal*horizontalStep); i+=horizontalStep) 
//			{
//				piecesPresent = this.getPiece(new Location(fromLocation.getRow(), i))!= null;
//			}
//		}else if (isDiagonal()) {
//			for (int i = from.getRow(), j= fromLocation.getColumn(); (i < vertical*verticalStep) || (i > vertical*verticalStep); i+=verticalStep, j+=horizontalStep) 
//			{
//				piecesPresent = this.getPiece(new Location(i, j))!= null;
//			}
//		}
		return null;
	}

	private boolean isDiagonal() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isHorizontal() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isVertical() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
