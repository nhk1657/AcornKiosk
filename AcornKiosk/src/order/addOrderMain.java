package order;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class addOrderMain extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("addOrder.fxml"));
		
		Parent root = loader.load();
		Controller ctrl = loader.getController();
		ctrl.setRoot(root);
		
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("주문목록");
		primaryStage.show();
	}

}
