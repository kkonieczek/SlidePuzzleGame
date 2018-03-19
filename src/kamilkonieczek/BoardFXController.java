package kamilkonieczek;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class BoardFXController {

    @FXML
    public GridPane gridPane;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;

    private BoardViewModel boardViewModel = new BoardViewModel();
    private Board board = new Board();

    @FXML
    void initialize(){

        board.shuffleBoard();
        board.drawBoard();
        double windowPrefHeight = 300;
        double windowPrefWidth = 300;

        boardViewModel.setTile1(board.tiles.get(0).getID());
        boardViewModel.setTile2(board.tiles.get(1).getID());
        boardViewModel.setTile3(board.tiles.get(2).getID());
        boardViewModel.setTile4(board.tiles.get(3).getID());
        boardViewModel.setTile5(board.tiles.get(4).getID());
        boardViewModel.setTile6(board.tiles.get(5).getID());
        boardViewModel.setTile7(board.tiles.get(6).getID());
        boardViewModel.setTile8(board.tiles.get(7).getID());
        boardViewModel.setTile9(board.tiles.get(8).getID());

        button1.textProperty().bindBidirectional(boardViewModel.tile1Property());
        button2.textProperty().bindBidirectional(boardViewModel.tile2Property());
        button3.textProperty().bindBidirectional(boardViewModel.tile3Property());
        button4.textProperty().bindBidirectional(boardViewModel.tile4Property());
        button5.textProperty().bindBidirectional(boardViewModel.tile5Property());
        button6.textProperty().bindBidirectional(boardViewModel.tile6Property());
        button7.textProperty().bindBidirectional(boardViewModel.tile7Property());
        button8.textProperty().bindBidirectional(boardViewModel.tile8Property());
        button9.textProperty().bindBidirectional(boardViewModel.tile9Property());

        button1.setFont(Font.font(36));

        gridPane.setPrefSize(windowPrefWidth , windowPrefHeight);
        button1.setPrefSize(windowPrefHeight/3-10, windowPrefWidth/3-10);
        button2.setPrefSize(windowPrefHeight/3-10, windowPrefWidth/3-10);
        button3.setPrefSize(windowPrefHeight/3-10, windowPrefWidth/3-10);
        button4.setPrefSize(windowPrefHeight/3-10, windowPrefWidth/3-10);
        button5.setPrefSize(windowPrefHeight/3-10, windowPrefWidth/3-10);
        button6.setPrefSize(windowPrefHeight/3-10, windowPrefWidth/3-10);
        button7.setPrefSize(windowPrefHeight/3-10, windowPrefWidth/3-10);
        button8.setPrefSize(windowPrefHeight/3-10, windowPrefWidth/3-10);
        button9.setPrefSize(windowPrefHeight/3-10, windowPrefWidth/3-10);


    }

    @FXML
    public void handleAction(ActionEvent e){

        String tileID;
        Move move;
        int i=0;

        if(e.getSource() == button1){
            i=0;
        }
        else if(e.getSource() == button2){
            i=1;
        }
        else if(e.getSource() == button3){
            i=2;
        }
        else if(e.getSource() == button4){
            i=3;
        }
        else if(e.getSource() == button5){
            i=4;
        }
        else if(e.getSource() == button6){
            i=5;
        }
        else if(e.getSource() == button7){
            i=6;
        }
        else if(e.getSource() == button8){
            i=7;
        }
        else if(e.getSource() == button9){
            i=8;
        }

        tileID = board.tiles.get(i).getID();
        move = board.tiles.get(i).getMove();
        board.moveTile(tileID, move);

        boardViewModel.setTile1(board.tiles.get(0).getID());
        boardViewModel.setTile2(board.tiles.get(1).getID());
        boardViewModel.setTile3(board.tiles.get(2).getID());
        boardViewModel.setTile4(board.tiles.get(3).getID());
        boardViewModel.setTile5(board.tiles.get(4).getID());
        boardViewModel.setTile6(board.tiles.get(5).getID());
        boardViewModel.setTile7(board.tiles.get(6).getID());
        boardViewModel.setTile8(board.tiles.get(7).getID());
        boardViewModel.setTile9(board.tiles.get(8).getID());

    }
}
