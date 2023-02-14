package admin;

import java.awt.Button;
import java.io.IOException;
import java.util.ResourceBundle;

import admin.service.AdminService;
import admin.service.AdminServiceImpl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
	private Parent root;
	private Stage stage;
	private Parent menu;
	private Parent sale;
	private Parent member;
	private Parent coupon;
	private Parent end;
	private Parent menued;
	private Parent membered;
	AdminService as;
public void setRoot(Parent root) {
	this.root = root;
}
public Controller() {
	as=new AdminServiceImpl();
}
public void sales() {
	as.sales(root);
}
public void setSale(Parent sale) {
	this.sale=sale;
}
public void memberManage() {
	as.membermManage(root);
}
public void setMember(Parent member) {
	this.member=member;
}
public void couponManage() {
	as.couponManage(root);
}
public void setCoupon(Parent coupon) {
	this.coupon=coupon;
}
public void endSystem() {
	as.endSystem(root);
}
public void setEnd(Parent end) {
	this.end=end;
}
public void endAdmin() {
	
}
public void setMenu(Parent menu) {
	this.menu=menu;
}
public void menuManage() {
	as.menuManage(root);
}
public void menuEdit() {
	as.menuEdit(root);
}
public void setMenuded(Parent menued) {
	// TODO Auto-generated method stub
	this.menued=menued;
}
public void memberEdit() {
	as.memberEdit(root);
}
public void setMembered(Parent membered) {
	// TODO Auto-generated method stub
	this.membered=membered;
}
public void yes() {
	
}
public void no() {
	
}
}

