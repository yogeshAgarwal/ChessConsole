package labAssignment;

public class Queen extends Peice {
	public Queen(boolean col,boolean stat)
	{
		this.colour=col;
		this.status=stat;
	}
	static boolean mid=true;
	public static void checkPath(int posX, int posY, int finPosX, int finPosY)
	{
		
		if((finPosX-posX)!=0 && finPosY-posY==0)
		{
			
			if(finPosX-posX>0)
			{
				for(int i=posX+1;i<finPosX;i++)
				{
					
					if(ChessBoard.board[i][posY]!=null)
					{
						mid=false;
						break;
					}
					else
						mid=true;
				
				}
			}
			else if(finPosX-posX<0)
			{
				for(int i=posX-1;i>finPosX;i--)
				{
					
					if(ChessBoard.board[i][posY]!=null)
					{
						mid=false;
						break;
					}
					else
						mid=true;
				}
			}
		}
		else if((finPosY-posY)!=0 && finPosX-posX==0)
		{
			if((finPosY-posY)>0)
			{
				for(int i=posY+1;i<finPosY;i++)
				{
				System.out.println(ChessBoard.board[posX][i]);
				if(ChessBoard.board[posX][i]!=null)
				{
					mid=false;
					break;
				}
				else
					mid=true;
				}
			}
			else if((finPosY-posY)<0)
			{
				for(int i=posY-1;i>finPosY;i--)
				{
					if(ChessBoard.board[posX][i]!=null)
					{
						mid=false;
						break;
					}
					else
						mid=true;
				}
			}
		}
		else if(Math.abs(finPosX-posX)==Math.abs(finPosY-posY))
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

	public  boolean move(int posX, int posY, int finPosX, int finPosY) {
		// TODO Auto-generated method stub
		checkPath(posX,posY,finPosX,finPosY);
		if(ChessBoard.board[finPosX][finPosY]==null)
		{
			
			if((finPosY-posY)!=0 && finPosX-posX==0 )
			{
				if(mid==true)
				{
					ChessBoard.board[finPosX][finPosY]=ChessBoard.board[posX][posY];
					ChessBoard.board[posX][posY]=null;
					return true;
				}
					
			}

			else if(finPosX-posX!=0 && finPosY-posY==0)
			{
				if(mid==true)
				{
					ChessBoard.board[finPosX][finPosY]=ChessBoard.board[posX][posY];
					ChessBoard.board[posX][posY]=null;
					return true;
				}
			}
			else if(Math.abs(finPosY-posY)==Math.abs(finPosX-posX) )
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
			if(finPosY-posY!=0 && finPosX-posX==0 )
			{
				if(mid==true)
				{
					ChessBoard.board[finPosX][finPosY].status=false;
					ChessBoard.board[finPosX][finPosY]=ChessBoard.board[posX][posY];
					ChessBoard.board[posX][posY]=null;
					
					return true;
				}
				
			}
			else if(finPosX-posX!=0 && finPosY-posY==0)
			{
				
				if(mid==true)
				{
					
					ChessBoard.board[finPosX][finPosY].status=false;
					ChessBoard.board[finPosX][finPosY]=ChessBoard.board[posX][posY];
					ChessBoard.board[posX][posY]=null;
					
					return true;
				}
			}
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
		System.out.println("please try again !! WRONG INPUT CONDITION");
		return false;
	}
	
		
	
}
