package edu.neumont.learningChess.tests.api;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.neumont.learningChess.api.PieceDescription;
import edu.neumont.learningChess.api.PieceType;
import edu.neumont.learningChess.api.TeamColor;

public class PieceDescriptionTest {

	@Test
	public void testPieceDescription() {
		PieceDescription pieceDesc = new PieceDescription(TeamColor.LIGHT, false, PieceType.KING);
		assertEquals(TeamColor.LIGHT, pieceDesc.getColor());
		assertEquals(false, pieceDesc.hasMoved());
		assertEquals(PieceType.KING, pieceDesc.getPieceType());
		
		pieceDesc = new PieceDescription(TeamColor.DARK, true, PieceType.QUEEN);
		assertEquals(TeamColor.DARK, pieceDesc.getColor());
		assertEquals(true, pieceDesc.hasMoved());
		assertEquals(PieceType.QUEEN, pieceDesc.getPieceType());
	}

	@Test
	public void testGetColor() {
	}

	@Test
	public void testHasMoved() {
	}

	@Test
	public void testGetPieceType() {
	}

}
