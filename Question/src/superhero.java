
public class superhero {
	
	public static void main(String[] args)
	{	
			String[] grid = new String[3];
			grid[0] = "-";
			grid[1] = "-";
			grid[2] = "-";
			
			String[][] board = new String[3][3];
			board[0][0] = "-";
			board[0][1] = "-";
			board[0][2] = "-";
			
			for(int i = 0;i < grid.length;i ++)
			{
				System.out.println(grid[i]);
			}
			
			// fill n print 2d array
			System.out.println("fill and print 2d array");
			for(int row = 0; row < board.length; row ++)
			{
				for(int col = 0; col < board[row].length; col ++)
				{
					board[row][col] = "-";
					System.out.println(board[row][col]);
				}// end of for [col]
				         
			}// end of for [row]
			
	} // end main

} // end of class 

