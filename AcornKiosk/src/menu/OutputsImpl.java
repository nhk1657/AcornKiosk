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
