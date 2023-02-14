package menu;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class TestMain extends Application{
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("/menu/menuAll1UI.fxml"));
		
		Parent menuroot = loader.load();
		
		
		
		TestController ctr = loader.getController();
		ctr.setRoot(menuroot);
		
		
		primaryStage.setScene(new Scene(menuroot));
		primaryStage.setTitle("주문목록");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
