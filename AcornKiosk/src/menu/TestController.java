package menu;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import order.service.addOrderServiceImpl;
import order.service.payMethodServiceImpl;

public class TestController {

	private Parent root;
	private Parent selectpop;
	private Section se;
	private SelectSection ss;
	private SelectPop sp;
	
	public TestController() {
		ss=new SelectSectionImpl();
		se=new SectionImpl();
		sp=new SelectPopImpl();
	}
	
	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
		
	}
	
	public void setSectionUI(Parent selectpop) {
		this.selectpop= selectpop;
	}
	
	public void selectSecBtn() {
		ss.selectSecBtn(root);
	}
	
	public void selectMenuProc() {
		se.selectMenuProc(root); 
	}
	
	public void popClose(ActionEvent event) {
		sp.popClose(event);
	}
	
	public void popChoice(ActionEvent event) {
		sp.popChoice(event);
	}
	
	public void popOption() {
		sp.popOption(selectpop);
	}
}
