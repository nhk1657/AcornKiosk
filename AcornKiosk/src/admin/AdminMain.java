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
	
	Parent adminmenu = loader.load();
	
	Controller ctrl = loader.getController();
	
	ctrl.setRoot(adminmenu);
	
	primaryStage.setScene(new Scene(adminmenu));
	primaryStage.setTitle("관리자모드");
	primaryStage.show();
}
public static void main(String[] args) {
	launch(args);
}
}
