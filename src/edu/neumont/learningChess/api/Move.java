package edu.neumont.learningChess.api;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

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

	public Iterator<Location> getMoveLocations() {

		ArrayList<Location> locationsToReturn = new ArrayList<Location>();

		int vertical = verticalDistance();
		int horizontal = horizontalDistance();
		int verticalStep = vertical / Math.abs(vertical);
		int horizontalStep = horizontal / Math.abs(horizontal);
		
		if (isVertical()) {
			for (int i = 0; i < Math.abs(vertical); i++) {
				locationsToReturn.add(new Location(from.getRow()
						+ (i * verticalStep), from.getColumn()));
			}
		} else if (isHorizontal()) {
			for (int j = 0; j < Math.abs(horizontal); j++) {
				locationsToReturn.add(new Location(from.getRow(), from
						.getColumn() + (j * horizontalStep)));
			}
		} else if (isDiagonal()) {
			for (int i = 0, j = 0; i < vertical; i++, j++) {
				locationsToReturn.add(new Location(from.getRow()
						+ (i * verticalStep), from.getColumn()
						+ (j * horizontalStep)));
			}
		}

		return locationsToReturn.iterator();
	}

	public boolean isDiagonal() {
		return verticalDistance() == horizontalDistance();
	}

	public boolean isHorizontal() {
		return horizontalDistance()> verticalDistance();
	}

	public boolean isVertical() {
		return verticalDistance()> horizontalDistance();
	}

}
