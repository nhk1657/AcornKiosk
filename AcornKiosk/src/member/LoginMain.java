package member;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("loginUI.fxml"));
		
		Parent loginRoot = loader.load();
	
		Controller ctrl = loader.getController();
		ctrl.setRoot(loginRoot);
		
		primaryStage.setScene(new Scene(loginRoot));
		primaryStage.setTitle("로그인");
		primaryStage.show();	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
