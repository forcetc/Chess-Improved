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
		assertEquals(true, pieceDesc.hasMoved());
		
		pieceDesc = new PieceDescription(TeamColor.LIGHT, false, PieceType.KING);
		assertEquals(false, pieceDesc.hasMoved());
	}

	@Test
	public void testGetPieceType() {
		PieceDescription pieceDesc = new PieceDescription(TeamColor.LIGHT, true, PieceType.KING);
		assertEquals(PieceType.KING, pieceDesc.getPieceType());
		
		pieceDesc = new PieceDescription(TeamColor.LIGHT, true, PieceType.QUEEN);
		assertEquals(PieceType.QUEEN, pieceDesc.getPieceType());
		
		pieceDesc = new PieceDescription(TeamColor.LIGHT, true, PieceType.BISHOP);
		assertEquals(PieceType.BISHOP, pieceDesc.getPieceType());
		
		pieceDesc = new PieceDescription(TeamColor.LIGHT, true, PieceType.KNIGHT);
		assertEquals(PieceType.KNIGHT, pieceDesc.getPieceType());
		
		pieceDesc = new PieceDescription(TeamColor.LIGHT, true, PieceType.ROOK);
		assertEquals(PieceType.ROOK, pieceDesc.getPieceType());
		
		pieceDesc = new PieceDescription(TeamColor.LIGHT, true, PieceType.PAWN);
		assertEquals(PieceType.PAWN, pieceDesc.getPieceType());
	}
}
