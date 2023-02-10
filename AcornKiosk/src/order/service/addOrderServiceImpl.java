package order.service;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;
import order.Controller;

public class addOrderServiceImpl implements addOrderService{

	@Override
	public void payProc(Parent root) {
		// TODO Auto-generated method stub
		
		Stage payMethod = new Stage();
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("../payMethod.fxml"));
		
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
	public void cancelProc(Parent root) {
		// TODO Auto-generated method stub
		//주문취소 버튼이 누르면, 메뉴선택 메인 페이지로 돌아감
	}

}
