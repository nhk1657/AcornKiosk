package admin.service;

import admin.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdminServiceImpl implements AdminService{



	@Override
	public void menuEdit(Parent root) {
		// TODO Auto-generated method stub
		Stage menuEdit = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("2.2_menuEditUI.fxml"));
		
		Parent menued = null;
		try {
			menued = loader.load();
			
			menuEdit.setScene(new Scene(menued));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		ctrl.setMenuded(menued);
		menuEdit.setTitle("메뉴 변경");
		menuEdit.show();
	}

	@Override
	public void sales(Parent root) {
		// TODO Auto-generated method stub
		Stage sales = (Stage) root.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("3_salesUI.fxml"));
		
		Parent sale = null;
		try {
			sale = loader.load();
			
			sales.setScene(new Scene(sale));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		ctrl.setSale(sale);
		sales.setTitle("매출 확인");
		sales.show();
	}

	@Override
	public void membermManage(Parent root) {
		// TODO Auto-generated method stub
		Stage memberManage = (Stage) root.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("4_memberManageUI.fxml"));
		
		Parent member = null;
		try {
			member = loader.load();
			
			memberManage.setScene(new Scene(member));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		ctrl.setMember(member);
		memberManage.setTitle("회원 관리");
		memberManage.show();
	}

	@Override
	public void memberEdit(Parent root) {
		// TODO Auto-generated method stub
		Stage memberEdit = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("4.2_memberEditUI.fxml"));
		
		Parent membered = null;
		try {
			membered = loader.load();
			
			memberEdit.setScene(new Scene(membered));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		ctrl.setMembered(membered);
		memberEdit.setTitle("쿠폰 관리");
		memberEdit.show();
	}

	@Override
	public void couponManage(Parent root) {
		// TODO Auto-generated method stub
		Stage couponManage = (Stage) root.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("5_couponManageUI.fxml"));
		
		Parent coupon = null;
		try {
			coupon = loader.load();
			
			couponManage.setScene(new Scene(coupon));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		ctrl.setCoupon(coupon);
		couponManage.setTitle("쿠폰 관리");
		couponManage.show();
	}

	@Override
	public void endSystem(Parent root) {
		// TODO Auto-generated method stub
		Stage endSystem = (Stage) root.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("6_endSystemUI.fxml"));
		
		Parent end = null;
		try {
			end = loader.load();
			
			endSystem.setScene(new Scene(end));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		ctrl.setEnd(end);
		endSystem.setTitle("시스템 종료");
		endSystem.show();
	}

	@Override
	public void menuManage(Parent root) {
		// TODO Auto-generated method stub
		Stage menuManage = (Stage) root.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("2_menuManageUI.fxml"));
		
		Parent menu = null;
		try {
			menu = loader.load();
			
			menuManage.setScene(new Scene(menu));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		ctrl.setMenu(menu);
		menuManage.setTitle("메뉴설정");
		menuManage.show();
	}

}
