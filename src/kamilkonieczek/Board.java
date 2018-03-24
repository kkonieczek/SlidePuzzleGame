package kamilkonieczek;

import java.util.ArrayList;
import java.util.Collections;

/*
 * class Board is composed of 9 tiles
 */

public class Board {

    public ArrayList<Tile> tiles = new ArrayList<Tile>();	// array of tiles

    private int[] tilesOrder = {0,1,2,3,4,5,6,7,8};
	public int[] getTilesOrder() {
		for(int i =0; i<9; i++){
			tilesOrder[i]=tiles.get(i).getNo();
		}
		return tilesOrder;
	}


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
			if(tiles.get(i).getMove() == Move.EMPTY) { //finds empty tile
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
	

	Board(){		// default constructor - creates board with 9 tiles (1 tile is empty)
		Integer No = 0;
		String stringID = "0";
		for(int i =0; i<9; i++) {		
			if(No == 8) {
				tiles.add(new Tile("8", Move.EMPTY, No));
				break;
			}

			tiles.add(new Tile(stringID, Move.NONE, No));
			No++;
			stringID = No.toString();
		}
		setMoves();
	}
}


