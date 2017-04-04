package labAssignment;
import labAssignment.Peice;
public class Bishop extends Peice {
	public Bishop(boolean col,boolean stat)
	{
		this.colour=col;
		this.status=stat;
	}
	static boolean mid=true;
	public static void checkPath(int posX,int posY,int finPosX,int finPosY)
	{
		if(Math.abs(finPosX-posX)==Math.abs(finPosY-posY))
		{	
			if(finPosX-posX>0 && finPosY-posY>0)
			{
				for(int i=posX+1,j=posY+1;i<finPosX;i++,j++)
				{
					if(ChessBoard.board[i][j]!=null)
					{	
						mid=false;
						break;
					}
					else
						mid=true;		
				}
			}
			else if(finPosX-posX<0 && finPosY-posY<0)
			{
				for(int i=posX-1,j=posY-1;i>finPosX;i--,j--)
				{
					if(ChessBoard.board[i][j]!=null)
					{	
						mid=false;
						break;
					}
					else
						mid=true;		
				}
			}
			else if(finPosX-posX>0 && finPosY-posY<0)
			{
				for(int i=posX+1,j=posY-1;i<finPosX;i++,j--)
				{
					if(ChessBoard.board[i][j]!=null)
					{	
						mid=false;
						break;
					}
					else
						mid=true;
				}
			}
			else if(finPosX-posX<0 && finPosY-posY>0)
			{
				for(int i=posX-1,j=posY+1;j>finPosY;j++,i--)
				{
					if(ChessBoard.board[i][j]!=null)
					{	
						mid=false;
						break;
					}
					else
						mid=true;
				}
			}
		}
		
	}
	public boolean move(int posX, int posY, int finPosX, int finPosY) {
		// TODO Auto-generated method stub
		checkPath(posX,posY,finPosX,finPosY);
		if(ChessBoard.board[finPosX][finPosY]==null)
		{
			if(Math.abs(finPosY-posY)==Math.abs(finPosX-posX) )
			{
				if(mid==true)
				{
					ChessBoard.board[finPosX][finPosY]=ChessBoard.board[posX][posY];
					ChessBoard.board[posX][posY]=null;
					return true;
				}
				
			}
		}
		else if(ChessBoard.board[finPosX][finPosY]!=null && ChessBoard.board[finPosX][finPosY].colour!=ChessBoard.board[posX][posY].colour)
		{
			if(Math.abs(finPosY-posY)==Math.abs(finPosX-posX) )
			{
				if(mid==true)
				{
					ChessBoard.board[finPosX][finPosY].status=false;
					ChessBoard.board[finPosX][finPosY]=ChessBoard.board[posX][posY];
					ChessBoard.board[posX][posY]=null;
					
					return true;
				}
				
			}
		
		}
		return false;
	}

}
