package order.service;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.kioskMain;
import order.Controller;
import order.addOrderMain;
import order.db.orderMenu;
import order.db.orderdata;
import order.db.orderdataImpl;

public class addOrderServiceImpl implements addOrderService{
	orderdata od;
	orderMenu om;
	addOrderMain aom;
	
	@Override
	public void payProc(Parent orderRoot) {
		// TODO Auto-generated method stub
		
		// 기존 창을 새창으로 바꾸기
		Stage payMethod = (Stage) orderRoot.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("../payMethodUI_card.fxml"));
		
		/*기촌창 + 새창 
		Stage payMethod = new Stage();
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("../payMethodUI.fxml"));
		*/
		Parent paymethod = null;
		try {
			paymethod = loader.load();

			payMethod.setScene(new Scene(paymethod));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		
		ctrl.setPayMehtod(paymethod);
		
		
		payMethod.setTitle("결제선택");
		payMethod.show();
	}

	@Override
	public void cancelProc(Parent orderRoot) {
		// TODO Auto-generated method stub
		//주문취소 버튼이 누르면, 메뉴선택 메인 페이지로 돌아감
		//메인페이지 (로그인 페이지)Parent 값 받아서 보내기
		od = new orderdataImpl();
		
		Stage orderCancel=(Stage)orderRoot.getScene().getWindow();
		kioskMain km = new kioskMain();
		
		
		try {
		    od.deleteOrder();
			km.start(orderCancel);
			//od.selectMenu().clear();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		}
	}


