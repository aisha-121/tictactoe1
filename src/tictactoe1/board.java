package tictactoe1;

public class board {public static char[][] TTboard;
private final static int SIZE = 3; // tic tac toe is 3x3

	public board() {
		TTboard = new char[SIZE][SIZE];
	    for (int i = 0; i < SIZE; i++) {
	        for (int j = 0; j < SIZE; j++) {
	        	TTboard[i][j] = '-'; // '-' indicates an empty space on the board
	        }
	    }
	}
	
	public void printBoard() {
	    for (int i = 0; i < SIZE; i++) {
	        for (int j = 0; j < SIZE; j++) {
	            System.out.print(TTboard[i][j] + " "); // printing cells in board
	        }
	        System.out.println(); // new line for new row
	    }
	}
	
	// placing symbol on the board
	public boolean placeMark(int row, int col, char symbol) {
		// checking if the cell is empty and valid
	
	    if (row >= 0 && row < SIZE && col >= 0 && col < SIZE && TTboard[row][col] == '-') {
	        TTboard[row][col] = symbol; // adding symbol
	        return true;
	    }
	    return false; // invalid - place is occupied or invalid
	}
	
	// check if the board has no empty spaces and is fully occupied
	public boolean isBoardFull() {
	    for (int i = 0; i < SIZE; i++) {
	        for (int j = 0; j < SIZE; j++) { 
	            if (TTboard[i][j] == '-') { // empty space check
	                return false; 
	            }
	        }
	    }
	    return true; // board is full
	}
	
	// check for a winning - if theres 3 symbols in a row
	public static boolean checkWin() {
	    
		 // checking all the rows to see if there is a win
		for (int row = 0; row < SIZE; row++) {
	        if (TTboard[row][0] != '-' && TTboard[row][0] == TTboard[row][1] && TTboard[row][1] == TTboard[row][2]) {
	            return true; // win
	        }
	    }
	
		// checking all the columns to see if there is a win
	    for (int col = 0; col < SIZE; col++) {
	        if (TTboard[0][col] != '-' && TTboard[0][col] == TTboard[1][col] && TTboard[1][col] == TTboard[2][col]) {
	            return true; // win
	        }
	    }
	
	 // checking for a diagonal win (top-left to bottom-right) 
	    if (TTboard[0][0] != '-' && TTboard[0][0] == TTboard[1][1] && TTboard[1][1] == TTboard[2][2]) {
	        return true; // win
	    }
	    
	
	 // checking for a diagonal win (top-right to bottom-left)
	    if (TTboard[0][2] != '-' && TTboard[0][2] == TTboard[1][1] && TTboard[1][1] == TTboard[2][0]) {
	        return true; // win
	    }
	
	    
	    return false; // theres no 3 in a row symbols for a win
	}
}

