package kamilkonieczek;

public class TilesPosArray {

    private double tilePosX[] = new double[9];
    private double tilePosY[] = new double[9];

    public double[] getTilePosX() {
        return tilePosX;
    }

    public double[] getTilePosY() {
        return tilePosY;
    }

    private int tileOrder[] = new int[9];

    public void setTileOrder(int[] tileOrder) {
        this.tileOrder = tileOrder;
    }

    private double tileHeitht=100;
    private double tileWidth=100;
    private double heightOffset=0;
    private double widthOffset=0;

    public void calcTilePos(){
        for(int i =0; i<9; i++){
            tilePosX[i] = (tileOrder[i]%3)* tileWidth;
            tilePosY[i] = (tileOrder[i]/3)* tileHeitht;
        }
    }

    TilesPosArray(double tileWidth, double tileHeitht, double heightOffset, double widthOffset){
        this.tileWidth = tileWidth;
        this.tileHeitht = tileHeitht;
        this.widthOffset = widthOffset;
        this.heightOffset = heightOffset;
    }

}
