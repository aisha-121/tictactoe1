package tictactoe1;

import java.util.Scanner;

public class gameplay {
	
    private TTTplayer currentPlayer; // the current player
    private TTTplayer player1; // player object for the first player
    private TTTplayer player2; // player object for the second player
    private boolean isGameOver; // flag to determine if the game is over
    private board board; // represents the classic tic tac toe game board
    
    public gameplay(TTTplayer player1, TTTplayer player2) {
        this.player1 = player1; // distinguishing between class fields and parameters
        this.player2 = player2;
        this.currentPlayer = player1; // starting the game with player one
        this.board = new board(); // new game board initialised
        this.isGameOver = false;
    }
    
    

    private void switchPlayers() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }
    
    
    // loop for the bulk of the gameplay 
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        
        board.printBoard(); // starting the game by printing the classic 3 x 3 board

        while (!isGameOver) { // the loop will continue to run until the game is over (a winner or a draw)
        	// asking current player for their move
            System.out.println(currentPlayer.getName() + " (" + currentPlayer.getMark() + "), enter row and column into the console to place your mark! :");
            int row = scanner.nextInt() - 1; 
            int col = scanner.nextInt() - 1; 
            
            if (board.placeMark(row, col, currentPlayer.getMark())) { // placing mark on chosen spot
                board.printBoard(); // prints the game board again after a move has been made by player
                if (board.checkWin()) { // check if the current move won the game
                    System.out.println("Congratulations, " + currentPlayer.getName() + "! You have won!! ");
                    isGameOver = true; // the game ends with a win
                   
                } else if (board.isBoardFull()) { // checking if the board is full with no win - so its a tie
                    System.out.println("Ohhh so close! The game is a tie!");
                    isGameOver = true; // the game ends in a tie
                    
                } else {
                    
                    switchPlayers(); // the game continues since there is no win or tie 
                }
            } else {
            	// error handling if chosen spot is invalid
                System.out.println("Oh no! This position is already occupied or out of bounds, please enter again.");
            }
        }

        scanner.close();
    }   
    
    
    

}
