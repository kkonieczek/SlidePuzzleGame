package kamilkonieczek;

public class Tile{	// a board is composed of 9 tiles

    // private fields
    private String id;
    private Move move;

    // public methods
    public String getID() {
        return this.id;
    }
    public void setID(String id) {
        this.id = id;
    }
    public Move getMove() {
        return move;
    }
    public void setMove(Move move) {
        this.move = move;
    }

    // constructors
    Tile(){
        this.id = "0";
        this.setMove(Move.NONE);
    }

    Tile(String id, Move move){
        this.id = id;
        this.setMove(move);
    }

}