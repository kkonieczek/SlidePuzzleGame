package kamilkonieczek;

public class TilesPosArray {

    private double tileHeight;
    private double tileWidth;
    private double heightOffset;
    private double widthOffset;

    TilesPosArray(double tileWidth, double tileHeight, double heightOffset, double widthOffset){
        this.tileWidth = tileWidth;
        this.tileHeight = tileHeight;
        this.widthOffset = widthOffset;
        this.heightOffset = heightOffset;
    }

    private int tileOrder[] = new int[9];

    public void setTileOrder(int[] tileOrder) {
        this.tileOrder = tileOrder;
    }

    private double tilePosX[] = new double[9]; // array of X coordinate of tiles position
    private double tilePosY[] = new double[9]; // array of Y coordinate of tiles position

    public void calcTilePos(){
        for(int i =0; i<9; i++){
            tilePosX[i] = (tileOrder[i]%3)* tileWidth + widthOffset;
            tilePosY[i] = (tileOrder[i]/3)* tileHeight + heightOffset;
        }
    }

    public double[] getTilePosX() {
        return tilePosX;
    }

    public double[] getTilePosY() {
        return tilePosY;
    }

}
