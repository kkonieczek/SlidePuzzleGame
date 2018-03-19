package kamilkonieczek;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

	private Stage window;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader();
		Parent root = loader.load(getClass().getResource("BoardFX.fxml"));

		window = primaryStage;
		window.setTitle("Slide Puzzle Game");
		window.setScene(new Scene(root));
		window.setResizable(false);
		window.show();
	}
}