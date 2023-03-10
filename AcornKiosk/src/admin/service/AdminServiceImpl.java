package admin.service;

import java.io.IOException;
import java.util.List;

import admin.Controller;
import admin.dataTest.Coupon;
import admin.dataTest.Member;
import admin.dataTest.Menu;
import admin.dataTest.dataTest;
import admin.dataTest.dataTestImpl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import main.kioskMain;
import member.LoginMain;

public class AdminServiceImpl implements AdminService{
	private Parent adminMenuManage = null;
	private dataTest dt;
	private Stage stage;

	@Override
	public void sales(Parent adminSaleManage) {
		// TODO Auto-generated method stub
		dt=new dataTestImpl();
		
		Stage sales = (Stage) adminSaleManage.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("3_salesUI.fxml"));
		
		Parent sale = null;
		try {
			sale = loader.load();
			
			sales.setScene(new Scene(sale));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ScrollPane sp = (ScrollPane) sale.lookup("#saleList");
		
		TableView<Menu> saleTable = new TableView<>();
		
		TableColumn<Menu, String> menuname = new TableColumn<>("메뉴");
		menuname.setCellValueFactory(new PropertyValueFactory<>("menuname"));
		menuname.setPrefWidth(100);
		TableColumn<Menu, String> menuprice = new TableColumn<>("가격");
		menuprice.setCellValueFactory(new PropertyValueFactory<>("menuprice"));
		menuprice.setPrefWidth(100);
		TableColumn<Menu, String> menusell = new TableColumn<>("판매량");
		menusell.setCellValueFactory(new PropertyValueFactory<>("menusell"));
		menusell.setPrefWidth(100);
		TableColumn<Menu, String> menusale = new TableColumn<>("판매 금액");
		menusale.setCellValueFactory(new PropertyValueFactory<>("menusale"));
		menusale.setPrefWidth(100);
		
		saleTable.getColumns().addAll(menuname,menuprice,menusell,menusale);
		
		List<Menu> saleList = dt.selectSale(); 

		
		ObservableList<Menu> data = FXCollections.observableArrayList(saleList);
		saleTable.setItems(data);
		saleTable.setPrefSize(400, 1000);
		
		sp.setContent(saleTable);
		//sp.getChildrenUnmodifiable().add(menuTable);
		sp.setPrefSize(400, 400);
		sp.relocate(50, 175);
		
		
		
		Controller ctrl = loader.getController();
		ctrl.setSale(sale);
		sales.setTitle("매출 확인");
		sales.show();
	}

	@Override
	public void membermManage(Parent adminMemberManage) {
		// TODO Auto-generated method stub
		dt=new dataTestImpl();
		Stage memberManage = (Stage) adminMemberManage.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("4_memberManageUI.fxml"));
		
		Parent member = null;
		try {
			member = loader.load();
			
			memberManage.setScene(new Scene(member));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ScrollPane sp = (ScrollPane) member.lookup("#memberList");
		
		TableView<Member> memberTable = new TableView<>();
		
		TableColumn<Member, String> id = new TableColumn<>("아이디");
		id.setCellValueFactory(new PropertyValueFactory<>("id"));
		id.setPrefWidth(100);
		TableColumn<Member, String> pw = new TableColumn<>("비밀번호");
		pw.setCellValueFactory(new PropertyValueFactory<>("pw"));
		pw.setPrefWidth(100);
		TableColumn<Member, String> name = new TableColumn<>("이름");
		name.setCellValueFactory(new PropertyValueFactory<>("name"));
		name.setPrefWidth(100);
		TableColumn<Member, String> email = new TableColumn<>("이메일");
		email.setCellValueFactory(new PropertyValueFactory<>("email"));
		email.setPrefWidth(200);
		TableColumn<Member, String> birth = new TableColumn<>("생년월일");
		birth.setCellValueFactory(new PropertyValueFactory<>("birth"));
		birth.setPrefWidth(150);
		
		memberTable.getColumns().addAll(id,pw,name,email,birth);
		
		List<Member> memberList = dt.selectMember(); 
		
		ObservableList<Member> data = FXCollections.observableArrayList(memberList);
		memberTable.setItems(data);
		memberTable.setPrefSize(650, 1000);
		
		sp.setContent(memberTable);
		//sp.getChildrenUnmodifiable().add(menuTable);
		sp.setPrefSize(400, 400);
		sp.relocate(50, 175);
		
		Controller ctrl = loader.getController();
		ctrl.setMember(member);
		memberManage.setTitle("회원 관리");
		memberManage.show();
	}

	@Override
	public void couponManage(Parent adminCouponManage) {
		// TODO Auto-generated method stub
		dt=new dataTestImpl();
		Stage couponManage = (Stage) adminCouponManage.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("5_couponManageUI.fxml"));
		
		Parent coupon = null;
		try {
			coupon = loader.load();
			
			couponManage.setScene(new Scene(coupon));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ScrollPane sp = (ScrollPane) coupon.lookup("#couponList");
		
		TableView<Coupon> couponTable = new TableView<>();
		
		TableColumn<Coupon, String> couponNum = new TableColumn<>("쿠폰번호");
		couponNum.setCellValueFactory(new PropertyValueFactory<>("couponNum"));
		couponNum.setPrefWidth(200);
		TableColumn<Coupon, String> usedDate = new TableColumn<>("사용일");
		usedDate.setCellValueFactory(new PropertyValueFactory<>("usedDate"));
		usedDate.setPrefWidth(150);
		TableColumn<Coupon, String> memId = new TableColumn<>("소유자ID");
		memId.setCellValueFactory(new PropertyValueFactory<>("memId"));
		memId.setPrefWidth(100);
		
		couponTable.getColumns().addAll(couponNum,usedDate,memId);
		
		List<Coupon> couponList = dt.selectCoupon(); 
		
		ObservableList<Coupon> data = FXCollections.observableArrayList(couponList);
		couponTable.setItems(data);
		couponTable.setPrefSize(450, 1000);
		
		sp.setContent(couponTable);
		sp.setPrefSize(400, 400);
		sp.relocate(50, 175);
		
		Controller ctrl = loader.getController();
		ctrl.setCoupon(coupon);
		couponManage.setTitle("쿠폰 관리");
		couponManage.show();
	}

	@Override
	public void endSystem(Parent root) {
		// TODO Auto-generated method stub
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("시스템종료");
		alert.setHeaderText("시스템 종료");
		alert.setContentText("시스템을 종료하시겠습니까?");
		if(alert.showAndWait().get()==ButtonType.OK) {
			stage=(Stage)root.getScene().getWindow();
			System.out.println("시스템을 종료합니다.");
			stage.close();
		}
	}

	@Override
	public void menuManage(Parent adminMenuManage) {
		// TODO Auto-generated method stub
		dt=new dataTestImpl();
		Stage menuManage = (Stage) adminMenuManage.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("2_menuManageUI.fxml"));
		
		Parent menu = null;
		try {
			menu = loader.load();
			menuManage.setScene(new Scene(menu));
		} catch (Exception e) {
			e.printStackTrace();
		}
					
		ScrollPane sp = (ScrollPane) menu.lookup("#menuList");
	
		
		TableView<Menu> menuTable = new TableView<>();
		
		TableColumn<Menu, String> menuid = new TableColumn<>("NO.");
		menuid.setCellValueFactory(new PropertyValueFactory<>("menuid"));
		menuid.setPrefWidth(100);
		TableColumn<Menu, String> menuname = new TableColumn<>("메뉴");
		menuname.setCellValueFactory(new PropertyValueFactory<>("menuname"));
		menuname.setPrefWidth(150);
		TableColumn<Menu, String> menuprice = new TableColumn<>("가격");
		menuprice.setCellValueFactory(new PropertyValueFactory<>("menuprice"));
		menuprice.setPrefWidth(150);
		
		menuTable.getColumns().addAll(menuid,menuname,menuprice);
		
		
		List<Menu> menuList = dt.selectMenu(); 
		
		ObservableList<Menu> data = FXCollections.observableArrayList(menuList);
		menuTable.setItems(data);
		menuTable.setPrefSize(400, 1000);
		
		sp.setContent(menuTable);
		//sp.getChildrenUnmodifiable().add(menuTable);
		sp.setPrefSize(400, 400);
		sp.relocate(50, 175);
		
		
		// 이건 메뉴가 null 이라서 에러 나는 건데 

		Controller ctrl = loader.getController();
		ctrl.setMenu(menu);
		
		menuManage.setTitle("메뉴설정");
		menuManage.show();
	}

	@Override
	public void menuback(Parent adminMenuManage) {
		// TODO Auto-generated method stub
		
		
		Stage back = (Stage) adminMenuManage.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("1_adminMenuUI.fxml"));
		try {
			adminMenuManage = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		
		ctrl.setRoot(adminMenuManage);
		
		back.setScene(new Scene(adminMenuManage));
		back.setTitle("관리자모드");
		back.show();
	}

	@Override
	public void saleback(Parent adminSaleManage) {
		// TODO Auto-generated method stub
		Stage back = (Stage) adminSaleManage.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("1_adminMenuUI.fxml"));
		try {
			adminSaleManage = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		
		ctrl.setRoot(adminSaleManage);
		
		back.setScene(new Scene(adminSaleManage));
		back.setTitle("관리자모드");
		back.show();
	}

	@Override
	public void memberback(Parent adminMemberManage) {
		// TODO Auto-generated method stub
		Stage back = (Stage) adminMemberManage.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("1_adminMenuUI.fxml"));
		try {
			adminMemberManage = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		
		ctrl.setRoot(adminMemberManage);
		
		back.setScene(new Scene(adminMemberManage));
		back.setTitle("관리자모드");
		back.show();
	}

	@Override
	public void couponback(Parent adminCouponManage) {
		// TODO Auto-generated method stub
		Stage back = (Stage) adminCouponManage.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("1_adminMenuUI.fxml"));
		try {
			adminCouponManage = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		
		ctrl.setRoot(adminCouponManage);
		
		back.setScene(new Scene(adminCouponManage));
		back.setTitle("관리자모드");
		back.show();
	}

	@Override
	public void endAdmin(Parent adminmenu) {
		// TODO Auto-generated method stub
		Stage back = (Stage) adminmenu.getScene().getWindow();
		kioskMain km= new kioskMain();
		try {
			km.start(back);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

}
