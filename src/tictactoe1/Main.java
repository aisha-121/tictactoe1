package tictactoe1;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-----------");
		System.out.println("Tic Tac Toe");
		System.out.println("-----------");
		System.out.println();
		System.out.println("Welcome to Tic Tac Toe!!");
		System.out.println();
		
		
		System.out.println("Player 1 (X)!!! What's your name? : ");
        String player1Name = scanner.nextLine();
        System.out.println("Player 2 (O)!!! Whats your name? : ");
        String player2Name = scanner.nextLine();
        System.out.println();
        
        TTTplayer player1 = new TTTplayer(player1Name, 'X'); // player 1 object
        TTTplayer player2 = new TTTplayer(player2Name, 'O'); // player 2 object


        gameplay gameplay = new gameplay(player1, player2); // initialising game with player objects
        gameplay.playGame(); // start game
        
		System.out.println("Thank you for playing!! Play again soon ^_^ ");

        scanner.close(); // close scanner
		
	}

}
