package edu.neumont.learningChess.api;

import java.util.Enumeration;

import edu.neumont.learningChess.model.ChessBoard;
import edu.neumont.learningChess.model.ChessPiece;
import edu.neumont.learningChess.model.ChessTeam;
import edu.neumont.learningChess.model.MoveHistory;

public class ChessGame {
	
	private ChessBoard board = new ChessBoard();
	private ChessTeam lightTeam = new ChessTeam();
	private ChessTeam darkTeam = new ChessTeam();
	private MoveHistory moveHistory = new MoveHistory();

	
	public ChessGame()
	{
		// TODO: finish this method
		
	}
	
	public ChessGame(ChessGameState gameState)
	{
		for(int row = 0;row< ChessBoard.NUMBER_OF_ROWS;row++)
		{
			for(int col = 0; col< ChessBoard.NUMBER_OF_COLUMNS; col++)
			{
				Location location = new Location(row,col);
				PieceDescription pieceDescription = gameState.getPieceDescription(location);
				TeamColor currentTeamColor;
				
				ChessPiece piece = (pieceDescription.getColor() == TeamColor.LIGHT)? 
						lightTeam.getUnusedPiece(pieceDescription.getPieceType()) 
						: darkTeam.getUnusedPiece(pieceDescription.getPieceType());
						
						board.setPiece(piece, location);
						piece.setHasMoved(true);
						
						currentTeamColor = gameState.getMovingTeamColor();
						//moveHistory.
			}
			
		}
		// TODO: finish this method
		
	}
	
	public ChessGameState getGameState()
	{
		// TODO: finish this method
		return null;
	}
	
	public MoveDescription getMoveDescription(Move move)
	{		
		// TODO: finish this method
		return null;
	}
	
	public void makeMove(MoveDescription movedesc)
	{
		// TODO: finish this method
	}
	
	public void unMakeMove()
	{
		// TODO: finish this method
	}
	
	public boolean isCheck()
	{
		// TODO: finish this method
		return false;
	}
	
	public boolean isCheckMate()
	{
		// TODO: finish this method
		return false;
	}
	
	public boolean isStaleMate()
	{
		// TODO: finish this method
		return false;
	}
	
	public Enumeration<Move> getPossibleMoves()
	{
		// TODO: finish this method
		return null;
	}
	
	public Enumeration<Move> getPossibleMoves(Location location)
	{
		// TODO: finish this method
		return null;
	} 
	
	public Enumeration<Move> getGameHistory()
	{
		// TODO: finish this method
		return null;
	}
	
}
