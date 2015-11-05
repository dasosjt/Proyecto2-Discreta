import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{
	public static void main(String[] args){
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane mainPane = (Pane) FXMLLoader.load(Main.class.getResource("myController.fxml"));
		primaryStage.setScene(new Scene(mainPane));
		primaryStage.show();
		
	}

}
