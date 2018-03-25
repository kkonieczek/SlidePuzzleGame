package kamilkonieczek;

import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

public class ImgBoardFXCtrlr {

    private ImgBoardViewModel imgBoardViewModel = new ImgBoardViewModel();
    private Board board = new Board();
    private TilesPosArray tilesPosArray = new TilesPosArray(150, 150, 25, 25);
    private int[] tilesOrder = {0,1,2,3,4,5,6,7,8};
    private double[] xPos = new double[9];
    private double[] yPos = new double[9];

    private ArrayList<DoubleProperty> imgXPropArray = new  ArrayList<DoubleProperty>();
    private Iterator<DoubleProperty> imgXPropArrayIter = imgXPropArray.iterator();




    @FXML
    public ImageView img11;
    public ImageView img12;
    public ImageView img13;
    public ImageView img21;
    public ImageView img22;
    public ImageView img23;
    public ImageView img31;
    public ImageView img32;
    public ImageView img33;

    @FXML
    void initialize(){

        board.shuffleBoard();
        board.drawBoard();
        tilesOrder = board.getTilesOrder();
        tilesPosArray.setTileOrder(tilesOrder);
        tilesPosArray.calcTilePos();
        xPos = tilesPosArray.getTilePosX();
        yPos = tilesPosArray.getTilePosY();

        img11.setLayoutX(0);
        img12.setLayoutX(0);
        img13.setLayoutX(0);
        img21.setLayoutX(0);
        img22.setLayoutX(0);
        img23.setLayoutX(0);
        img31.setLayoutX(0);
        img32.setLayoutX(0);
        img33.setLayoutX(0);

        img11.setLayoutY(0);
        img12.setLayoutY(0);
        img13.setLayoutY(0);
        img21.setLayoutY(0);
        img22.setLayoutY(0);
        img23.setLayoutY(0);
        img31.setLayoutY(0);
        img32.setLayoutY(0);
        img33.setLayoutY(0);

        imgXPropArray.ensureCapacity(9);


        imgBoardViewModel.setImg11X(xPos[0]);
        imgBoardViewModel.setImg12X(xPos[1]);
        imgBoardViewModel.setImg13X(xPos[2]);
        imgBoardViewModel.setImg21X(xPos[3]);
        imgBoardViewModel.setImg22X(xPos[4]);
        imgBoardViewModel.setImg23X(xPos[5]);
        imgBoardViewModel.setImg31X(xPos[6]);
        imgBoardViewModel.setImg32X(xPos[7]);
        imgBoardViewModel.setImg33X(xPos[8]);

        imgBoardViewModel.setImg11Y(yPos[0]);
        imgBoardViewModel.setImg12Y(yPos[1]);
        imgBoardViewModel.setImg13Y(yPos[2]);
        imgBoardViewModel.setImg21Y(yPos[3]);
        imgBoardViewModel.setImg22Y(yPos[4]);
        imgBoardViewModel.setImg23Y(yPos[5]);
        imgBoardViewModel.setImg31Y(yPos[6]);
        imgBoardViewModel.setImg32Y(yPos[7]);
        imgBoardViewModel.setImg33Y(yPos[8]);

        img11.xProperty().bindBidirectional(imgBoardViewModel.img11XProperty());
        img12.xProperty().bindBidirectional(imgBoardViewModel.img12XProperty());
        img13.xProperty().bindBidirectional(imgBoardViewModel.img13XProperty());
        img21.xProperty().bindBidirectional(imgBoardViewModel.img21XProperty());
        img22.xProperty().bindBidirectional(imgBoardViewModel.img22XProperty());
        img23.xProperty().bindBidirectional(imgBoardViewModel.img23XProperty());
        img31.xProperty().bindBidirectional(imgBoardViewModel.img31XProperty());
        img32.xProperty().bindBidirectional(imgBoardViewModel.img32XProperty());
        img33.xProperty().bindBidirectional(imgBoardViewModel.img33XProperty());

        img11.yProperty().bindBidirectional(imgBoardViewModel.img11YProperty());
        img12.yProperty().bindBidirectional(imgBoardViewModel.img12YProperty());
        img13.yProperty().bindBidirectional(imgBoardViewModel.img13YProperty());
        img21.yProperty().bindBidirectional(imgBoardViewModel.img21YProperty());
        img22.yProperty().bindBidirectional(imgBoardViewModel.img22YProperty());
        img23.yProperty().bindBidirectional(imgBoardViewModel.img23YProperty());
        img31.yProperty().bindBidirectional(imgBoardViewModel.img31YProperty());
        img32.yProperty().bindBidirectional(imgBoardViewModel.img32YProperty());
        img33.yProperty().bindBidirectional(imgBoardViewModel.img33YProperty());
    }

    @FXML
    public void handleAction(MouseEvent e){

        int No=0;
        Move move;
        int i;
        TreeMap<Integer, Integer> tileMap = board.getTileMap();

        if(e.getSource() == img11){
            No = 0;
        }
        else if(e.getSource() == img12){
            No = 1;
        }
        else if(e.getSource() == img13){
            No = 2;
        }
        else if(e.getSource() == img21){
            No = 3;
        }
        else if(e.getSource() == img22){
            No = 4;
        }
        else if(e.getSource() == img23){
            No = 5;
        }
        else if(e.getSource() == img31){
            No = 6;
        }
        else if(e.getSource() == img32){
            No = 7;
        }
        else if(e.getSource() == img33){
            No = 8;
        }

        i = tileMap.get(No);
        move = board.tiles.get(i).getMove();
        System.out.println("i =  " + i + " move " + No + " " + move);
        board.moveTile(No, move);
        tilesOrder = board.getTilesOrder();
        tilesPosArray.setTileOrder(tilesOrder);
        tilesPosArray.calcTilePos();
        xPos = tilesPosArray.getTilePosX();
        yPos = tilesPosArray.getTilePosY();

        imgBoardViewModel.setImg11X(xPos[0]);
        imgBoardViewModel.setImg12X(xPos[1]);
        imgBoardViewModel.setImg13X(xPos[2]);
        imgBoardViewModel.setImg21X(xPos[3]);
        imgBoardViewModel.setImg22X(xPos[4]);
        imgBoardViewModel.setImg23X(xPos[5]);
        imgBoardViewModel.setImg31X(xPos[6]);
        imgBoardViewModel.setImg32X(xPos[7]);
        imgBoardViewModel.setImg33X(xPos[8]);

        imgBoardViewModel.setImg11Y(yPos[0]);
        imgBoardViewModel.setImg12Y(yPos[1]);
        imgBoardViewModel.setImg13Y(yPos[2]);
        imgBoardViewModel.setImg21Y(yPos[3]);
        imgBoardViewModel.setImg22Y(yPos[4]);
        imgBoardViewModel.setImg23Y(yPos[5]);
        imgBoardViewModel.setImg31Y(yPos[6]);
        imgBoardViewModel.setImg32Y(yPos[7]);
        imgBoardViewModel.setImg33Y(yPos[8]);

    }
}
