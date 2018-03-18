package kamilkonieczek;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class BoardFXController {



    @FXML
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

        boardViewModel.setTile1(board.tiles.get(0).getID());
        boardViewModel.setTile2(board.tiles.get(1).getID());
        boardViewModel.setTile3(board.tiles.get(2).getID());
        boardViewModel.setTile4(board.tiles.get(3).getID());
        boardViewModel.setTile5(board.tiles.get(4).getID());
        boardViewModel.setTile6(board.tiles.get(5).getID());
        boardViewModel.setTile7(board.tiles.get(6).getID());
        boardViewModel.setTile8(board.tiles.get(7).getID());
        boardViewModel.setTile9(board.tiles.get(8).getID());


/*        button1.setText("1");
        button2.setText("2");
        button3.setText("3");
        button4.setText("4");
        button5.setText("5");
        button6.setText("6");
        button7.setText("7");
        button8.setText("8");
        button9.setText("9");*/

        button1.textProperty().bindBidirectional(boardViewModel.tile1Property());
        button2.textProperty().bindBidirectional(boardViewModel.tile2Property());
        button3.textProperty().bindBidirectional(boardViewModel.tile3Property());
        button4.textProperty().bindBidirectional(boardViewModel.tile4Property());
        button5.textProperty().bindBidirectional(boardViewModel.tile5Property());
        button6.textProperty().bindBidirectional(boardViewModel.tile6Property());
        button7.textProperty().bindBidirectional(boardViewModel.tile7Property());
        button8.textProperty().bindBidirectional(boardViewModel.tile8Property());
        button9.textProperty().bindBidirectional(boardViewModel.tile9Property());
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
