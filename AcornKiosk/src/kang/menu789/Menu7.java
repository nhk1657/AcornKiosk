package kang.menu789;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Menu7 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("../page09.fxml"));
		
		Parent root = loader.load();
//		Controller ctrl = loader.getController();
//		ctrl.setRoot(root);
//		
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("로그인");
		primaryStage.show();
	}
public static void main(String[] args) {
	launch(args);
}
}
