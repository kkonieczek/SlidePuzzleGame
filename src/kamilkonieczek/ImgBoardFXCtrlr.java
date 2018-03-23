package kamilkonieczek;

import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class ImgBoardFXCtrlr {

    ImgBoardViewModel imgBoardViewModel = new ImgBoardViewModel();

    //ArrayList<DoubleProperty> imgPropArray = new  ArrayList<DoubleProperty>();

    

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

        imgBoardViewModel.setImg11X(25);
        imgBoardViewModel.setImg12X(175);
        imgBoardViewModel.setImg13X(325);
        imgBoardViewModel.setImg21X(25);
        imgBoardViewModel.setImg22X(175);
        imgBoardViewModel.setImg23X(325);
        imgBoardViewModel.setImg31X(25);
        imgBoardViewModel.setImg32X(175);
        imgBoardViewModel.setImg33X(325);

        imgBoardViewModel.setImg11Y(25);
        imgBoardViewModel.setImg12Y(25);
        imgBoardViewModel.setImg13Y(25);
        imgBoardViewModel.setImg21Y(175);
        imgBoardViewModel.setImg22Y(175);
        imgBoardViewModel.setImg23Y(175);
        imgBoardViewModel.setImg31Y(325);
        imgBoardViewModel.setImg32Y(325);
        imgBoardViewModel.setImg33Y(325);

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
    public void handleAction(ActionEvent e){

    }
}
