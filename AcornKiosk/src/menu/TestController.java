package menu;




import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Slider;


public class TestController{

	
	private Parent menuroot;
	private Parent cof;
	private Parent smo;
	private Parent ade;
	private Parent tea;
	private Parent selectpop;
	private Parent selectopt;
	Section se;
	SelectSection ss;
	SelectPop sp;
	Slider slider;
	public void setRoot(Parent menuroot) {
		// TODO Auto-generated method stub
		this.menuroot = menuroot;
		
	}
	public TestController() {
		ss=new SelectSectionImpl();
		se=new SectionImpl();
		sp=new SelectPopImpl();
	}
	
	
	
	
	
	public void setSectionUI(Parent selectpop) {
		this.selectpop= selectpop;
	}
	
	public void returnOptUI(Parent selectopt) {
		this.selectopt=selectopt;
	}
	
	
	
	
	public void selectMenuProc() {
		se.selectMenuProc(menuroot); 
	}
	
	public void selectMenu2Proc() {
		se.selectMenu2Proc(menuroot); 
	}
	
	public void popClose(ActionEvent event) {
		sp.popClose(event);
	}
	
	public void popChoice(ActionEvent event) {
		sp.popChoice(event);
	}
	
	
	
	public void setcofbtn(Parent cof) {
		this.cof=cof;
	}
	public void cofbtn() {
		ss.cofbtn(menuroot);
	}
	public void setadebtn(Parent ade) {
		this.ade=ade;
	}
	
	public void adebtn() {
		ss.adebtn(menuroot);
	}
	public void setteabtn(Parent tea) {
		this.tea=tea;
	}
	public void teabtn() {
		ss.teabtn(menuroot);
	}
	public void setsmobtn(Parent smo) {
		this.smo=smo;
	}
	public void smobtn() {
		ss.smobtn(menuroot);
	}
	
}
