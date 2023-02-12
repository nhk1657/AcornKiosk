package admin;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdminMain extends Application{
@Override
public void start(Stage primaryStage) throws Exception {
	// TODO Auto-generated method stub
	FXMLLoader loader = new FXMLLoader(
			getClass().getResource("service/1_adminMenuUI.fxml"));
	
	Parent root = loader.load();
	
	Controller ctrl = loader.getController();
	
	ctrl.setRoot(root);
	
	primaryStage.setScene(new Scene(root));
	primaryStage.setTitle("관리자모드");
	primaryStage.show();
}
public static void main(String[] args) {
	launch(args);
}
}
