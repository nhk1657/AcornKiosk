package payment;
	
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("CardCashingUI.fxml"));
<<<<<<< HEAD
			Scene scene = new Scene(root,500,700);


=======
			Scene scene = new Scene(root,500,750);
>>>>>>> branch 'master' of https://github.com/nhk1657/AcornKiosk.git
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}

