package Functional;

public class TictactoeLogic {
	public static final int x = 1, o = -1;
	public static final int empty = 0;
	//public int player = x ;
	
	private int[][] board = new int[3][3];
	public int player = x;
	public static boolean isEmpty = false;
	
	public void putsign(int x, int y)
	{
		if(x < 0 || x > 2 || y < 0 || y > 2)
		{
			System.out.println("Invalid positon");
		}
		
		if(board[x][y] != empty)
		{
			System.out.println("already occupied");
		}
		
		board[x][y] = player;
		player = -player;
	}
	
	public boolean isWin(int player)
	{
		return ((board[0][0]+board[0][1]+board[0][2] == player*3)||
				(board[0][0]+board[1][0]+board[2][0] == player*3)||
				(board[2][0]+board[2][1]+board[2][2] == player*3)||
				(board[0][0]+board[0][1]+board[0][2] == player*3)||
				(board[0][2]+board[1][2]+board[2][2] == player*3)||
				(board[0][1]+board[1][1]+board[2][1] == player*3)||
				(board[1][0]+board[1][1]+board[1][2] == player*3)||
				(board[0][2]+board[1][1]+board[2][0] == player*3)
				);
	}
	
	public void displayWinner() 
	{
		if(isWin(x))
		{
			System.out.println("X wins");
			isEmpty = false;
		}
		else if(isWin(o))
		{
			System.out.println("O wins");
			isEmpty = false;
		}
		else if(!isEmpty)
		{
			System.out.println("its tie");
		}
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		isEmpty = false;
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j<3 ; j++)
			{
				switch(board[i][j])
				{
				case x:
					sb.append("x");
					break;
					
				case o:
					sb.append("o");
					break;
					
				case empty:
					sb.append(" ");
					isEmpty = true;
					break;
				}
				if(j<2)
				{
					sb.append("|");
				}
			}
			
			if(i<2)
			{
				sb.append("\n_____\n");
			}
		}
		
		return sb.toString();
		
	}

	
	
	
}
