package order;

import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import order.db.orderMenu;
import order.db.orderdata;
import order.db.orderdataImpl;

public class addOrderMain extends Application{
	orderdata od;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		od = new orderdataImpl();
		
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("addOrderUI.fxml"));
		
		Parent root = loader.load();
		
		//장바구니 db 가져오기
		
		ScrollPane sp = (ScrollPane)root.lookup("#orderList");
		System.out.println(1101);
		TableView<orderMenu> orderTable = new TableView<>();
		
		TableColumn<orderMenu, String> menuid = new TableColumn<>("메뉴id");
		menuid.setCellValueFactory(new PropertyValueFactory<>("menuid"));
		menuid.setPrefWidth(100);
		
		TableColumn<orderMenu, String> menuname = new TableColumn<>("메뉴");
		menuname.setCellValueFactory(new PropertyValueFactory<>("menuname"));
		menuname.setPrefWidth(100);
		
		TableColumn<orderMenu, String> menuprice = new TableColumn<>("가격");
		menuprice.setCellValueFactory(new PropertyValueFactory<>("menuprice"));
		menuprice.setPrefWidth(100);
		
		TableColumn<orderMenu, String> menusell = new TableColumn<>("수량");
		menusell.setCellValueFactory(new PropertyValueFactory<>("menusell"));
		menusell.setPrefWidth(100);
		
		orderTable.getColumns().addAll(menuid,menuname,menuprice,menusell);
		
		List<orderMenu> orderList = od.selectMenu();
		
		
		ObservableList <orderMenu> data =  FXCollections.observableArrayList(orderList);
		
		orderTable.setItems(data);
		orderTable.setPrefSize(400,1000);
		
		sp.setContent(orderTable);
		sp.setPrefSize(400, 300);
		sp.relocate(50, 175);
		
		
		Controller ctrl = loader.getController();
		ctrl.setRoot(root);
		
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("주문목록");
		primaryStage.show();
	}

}
