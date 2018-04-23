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

    private double tileHeight;
    private double tileWidth;
    private double heightOffset;
    private double widthOffset;

    public void calcTilePos(){
        for(int i =0; i<9; i++){
            tilePosX[i] = (tileOrder[i]%3)* tileWidth + widthOffset;
            tilePosY[i] = (tileOrder[i]/3)* tileHeight + heightOffset;
        }
    }

    TilesPosArray(double tileWidth, double tileHeight, double heightOffset, double widthOffset){
        this.tileWidth = tileWidth;
        this.tileHeight = tileHeight;
        this.widthOffset = widthOffset;
        this.heightOffset = heightOffset;
    }

}
