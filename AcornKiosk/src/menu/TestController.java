package menu;

import javafx.scene.Parent;
import order.service.addOrderServiceImpl;
import order.service.payMethodServiceImpl;

public class TestController {

	private Parent root;
	private SelectSection ss;
	
	public TestController() {
		ss=new SelectSectionImpl();
	}
	
	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
		
	}
	
	public void selectSecBtn() {
		ss.selectSecBtn();
	}
}
