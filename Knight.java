package labAssignment;
import labAssignment.Peice;
public class Knight extends Peice{
	public Knight(boolean col,boolean stat)
	{
		this.colour=col;
		this.status=stat;
		
	}

	public boolean move(int posX, int posY, int finPosX, int finPosY) {
		if(ChessBoard.board[finPosX][finPosY]==null)
		{
			if(Math.abs(finPosY-posY)==2 && Math.abs(finPosX-posX)==1 )
			{
					ChessBoard.board[finPosX][finPosY]=ChessBoard.board[posX][posY];
					ChessBoard.board[posX][posY]=null;
					return true;
			}
			else if(Math.abs(finPosX-posX)==2 && Math.abs(finPosY-posY)==1)
			{
					ChessBoard.board[finPosX][finPosY]=ChessBoard.board[posX][posY];
					ChessBoard.board[posX][posY]=null;
					return true;
			}
		}
		else if(ChessBoard.board[finPosX][finPosY]!=null && ChessBoard.board[finPosX][finPosY].colour!=ChessBoard.board[posX][posY].colour)
		{
			if(Math.abs(finPosY-posY)==2 && Math.abs(finPosX-posX)==1)
			{
					ChessBoard.board[finPosX][finPosY]=ChessBoard.board[posX][posY];
					ChessBoard.board[posX][posY]=null;
					ChessBoard.board[finPosX][finPosY].status=false;
					return true;
				
			}
			else if(Math.abs(finPosX-posX)==2 && Math.abs(finPosY-posY)==1)
			{
					ChessBoard.board[finPosX][finPosY]=ChessBoard.board[posX][posY];
					ChessBoard.board[posX][posY]=null;
					ChessBoard.board[finPosX][finPosY].status=false;
					return true;
			}
		}
		return false;
	}
	
}
