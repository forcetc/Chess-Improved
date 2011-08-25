package edu.neumont.learningChess.api;

import java.util.Enumeration;

import org.ietf.jgss.GSSContext;

import edu.neumont.learningChess.model.ChessBoard;
import edu.neumont.learningChess.model.ChessPiece;
import edu.neumont.learningChess.model.ChessTeam;
import edu.neumont.learningChess.model.MoveHistory;
import edu.neumont.learningChess.api.Location;

public class ChessGame {
	
	private ChessBoard board = new ChessBoard();
	private ChessTeam lightTeam = new ChessTeam();
	private ChessTeam darkTeam = new ChessTeam();
	private MoveHistory moveHistory = new MoveHistory();

	
	public ChessGame()
	{
		//TODO: 
		
	}
	
	public ChessGame(ChessGameState gameState)
	{
		for(int row = 0;row< board.N_ROWS;row++)
		{
			for(int col = 0; col< board.N_COLS; col++)
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
						moveHistory.
			}
			
		}
			
		
		//TODO: 
		
	}
	
	public ChessGameState getGameState()
	{
		
		
		//TODO: 
		return null;
	}
	
	public MoveDescription getMoveDescription(Move move)
	{
		return null;
		
		//TODO: 
	}
	
	public void makeMove(MoveDescription movedesc)
	{
		//TODO: 
	}
	
	public void unMakeMove()
	{
		//TODO: 

	}
	
	public boolean isCheck()
	{
		return false;
		
	}
	
	public boolean isCheckMate()
	{
		//TODO: 
		return false;
	}
	
	public boolean isStaleMate()
	{
		//TODO: 
		return false;
	}
	
	public Enumeration<Move> getPossibleMoves()
	{
		
		//TODO: 
		return null;
	}
	
	public Enumeration<Move> getPossibleMoves(Location location)
	{
		
		//TODO: 
		return null;
	} 
	
	public Enumeration<Move> getGameHistory()
	{
		return null;
		//TODO: 
	}
	
}
