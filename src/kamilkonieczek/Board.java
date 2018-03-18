package kamilkonieczek;

import java.util.ArrayList;
import java.util.Collections;

/*
 * class Board is composed of 9 tiles
 */

public class Board {
	// public fields

	public ArrayList<Tile> tiles = new ArrayList<Tile>();	// array of tiles
	
	//public methods	
	public void shuffleBoard(){								// makes random arrangement of tiles
		Collections.shuffle(tiles);
		setMoves();
	}
	
	public void drawBoard(){								// draws board
		int k = 0;
		System.out.println("-----------------");
		for(int i = 0 ; i <3; i++) {
			for(int j = 0 ; j <3; j++) {
				System.out.printf("|| %s ", tiles.get(k).getID());
				k++;
			}
			System.out.println("||");
			System.out.println("-----------------");
		}
	}
	
	public void moveTile(String tileID, Move move) {	// tries to move tile
		int tileIndex= -1;
		int emptyIndex = -1;
		for(int i =0; i<9; i++) {
			if(tileID.equals(tiles.get(i).getID())) { // find the tile 'i' with id == tileID
				tileIndex = i;
			}
			if(tiles.get(i).getMove() == Move.EMPTY) {
				emptyIndex = i;
			}
		}
		if(tileIndex == -1 || emptyIndex == -1 || move == Move.NONE || move == Move.EMPTY) {
			//System.out.println("Error");
			return;
		}
		if(tiles.get(tileIndex).getMove() == move) { // check if the 'move' is possible			
			replaceTiles(tileIndex, emptyIndex);	// replace tiles			
			setMoves();								// set possible moves for each tile 
		}
	}
	
	// private methods	
	private void replaceTiles(int indexA, int indexB) {		// ...check if this can be simplified
		Tile dummy1 = tiles.get(indexA);
		Tile dummy2 = tiles.get(indexB);
		Tile dummy3 = dummy1;
		dummy1 = dummy2;
		dummy2 = dummy3;
		tiles.set(indexA, dummy1);
		tiles.set(indexB, dummy2);
	}
	
	private void setMoves() {							// assigns possible move to each tile
		int emptyIndex=8;
		for(int i =0; i<9; i++) {
			if(tiles.get(i).getMove() == Move.EMPTY) {
				emptyIndex = i;
			}
		}
		for(int i =0; i<9; i++) {
			if(i == emptyIndex) {
				continue;
			}
			tiles.get(i).setMove(Move.NONE);		// all tiles besides empty tile cannot move at first
		}
		if(emptyIndex - 1 > -1) {
			tiles.get(emptyIndex - 1).setMove(Move.RIGHT); // tile to the left of the empty tile can move to the right
			
			if(emptyIndex - 3 > -1) {
				tiles.get(emptyIndex - 3).setMove(Move.DOWN); // tile above the empty tile can move down
			}
		}
		if(emptyIndex + 1 < 9) {
			tiles.get(emptyIndex + 1).setMove(Move.LEFT); // tile to the right of the empty tile can move to the left
			
			if(emptyIndex + 3 < 9) {
				tiles.get(emptyIndex + 3).setMove(Move.UP); // tile below the empty tile can move up
			}	
		}
	}
	
	// constructors
	Board(){														// default constructor - creates board with 9 tiles (1 tile is empty)
		Integer id = 1;
		String stringID = "1";
		for(int i =0; i<9; i++) {		
			if(id == 9) {
				tiles.add(new Tile("0", Move.EMPTY));
				break;
			}

			tiles.add(new Tile(stringID, Move.NONE));
			id++;
			stringID = id.toString();
		}
		setMoves();
	}
}


