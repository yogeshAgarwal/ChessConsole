package labAssignment;
import labAssignment.ChessBoard;
import java.util.Scanner;
import labAssignment.Peice;
import labAssignment.Player;
public class Driver {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Player.start();
		boolean turn=false;
		boolean k=true;
		boolean turnCheck=true;
		
		while(k==true)
		{
			
				try
				{
					display();
					
					if(turn==true)
						System.out.println("WHITE PLAYER chance");
					else if(turn==false)
						System.out.println("BLACK PLAYER chance");
					System.out.println("Enter the initial position");
					int posX=sc.nextInt();
					int posY=sc.nextInt();
					System.out.println("Enter the final position");
					int finPosX=sc.nextInt();
					int finPosY=sc.nextInt();
					
					if(ChessBoard.board[posX][posY]!=null)
					{
						System.out.println("Selected element is "+ChessBoard.board[posX][posY].getClass().toString().substring(20));
						if(posX!=finPosX || posY!=finPosY)
						{
							if(ChessBoard.board[posX][posY].colour==turn)
							{
								turnCheck=ChessBoard.board[posX][posY].move(posX,posY,finPosX,finPosY);
								if(turnCheck)	
									turn=!turn;
							}
							else
							{
								System.out.println("Try again!! piece of another player is select");	
							}
						}
						else
							System.out.println("Both the input is same");
					}
					else
						System.out.println("Your selected position is vaccant");
					k=isKingAlive();
				}
				catch(Exception e)
				{
					System.out.println("wrong input");	
				}
				
				//continue;
			
		
			
		}
		
		
	}
	public static void display()
	{
		System.out.print("\t");
		for(int i=0;i<8;i++)
			System.out.print(i+"\t");
		System.out.println("\n");
		for(int i=0;i<8;i++)
		{
			System.out.print(i+"\t");
			for(int j=0;j<8;j++)
			{	
					if(ChessBoard.board[j][i]!=null)
					{
						if(ChessBoard.board[j][i].colour==false)
							System.out.print("b"+ChessBoard.board[j][i].getClass().toString().substring(20)+"\t");
						else //if(ChessBoard.board[i][j].colour==true)
							System.out.print("w"+ChessBoard.board[j][i].getClass().toString().substring(20)+"\t");
					
					}
					else
					System.out.print("null \t");
			}
			System.out.println("\n");
		}
	}
	public static boolean isKingAlive()
	{
		if(Player.bKing.status==false )
		{
			System.out.println("White player wins");
			return false;
		}
		else if(Player.wKing.status==false)
		{
			System.out.println("Black player wins");
			return false;
		}
		else
			return true;
	}
	public static boolean checkMate()
	{
		return false;
	}

}
