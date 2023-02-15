package menu;



import java.util.List;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import menu.db.MenuMen;
import menu.db.MenuTest;
import menu.db.MenuTestImpl;
import menu.db.Orders;
import order.db.orderMenu;

public class SectionImpl implements Section{
	MenuTest mt;
	static int menu_id;
	static String menu_name;
	static int menu_price;
	SelectSectionImpl ss=new SelectSectionImpl();
	
	public SectionImpl(){
		mt = new MenuTestImpl();
	}
	@Override
	public void selectMenu1Proc(Parent root) {
		// TODO Auto-generated method stub
		menu_id=1;
		menu_name=mt.menuName((ss.secnum*10)+menu_id);
		menu_price=mt.menuPrice(mt.menuPrice((ss.secnum*10)+menu_id));
		Stage selectPopUI =  new Stage();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("selectPopUI.fxml"));
		
		Parent selectpop = null;
		try {
			selectpop = loader.load();
			selectPopUI.setScene(new Scene(selectpop));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		
		ctrl.setSectionUI(selectpop);
		selectPopUI.setTitle("메뉴 옵션 선택");
		selectPopUI.show();
		
		
	}

	@Override
	public void selectMenu2Proc(Parent root) {
		// TODO Auto-generated method stub
		menu_id=2;
		menu_name=mt.menuName((ss.secnum*10)+menu_id);
		menu_price=mt.menuPrice(mt.menuPrice((ss.secnum*10)+menu_id));
		Stage selectPopUI = new Stage();
		System.out.println();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("selectPopUI.fxml"));
		
		Parent selectpop = null;
		try {
			selectpop = loader.load();
			selectPopUI.setScene(new Scene(selectpop));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		
		ctrl.setSectionUI(selectpop);
		selectPopUI.setTitle("메뉴 옵션 선택");
		selectPopUI.show();
	}
	@Override
	public void selectMenu3Proc(Parent root) {
		// TODO Auto-generated method stub
		menu_id=3;
		menu_name=mt.menuName((ss.secnum*10)+menu_id);
		menu_price=mt.menuPrice(mt.menuPrice((ss.secnum*10)+menu_id));
		Stage selectPopUI =  new Stage();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("selectPopUI.fxml"));
		
		Parent selectpop = null;
		try {
			selectpop = loader.load();
			selectPopUI.setScene(new Scene(selectpop));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		
		ctrl.setSectionUI(selectpop);
		selectPopUI.setTitle("메뉴 옵션 선택");
		selectPopUI.show();
		
		
	}
	@Override
	public void selectMenu4Proc(Parent root) {
		// TODO Auto-generated method stub
		menu_id=4;
		menu_name=mt.menuName((ss.secnum*10)+menu_id);
		menu_price=mt.menuPrice(mt.menuPrice((ss.secnum*10)+menu_id));
		Stage selectPopUI =  new Stage();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("selectPopUI.fxml"));
		
		Parent selectpop = null;
		try {
			selectpop = loader.load();
			selectPopUI.setScene(new Scene(selectpop));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		
		ctrl.setSectionUI(selectpop);
		selectPopUI.setTitle("메뉴 옵션 선택");
		selectPopUI.show();
		
		
	}
	@Override
	public void selectMenu5Proc(Parent root) {
		// TODO Auto-generated method stub
		menu_id=5;
		menu_name=mt.menuName((ss.secnum*10)+menu_id);
		menu_price=mt.menuPrice(mt.menuPrice((ss.secnum*10)+menu_id));
		Stage selectPopUI =  new Stage();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("selectPopUI.fxml"));
		
		Parent selectpop = null;
		try {
			selectpop = loader.load();
			selectPopUI.setScene(new Scene(selectpop));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		
		ctrl.setSectionUI(selectpop);
		selectPopUI.setTitle("메뉴 옵션 선택");
		selectPopUI.show();
		
		
	}
	@Override
	public void selectMenu6Proc(Parent root) {
		// TODO Auto-generated method stub
		menu_id=6;
		menu_name=mt.menuName((ss.secnum*10)+menu_id);
		menu_price=mt.menuPrice(mt.menuPrice((ss.secnum*10)+menu_id));
		Stage selectPopUI =  new Stage();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("selectPopUI.fxml"));
		
		Parent selectpop = null;
		try {
			selectpop = loader.load();
			selectPopUI.setScene(new Scene(selectpop));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		
		ctrl.setSectionUI(selectpop);
		selectPopUI.setTitle("메뉴 옵션 선택");
		selectPopUI.show();
		
		
	}
	@Override
	public void selectMenu7Proc(Parent root) {
		// TODO Auto-generated method stub
		menu_id=7;
		menu_name=mt.menuName((ss.secnum*10)+menu_id);
		menu_price=mt.menuPrice(mt.menuPrice((ss.secnum*10)+menu_id));
		Stage selectPopUI =  new Stage();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("selectPopUI.fxml"));
		
		Parent selectpop = null;
		try {
			selectpop = loader.load();
			selectPopUI.setScene(new Scene(selectpop));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		
		ctrl.setSectionUI(selectpop);
		selectPopUI.setTitle("메뉴 옵션 선택");
		selectPopUI.show();
		
		
	}
	@Override
	public void selectMenu8Proc(Parent root) {
		// TODO Auto-generated method stub
		menu_id=8;
		menu_name=mt.menuName((ss.secnum*10)+menu_id);
		menu_price=mt.menuPrice(mt.menuPrice((ss.secnum*10)+menu_id));
		Stage selectPopUI =  new Stage();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("selectPopUI.fxml"));
		
		Parent selectpop = null;
		try {
			selectpop = loader.load();
			selectPopUI.setScene(new Scene(selectpop));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		
		ctrl.setSectionUI(selectpop);
		selectPopUI.setTitle("메뉴 옵션 선택");
		selectPopUI.show();
		
		
	}
	@Override
	public void selectMenu9Proc(Parent root) {
		// TODO Auto-generated method stub
		menu_id=9;
		menu_name=mt.menuName((ss.secnum*10)+menu_id);
		menu_price=mt.menuPrice(mt.menuPrice((ss.secnum*10)+menu_id));
		Stage selectPopUI =  new Stage();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("selectPopUI.fxml"));
		
		Parent selectpop = null;
		try {
			selectpop = loader.load();
			selectPopUI.setScene(new Scene(selectpop));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		
		ctrl.setSectionUI(selectpop);
		selectPopUI.setTitle("메뉴 옵션 선택");
		selectPopUI.show();
		
		
	}
	

}
