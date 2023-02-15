package menu;




import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Slider;
import menu.db.Orders;


public class Controller{
	
	Outputs op;
	Parent menuroot;
	Parent selectpop;
	Parent selectopt;
	Section se;
	SelectSection ss;
	SelectPop sp;
	Slider slider;
	public void setmenu(Parent menuroot) {
		// TODO Auto-generated method stub
		this.menuroot = menuroot;
		
	}
	public Controller() {
		ss=new SelectSectionImpl();
		se=new SectionImpl();
		sp=new SelectPopImpl();
		op=new OutputsImpl();
	}
	
	
	
	
	
	public void setSectionUI(Parent selectpop) {
		this.selectpop= selectpop;
	}
	
	public void returnOptUI(Parent selectopt) {
		this.selectopt=selectopt;
	}
	
	
	
	
	public void selectMenu1Proc() {
		se.selectMenu1Proc(menuroot); 
	}
	
	public void selectMenu2Proc() {
		se.selectMenu2Proc(menuroot); 
	}
	public void selectMenu3Proc() {
		se.selectMenu3Proc(menuroot); 
	}
	
	public void selectMenu4Proc() {
		se.selectMenu4Proc(menuroot); 
	}
	public void selectMenu5Proc() {
		se.selectMenu5Proc(menuroot); 
	}
	
	public void selectMenu6Proc() {
		se.selectMenu6Proc(menuroot); 
	}
	public void selectMenu7Proc() {
		se.selectMenu7Proc(menuroot); 
	}
	
	public void selectMenu8Proc() {
		se.selectMenu8Proc(menuroot); 
	}
	public void selectMenu9Proc() {
		se.selectMenu9Proc(menuroot); 
	}
	
	public void popClose(ActionEvent event) {
		sp.popClose(event);
	}
	
	public void popChoice(ActionEvent event) {
		sp.popChoice(event, selectpop, menuroot);
		
	}
	public void hot() {
		sp.hot(selectpop);
	}
	public void cold() {
		sp.cold(selectpop);
	}
	public void sizesmall() {
		sp.sizesmall(selectpop);
	}
	public void sizemid() {
		sp.sizemid(selectpop);
	}
	public void sizelarge() {
		sp.sizelarge(selectpop);
	}
	public void sugarlarge() {
		sp.sugarlarge(selectpop);
	}
	public void sugarsmall() {
		sp.sugarsmall(selectpop);
	}
	
	
	public void cofbtn() {
		ss.cofbtn(menuroot);
	}
	
	
	public void adebtn() {
		ss.adebtn(menuroot);
	}
	
	public void teabtn() {
		ss.teabtn(menuroot);
	}
	
	public void smobtn() {
		ss.smobtn(menuroot);
	}
	public void cancelbtn() {
		op.cancelbtn(menuroot);
	}
	public void cashbtn() {
		op.cashbtn(menuroot);
	}
}
