
public class Solver_functions {
	
	static void print_board(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			if ( i != 0 && i % 3 == 0) {
				System.out.println("- - - - - - - - - - - -");
			}

			for (int j = 0; j < board[i].length; j++) {
				if (j != 0 && j % 3 == 0) {
					System.out.print(" | ");
				}

				if (j == 8) {
					System.out.println(board[i][j]);
				} else {
					System.out.print(board[i][j]);
					System.out.print(" ");
				}
			}
		}
	}
	
	static boolean solve_sudoku(int[][] board) {
		int[] empty = find_empty(board);
		if (empty[0] == -1) {
			return true; // filled every blank, solution found
		}
		
		for (int k = 1; k < 10; k++) {
			if ( check_valid(board, k, empty) ) {
				board[empty[0]][empty[1]] = k;
				if (solve_sudoku(board)) {
					return true;
				}
				board[empty[0]][empty[1]] = 0;
			}
		}
		
		return false;
	}

	static int[] find_empty(int[][] board) {
		int[] result = new int[] {-1,-1};
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 0) {
					result[0] = i;
					result[1] = j;
					return result; // Row, Column
				}
			}
		}
		return result; // nothing found
	}
	
	static boolean check_valid(int[][] board, int num_to_check, int[] location) {
		if (check_col(board, num_to_check, location) && 
			check_row(board, num_to_check, location) && 
			check_subgrid(board, num_to_check, location)) 
		{
			return true;
		} else {
			return false;
		}
	}
	
	static boolean check_row(int[][] board, int num_to_check, int[] location) {
		for (int i = 0; i < board[0].length; i++) {
			if ( i != location[1] && board[location[0]][i] == num_to_check) {
				//System.out.println("Row fail");
				return false;
			}
		}
		return true;
	}
	
	static boolean check_col(int[][] board, int num_to_check, int[] location) {
		for (int i = 0; i < board.length; i++) {
			if ( i != location[0] && board[i][location[1]] == num_to_check) {
				//System.out.println("Column fail");
				return false;
			}
		}
		return true;
	}
	
	static boolean check_subgrid(int[][] board, int num_to_check, int[] location) {
		// Make use of integer division to start the index at the top left most box of the appropriate subgrid
		final int grid_x_start = (location[1] / 3) * 3;
		final int grid_y_start = (location[0] / 3) * 3;
		
		for (int i = grid_y_start; i < (grid_y_start + 3); i++) {
			for (int j = grid_x_start; j < (grid_x_start + 3); j++) {
				if ( ( i != location[0] ) && ( j != location[1]) && board[i][j] == num_to_check) {
					//System.out.println("Subgrid fail");
					return false;
				}
			}
		}
		
		return true;
	}
	
}
