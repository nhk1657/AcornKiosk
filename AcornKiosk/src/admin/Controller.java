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
import member.LoginMain;

public class Controller {
	private Parent adminmenu;
	
	private Parent adminMenuManage;
	private Parent adminSaleManage;
	private Parent adminMemberManage;
	private Parent adminCouponManage;
	
	AdminService as;
public void setRoot(Parent adminmenu) {
	this.adminmenu = adminmenu;
}
public Controller() {
	as=new AdminServiceImpl();
}
public void sales() {
	as.sales(adminmenu);
}
public void setSale(Parent adminSaleManage) {
	this.adminSaleManage=adminSaleManage;
}
public void memberManage() {
	as.membermManage(adminmenu);
}
public void setMember(Parent adminMemberManage) {
	this.adminMemberManage=adminMemberManage;
}
public void couponManage() {
	as.couponManage(adminmenu);
}
public void setCoupon(Parent adminCouponManage) {
	this.adminCouponManage=adminCouponManage;
}
public void endSystem() {
	as.endSystem(adminmenu);
}

public void setMenu(Parent adminMenuManage) {
	this.adminMenuManage=adminMenuManage;
}
public void menuManage() {
	as.menuManage(adminmenu);
}

public void menuback(){
	as.menuback(adminMenuManage);
}
public void saleback(){
	as.saleback(adminSaleManage);
}
public void memberback(){
	as.memberback(adminMemberManage);
}
public void couponback(){
	as.couponback(adminCouponManage);
}
public void adminback(){
	as.endAdmin(adminmenu);
}
}

