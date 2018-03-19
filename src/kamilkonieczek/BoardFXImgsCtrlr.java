package kamilkonieczek;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class BoardFXImgsCtrlr {

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
        img11.setX(100);
        img11.setY(0);
        img21.setX(0);
        img21.setY(0);
    }

    @FXML
    public void handleAction(ActionEvent e){

    }
}
