package labAssignment;
public class Pawn extends Peice{
	
	public Pawn(boolean col,boolean stat)
	{
		this.colour=col;
		this.status=stat;
	}
	public boolean move(int posX, int posY, int finPosX, int finPosY) {
		
		if(ChessBoard.board[finPosX][finPosY]!=null)
		{
			
			if(ChessBoard.board[posX][posY].colour==false)
			{	
				
				if(ChessBoard.board[posX][posY].colour!=ChessBoard.board[finPosX][finPosY].colour)
				{
					
					if(Math.abs(finPosX-posX)==1 && (finPosY-posY)==1)
					{
						
						ChessBoard.board[finPosX][finPosY].status=false;
						ChessBoard.board[finPosX][finPosY]=ChessBoard.board[posX][posY];
						
						ChessBoard.board[posX][posY]=null;
					
						return true;
					}
				}
			
			}
			else if(ChessBoard.board[posX][posY].colour==true)
			{
				if(ChessBoard.board[posX][posY].colour!=ChessBoard.board[finPosX][finPosY].colour)
				{
					if(Math.abs(finPosX-posX)==1 &&	(finPosY-posY)==-1)
					{
						ChessBoard.board[finPosX][finPosY].status=false;
						ChessBoard.board[finPosX][finPosY]=ChessBoard.board[posX][posY];
						ChessBoard.board[posX][posY]=null;
						return true;
					}
				}
			}
			
		}
		else if(ChessBoard.board[finPosX][finPosY]==null)
		{
			
			if(ChessBoard.board[posX][posY].colour==false)
			{
				
				if((finPosX-posX)==0 &&	(finPosY-posY)==1)
				{
					
					ChessBoard.board[finPosX][finPosY]=ChessBoard.board[posX][posY];
					ChessBoard.board[posX][posY]=null;
					return true;
				}
			}
			else if(ChessBoard.board[posX][posY].colour==true)
			{
				if((finPosX-posX)==0 &&	(finPosY-posY)==-1)
				{
					ChessBoard.board[finPosX][finPosY]=ChessBoard.board[posX][posY];
					ChessBoard.board[posX][posY]=null;
					return true;
				}
			}
		}
		
		return false;
	}

}
