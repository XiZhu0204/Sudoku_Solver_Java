
public class Sudoku_Solver {

	public static void main(String[] args) {
		int[][] board = {
				{ 7, 8, 0, 4, 0, 0, 1, 2, 0},
				{ 6, 0, 0, 0, 7, 5, 0, 0, 9},
				{ 0, 0, 0, 6, 0, 1, 0, 7, 8},
				{ 0, 0, 7, 0, 4, 0, 2, 6, 0},
				{ 0, 0, 1, 0, 5, 0, 9, 3, 0},
				{ 9, 0, 4, 0, 6, 0, 0, 0, 5},
				{ 0, 7, 0, 3, 0, 0, 0, 1, 2},
				{ 1, 2, 0, 0, 0, 7, 4, 0, 0},
				{ 0, 4, 9, 2, 0, 6, 0, 0, 7}
		}; 
		// Print board tested
		//Solver_functions.print_board(board);
		
		// Find Empty tested
		//int[] row_col = Solver_functions.find_empty(board);
		
		/* Check Valid tested
		int[] test = {2,7};
		System.out.println(board[2][7]);
		System.out.println(Solver_functions.check_valid(board, 7, test));
		*/
	}
}


