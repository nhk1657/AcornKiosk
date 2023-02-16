package order.service;

import javafx.scene.Parent;
import javafx.stage.Stage;
import order.db.orderMenu;
import order.db.orderdata;
import order.db.orderdataImpl;
import payment.Main;

public class payMethodServiceImpl implements payMethodService {
	orderdata od;
	orderMenu om;
	@Override
	public void card2(Parent orderPay) {
		// TODO Auto-generated method stub
		//카드결제진행 중 입니다 화면으로 넘겨줌
		
		od = new orderdataImpl();
		Stage orderCard = (Stage)orderPay.getScene().getWindow();
		//Menu7 menu7 = new Menu7();
		Main paymain = new Main();
		try {
		    
			paymain.start(orderCard);
			//od.selectMenu().clear();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

//	@Override
//	public void coupon(Parent orderPay) {
//		// TODO Auto-generated method stub
//		//쿠폰 결제 진행 창으로 화면을 넘겨줌
//	}

}
