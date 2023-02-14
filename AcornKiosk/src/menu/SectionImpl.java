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

public class SectionImpl implements Section{
	MenuTest mt;
	private String name;
	private int price;
	private int id;
	private int num=0;
	
	
	public SectionImpl(){
		mt = new MenuTestImpl();
	}
	@Override
	public void selectMenuProc(Parent root) {
		mt=new MenuTestImpl();
		// TODO Auto-generated method stub
		Stage selectPopUI = new Stage();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("selectPopUI.fxml"));
		
		Parent selectpop = null;
		try {
			selectpop = loader.load();
			selectPopUI.setScene(new Scene(selectpop));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		TestController ctrl = loader.getController();
		
		ctrl.setSectionUI(selectpop);
		selectPopUI.setTitle("메뉴 옵션 선택");
		selectPopUI.show();
		
		
	}

	@Override
	public void selectMenu2Proc(Parent root) {
		// TODO Auto-generated method stub
		id=2;
		name=mt.menuName(2);
		price=mt.menuPrice(2);
		Orders o=new Orders();
		o.setId(id);
		o.setName(name);
		o.setPrice(price);
		try {
			mt.input1(o);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(name);
		System.out.println(price);
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
		
		TestController ctrl = loader.getController();
		
		ctrl.setSectionUI(selectpop);
		selectPopUI.setTitle("메뉴 옵션 선택");
		selectPopUI.show();
		num=2;
	}
	
	public int num() {
		return num;
	}
}
