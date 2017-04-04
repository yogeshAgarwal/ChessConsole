package labAssignment;

import labAssignment.Peice;

public class King extends Peice {
	
	public King(boolean col,boolean stat) {
		// TODO Auto-generated constructor stub
		this.colour=col;
		this.status=stat;
		
	}
	public boolean move(int posX, int posY, int finPosX, int finPosY) {
		if(ChessBoard.board[finPosX][finPosY]==null)
		{
			if(Math.abs(finPosX-posX)+Math.abs(finPosY-posY)==1)
			{
				ChessBoard.board[finPosX][finPosY]=ChessBoard.board[posX][posY];
				ChessBoard.board[posX][posY]=null;
				return true;
			}
			else if(Math.abs(finPosX-posX)==1 && Math.abs(finPosY-posY)==1)
			{
				ChessBoard.board[finPosX][finPosY]=ChessBoard.board[posX][posY];
				ChessBoard.board[posX][posY]=null;
				return true;	
			}
				
		}
		else if(ChessBoard.board[finPosX][finPosY]!=null && ChessBoard.board[finPosX][finPosY].colour!=ChessBoard.board[posX][posY].colour)
		{
			if(Math.abs(finPosX-posX)+Math.abs(finPosY-posY)==1)
			{
				ChessBoard.board[finPosX][finPosY].status=false;
				ChessBoard.board[finPosX][finPosY]=ChessBoard.board[posX][posY];
				
				ChessBoard.board[posX][posY]=null;
				return true;
			}
			else if(Math.abs(finPosX-posX)==1 && Math.abs(finPosY-posY)==1)
			{
				ChessBoard.board[finPosX][finPosY].status=false;
				ChessBoard.board[finPosX][finPosY]=ChessBoard.board[posX][posY];
				ChessBoard.board[posX][posY]=null;
				return true;	
			}
		}
		System.out.println("Wrong movemnent variables");
		return false;
	}

}
