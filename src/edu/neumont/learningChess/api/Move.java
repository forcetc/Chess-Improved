package edu.neumont.learningChess.api;


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
}
