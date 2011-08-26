package edu.neumont.learningChess.api;

public class MoveDescription {
	
	private Move move;
	private MoveType currentMovetype;
	
	private PieceType capturedPiece;
	private PieceType pawnPromotionType;
	
	private Location castlingRookPosition;
	private Location enPassantCapturePosition;
	
	
	public MoveDescription(Move move) {
		this.move = move;
		currentMovetype = MoveType.NORMAL;
	}
	
	public Move getMoveCoordinates()
	{
		return move;
	}
	public MoveType getMoveType()
	{
		return currentMovetype;
	}
	
	public PieceType getCapturedPiece()
	{
		return capturedPiece;
	}
	public void setCapturedPiece(PieceDescription description)
	{
		if (currentMovetype == MoveType.NORMAL)
		{
			capturedPiece = description.getPieceType();
			currentMovetype = MoveType.CAPTURE;
		}
		else if (currentMovetype == MoveType.PROMOTION)
		{
			capturedPiece = description.getPieceType();
			currentMovetype = MoveType.PROMOTION_WITH_CAPTURE;
		}
		else
		{
			throw new RuntimeException("Can't change Non-Normal MoveType. Currently set to: " + currentMovetype.toString() + ". Trying to set to " + MoveType.CAPTURE.toString());
		}
	}
	
	public Location getCastlingRookPosition()
	{
		return castlingRookPosition;
	}
	public void setCastlingRookPosition(Location location)
	{
		if (currentMovetype != MoveType.NORMAL) {
			throw new RuntimeException("Can't change Non-Normal MoveType. Currently set to: " + currentMovetype.toString() + ". Trying to set to " + MoveType.CASTLE.toString());
		}
		else
		{
			castlingRookPosition = location;
			currentMovetype = MoveType.CASTLE;
		}
	}
	
	public Location getEnPassantCapturedPawnLocation()
	{
		return enPassantCapturePosition;
	}
	public void setEnPassantCapturedPawnLocation(Location location)
	{
		if (currentMovetype != MoveType.NORMAL) {
			throw new RuntimeException("Can't change Non-Normal MoveType. Currently set to: " + currentMovetype.toString() + ". Trying to set to " + MoveType.ENPASSANT.toString());
		}
		else
		{
			enPassantCapturePosition = location;
			currentMovetype = MoveType.ENPASSANT;
		}
	}
	
	public PieceType getPawnPromotionType()
	{
		return pawnPromotionType;
	}
	public void setPawnPromotionType(PieceType pieceType)
	{
		if (currentMovetype == MoveType.NORMAL)
		{
			pawnPromotionType = pieceType;
			currentMovetype = MoveType.PROMOTION;
		}
		else if (currentMovetype == MoveType.CAPTURE)
		{
			pawnPromotionType = pieceType;
			currentMovetype = MoveType.PROMOTION_WITH_CAPTURE;
		}
		else
		{
			throw new RuntimeException("Can't change Non-Normal MoveType. Currently set to: " + currentMovetype.toString() + ". Trying to set to " + MoveType.PROMOTION.toString());
		}
	}

}
