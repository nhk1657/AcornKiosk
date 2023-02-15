package menu;


import java.util.List;


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
import main.kioskMain;
import menu.db.MenuDataImpl;
import menu.db.OrderMenu;
import order.addOrderMain;



public class OutputsImpl implements Outputs{
	MenuDataImpl mt = new MenuDataImpl();
	@Override
	public void menuSelect(Parent menuroot) {
		// TODO Auto-generated method stub
		Stage menuroots = (Stage) menuroot.getScene().getWindow();
		FXMLLoader loader= new FXMLLoader(getClass().getResource("/menu/menuAll1UI.fxml"));
		
		
		Parent menuroot1 = null;
		try {
			menuroot1 = loader.load();
			
			menuroots.setScene(new Scene(menuroot1));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ScrollPane sp = (ScrollPane) menuroot1.lookup("#orderlist");
		
		TableView<OrderMenu> ordertable = new TableView<>();
		TableColumn<OrderMenu, String> menuname = new TableColumn<>("메뉴");
		menuname.setCellValueFactory(new PropertyValueFactory<>("menuname"));
		menuname.setPrefWidth(115);
		TableColumn<OrderMenu, String> menuprice = new TableColumn<>("가격");
		menuprice.setCellValueFactory(new PropertyValueFactory<>("menuprice"));
		menuprice.setPrefWidth(90);
		TableColumn<OrderMenu, String> menusell = new TableColumn<>("판매량");
		menusell.setCellValueFactory(new PropertyValueFactory<>("menusell"));
		menusell.setPrefWidth(90);
		
		ordertable.getColumns().addAll(menuname,menuprice,menusell);
		
		List<OrderMenu> orderlist = mt.menuoutput();

		
		ObservableList<OrderMenu> data = FXCollections.observableArrayList(orderlist);
		ordertable.setItems(data);
		ordertable.setPrefSize(295, 150);
		
		sp.setContent(ordertable);
		//sp.getChildrenUnmodifiable().add(menuTable);
		sp.setPrefSize(295, 150);
		
		
		
		Controller ctrl = loader.getController();
		ctrl.setmenu(menuroot1);
		menuroots.setTitle("매출 확인");
		menuroots.show();
	}
	@Override
	public void cancelbtn(Parent menuroot) {
		// TODO Auto-generated method stub
		Stage menuroots = (Stage) menuroot.getScene().getWindow();
		kioskMain km = new kioskMain();

		try {
			km.start(menuroots);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void cashbtn(Parent menuroot) {
		// TODO Auto-generated method stub
		Stage menuroots = (Stage) menuroot.getScene().getWindow();
		addOrderMain aom = new addOrderMain();
		
		try {
			aom.start(menuroots);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
