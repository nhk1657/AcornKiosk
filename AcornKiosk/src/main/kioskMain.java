package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import order.Controller;

public class kioskMain  extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("kioskMain.fxml"));
		
		Parent kioskMainRoot = loader.load();
		
		kioskController ctrl = loader.getController();
		ctrl.setRoot(kioskMainRoot);
		
		primaryStage.setScene(new Scene(kioskMainRoot));
		primaryStage.setTitle("키오스크");
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
}
