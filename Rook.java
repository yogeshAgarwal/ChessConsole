package labAssignment;
import labAssignment.Peice;
public  class Rook extends Peice {
	
	public Rook(boolean col,boolean status)
	{
		this.colour=col;
		this.status=status;
	}
	static boolean mid=true;
	public static void checkPath(int posX, int posY, int finPosX, int finPosY)
	{
		System.out.println("Enters in CheckPath");
		if((finPosX-posX)!=0 && finPosY-posY==0)
		{
			System.out.println("Enter into the Check Position condition");
			if(finPosX-posX>0)
			{
				for(int i=posX+1;i<finPosX;i++)
				{
					System.out.println(ChessBoard.board[i][posY]);
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
					System.out.println(ChessBoard.board[i][posY]);
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
			System.out.println("Enter into the Check position condition for vertical ");
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
		}
		System.out.println("please try again!! WRONG MOVEMENT PARAMETER");
		return false;
	}

}
