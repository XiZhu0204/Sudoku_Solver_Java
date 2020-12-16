
public class Sudoku_Solver {

	public static void main(String[] args) {
		int[][] board = {
				{ 8, 0, 0, 0, 0, 0, 0, 0, 0},
				{ 0, 0, 3, 6, 0, 0, 0, 0, 0},
				{ 0, 7, 0, 0, 9, 0, 2, 0, 0},
				{ 0, 5, 0, 0, 0, 7, 0, 0, 0},
				{ 0, 0, 0, 0, 4, 5, 7, 0, 0},
				{ 0, 0, 0, 1, 0, 0, 0, 3, 0},
				{ 0, 0, 1, 0, 0, 0, 0, 6, 8},
				{ 0, 0, 8, 5, 0, 0, 0, 1, 0},
				{ 0, 9, 0, 0, 0, 0, 4, 0, 0}
		}; 
		// Print board tested
		//Solver_functions.print_board(board);
		
		// Find Empty tested
		//int[] row_col = Solver_functions.find_empty(board);
		
		//Check Valid tested
		
		/*
		int[] test = {2,3};
		System.out.println(board[2][7]);
		System.out.println(Solver_functions.check_valid(board, 4, test));
		*/
		
		
		if (Solver_functions.solve_sudoku(board)) {
			System.out.println("Sudoku Solved!");
			Solver_functions.print_board(board);
		} else {
			System.out.println("The Sudoku is unsolvable.");
		}
		
		
	}
}


