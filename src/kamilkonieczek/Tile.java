package kamilkonieczek;

public class Tile{	// a board is composed of 9 tiles


    private String id;
    public String getID() {
        return this.id;
    }
    public void setID(String id) {
        this.id = id;
    }

    private int No;
    public int getNo() {
        return this.No;
    }

    private Move move;
    public Move getMove() {
        return this.move;
    }
    public void setMove(Move move) {
        this.move = move;
    }


    Tile(){
        this.id = "0";
        this.setMove(Move.NONE);
        this.No = 0;
    }

    Tile(String id, Move move){
        this.id = id;
        this.setMove(move);
    }

    Tile(String id, Move move, int No){
        this(id, move);
        this.No = No;
    }

}