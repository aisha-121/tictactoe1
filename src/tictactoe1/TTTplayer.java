package tictactoe1;

public class TTTplayer {
	
	 private String name;
	 private char mark; // 'X' or 'O'
	 
	 public TTTplayer(String name, char mark) {
	    	this.name = name; // assigns the input name to the player's name
	        this.mark = mark; // assigns the input mark to the player's name
	}

	 // getter method for name
	 public String getName() {
	        return name;
	    }

	// getter method for mark
	 public char getMark() {
	        return mark;
	    }

}
