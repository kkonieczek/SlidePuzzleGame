package kamilkonieczek;

import java.util.Scanner;


public class Application {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		Board board = new Board();
		
		board.shuffleBoard();
		board.drawBoard();
		//board.drawMoves();
		int id = 0;
		String c;
		Move move = Move.UP;

		while(true) {
			
			String dummy;
			while(true) {	
				if(scan.hasNextInt()) {
					id = scan.nextInt();
					break;
				}
				//System.out.println("Try again.");
				dummy = scan.next();
			}
			if(id == -1) break;
			c = scan.next();
			while(!c.equals("a") && !c.equals("d") && !c.equals("w")  && !c.equals("s") ) {
				System.out.println("insert 'a' or 'd' or 'w' or 's'");
				c = scan.next();
			}		
			move = translateMove(c);	        	
	        board.moveTile(id, move); 
	        board.drawBoard();

		}	
		scan.close();
	}
	
	
	public static Move translateMove(String c) {
		Move move = Move.NONE;
		
        switch (c) {
        case "a":  move = Move.LEFT;
                 break;
        case "d":  move = Move.RIGHT;
                 break;
        case "w":  move = Move.UP;
                 break;
        case "s":  move = Move.DOWN;
        		 break;
        }
		return move;
	}

}
