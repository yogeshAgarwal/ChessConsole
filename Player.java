package labAssignment;
import labAssignment.ChessBoard;

public class Player
{
	//for Black players
	public static King bKing=new King(false,true);
	public static Queen bQueen=new Queen(false,true);
	public static Bishop bBishop1=new Bishop(false,true);
	public static Bishop bBishop2=new Bishop(false,true);
	public static Rook bRook1=new Rook(false,true);
	public static Rook bRook2=new Rook(false,true);
	public static Knight bKnight1=new Knight(false,true);
	public static Knight bKnight2=new Knight(false,true);
	public static Pawn bPawn1=new Pawn(false,true);
	public static Pawn bPawn2=new Pawn(false,true);
	public static Pawn bPawn3=new Pawn(false,true);
	public static Pawn bPawn4=new Pawn(false,true);
	public static Pawn bPawn5=new Pawn(false,true);
	public static Pawn bPawn6=new Pawn(false,true);
	public static Pawn bPawn7=new Pawn(false,true);
	public static Pawn bPawn8=new Pawn(false,true);
	
	//for white player
	public static King wKing=new King(true,true);
	public static Queen wQueen=new Queen(true,true);
	public static Bishop wBishop1=new Bishop(true,true);
	public static Bishop wBishop2=new Bishop(true,true);
	public static Rook wRook1=new Rook(true,true);
	public static Rook wRook2=new Rook(true,true);
	public static Knight wKnight1=new Knight(true,true);
	public static Knight wKnight2=new Knight(true,true);
	public static Pawn wPawn1=new Pawn(true,true);
	public static Pawn wPawn2=new Pawn(true,true);
	public static Pawn wPawn3=new Pawn(true,true);
	public static Pawn wPawn4=new Pawn(true,true);
	public static Pawn wPawn5=new Pawn(true,true);
	public static Pawn wPawn6=new Pawn(true,true);
	public static Pawn wPawn7=new Pawn(true,true);
	public static Pawn wPawn8=new Pawn(true,true);
	
	public static void start()
	{
		ChessBoard.board[0][0]=bRook1;
		ChessBoard.board[7][0]=bRook2;
		ChessBoard.board[1][0]=bKnight1;
		ChessBoard.board[6][0]=bKnight2;
		ChessBoard.board[2][0]=bBishop1;
		ChessBoard.board[5][0]=bBishop2;
		ChessBoard.board[3][0]=bQueen;
		ChessBoard.board[4][0]=bKing;
		ChessBoard.board[0][1]=bPawn1;
		ChessBoard.board[1][1]=bPawn2;
		ChessBoard.board[2][1]=bPawn3;
		ChessBoard.board[3][1]=bPawn4;
		ChessBoard.board[4][1]=bPawn5;
		ChessBoard.board[5][1]=bPawn6;
		ChessBoard.board[6][1]=bPawn7;
		ChessBoard.board[7][1]=bPawn8;
		
		ChessBoard.board[0][7]=wRook1;
		ChessBoard.board[7][7]=wRook2;
		ChessBoard.board[1][7]=wKnight1;
		ChessBoard.board[6][7]=wKnight2;
		ChessBoard.board[2][7]=wBishop1;
		ChessBoard.board[5][7]=wBishop2;
		ChessBoard.board[4][7]=wQueen;
		ChessBoard.board[3][7]=wKing;
		ChessBoard.board[0][6]=wPawn1;
		ChessBoard.board[1][6]=wPawn2;
		ChessBoard.board[2][6]=wPawn3;
		ChessBoard.board[3][6]=wPawn4;
		ChessBoard.board[4][6]=wPawn5;
		ChessBoard.board[5][6]=wPawn6;
		ChessBoard.board[6][6]=wPawn7;
		ChessBoard.board[7][6]=wPawn8;
	}
	
}