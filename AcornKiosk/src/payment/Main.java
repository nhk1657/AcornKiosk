package payment;
import order.db.orderMenu;
import order.db.orderdata;
import order.db.orderdataImpl;

import java.util.List;


import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class Main extends Application {
	orderdataImpl od=new orderdataImpl();
	orderMenu om;
	List<orderMenu> orderList = od.selectMenu();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("CardCashingUI.fxml"));
			Scene scene = new Scene(root,500,700);
			if(orderList.size() != 0) {
				Label sum = (Label)root.lookup("#ma");
				//order
				om = orderList.get(orderList.size()- 1);
				//om = orderList.get();
				om.getSum();
				
				String total = Integer.toString(om.getSum());
				sum.setText(total +" 원");
				
				}
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