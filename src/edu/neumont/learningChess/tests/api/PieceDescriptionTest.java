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
		PieceDescription pieceDesc = new PieceDescription(TeamColor.LIGHT, true, PieceType.KING);
		assertEquals(TeamColor.LIGHT, pieceDesc.getColor());
		
		pieceDesc = new PieceDescription(TeamColor.DARK, true, PieceType.KING);
		assertEquals(TeamColor.DARK, pieceDesc.getColor());
	}

	@Test
	public void testHasMoved() {
		PieceDescription pieceDesc = new PieceDescription(TeamColor.LIGHT, true, PieceType.KING);
		assertTrue(pieceDesc.hasMoved());
		
		pieceDesc = new PieceDescription(TeamColor.LIGHT, false, PieceType.KING);
		assertFalse(pieceDesc.hasMoved());
	}

	@Test
	public void testGetPieceType() {
		for (PieceType pieceType : PieceType.values()) {
			PieceDescription pieceDesc = new PieceDescription(TeamColor.LIGHT, true, pieceType);
			assertEquals(pieceType, pieceDesc.getPieceType());
		}
	}
}
