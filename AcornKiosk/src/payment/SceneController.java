package payment;

import java.io.IOException;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import main.kioskMain;
import order.db.orderMenu;
import order.db.orderdata;
import order.db.orderdataImpl;

public class SceneController {
	Stage stage;
	orderdata od = new orderdataImpl();
	orderMenu om;
	private Scene scene;
	@SuppressWarnings("unused")
	private Parent root;

	@FXML 
	private Button canclebutton;
	@FXML 
	private Pane ScenePane;
	
	
	
	public void switchToScene0(ActionEvent event) throws IOException, InterruptedException {
		//Parent root = FXMLLoader.load(getClass().getResource("../main/kioskMain.fxml"));
		//stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		//scene = new Scene(root);
		//stage.setScene(scene);
		//stage.show();
		//Thread.sleep(500);
		Stage returnmain=(Stage)((Node)event.getSource()).getScene().getWindow();
		kioskMain km =new kioskMain();
		try {
			km.start(returnmain);
			od.deleteOrder();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void switchToScene5(ActionEvent event) throws IOException, InterruptedException {
		Parent root = FXMLLoader.load(getClass().getResource("CardCashingFinishUI.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	
	}

	public void switchToScene6(ActionEvent event) throws IOException, InterruptedException {
		Parent root = FXMLLoader.load(getClass().getResource("ShowReceiptUI.fxml"));

		ScrollPane sp = (ScrollPane)root.lookup("#orderList");
		
		TableView<orderMenu> orderTable = new TableView<>();
		
		TableColumn<orderMenu, String> menuid = new TableColumn<>("메뉴id");
		menuid.setCellValueFactory(new PropertyValueFactory<>("menuid"));
		menuid.setPrefWidth(50);
		
		TableColumn<orderMenu, String> menuname = new TableColumn<>("메뉴");
		menuname.setCellValueFactory(new PropertyValueFactory<>("menuname"));
		menuname.setPrefWidth(150);
		
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

		if(orderList.size() != 0) {
			Label sum = (Label)root.lookup("#mm");
			//order
			om = orderList.get(orderList.size()- 1);
			//om = orderList.get();
			om.getSum();
			
			String total = Integer.toString(om.getSum());
			sum.setText(total +" 원");
			
			}
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();


	}




}


