package edu.neumont.learningChess.tests.api;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.neumont.learningChess.api.Location;
import edu.neumont.learningChess.api.Move;
import edu.neumont.learningChess.api.MoveDescription;

public class MoveDescriptionTest {

	@Test
	public void testGetMoveCoordinates() {
		
		Move move = new Move(new Location(4,4), new Location(5, 4));
		MoveDescription toTest = new MoveDescription(move);
		
		assertEquals(move, toTest.getMoveCoordinates());
	}

	@Test
	public void testGetMoveType() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCapturedPiece() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCapturedPiece() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCastlingRookPosition() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCastlingRookPosition() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEnPassantCapturedPawnLocation() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetEnPassantCapturedPawnLocation() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPawnPromotionType() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPawnPromotionType() {
		fail("Not yet implemented");
	}

}
