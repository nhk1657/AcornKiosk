package menu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class TestMain extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("/menu/menuAllUI.fxml"));
		
		Parent root = loader.load();
		
		TestController ctr = loader.getController();
		ctr.setRoot(root);
		
		
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("주문목록");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
