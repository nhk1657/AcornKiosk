package order;

import javafx.scene.Parent;
import order.db.orderMenu;
import order.db.orderdata;
import order.db.orderdataImpl;
import order.service.addOrderService;
import order.service.addOrderServiceImpl;
import order.service.payMethodService;
import order.service.payMethodServiceImpl;

public class Controller {
//order main Parent
private Parent orderRoot;
private addOrderService as;
//order 결제 선택 Parent
private Parent orderPay;
private payMethodService ps;
private Parent orderCancel;
private orderdata od;
private orderMenu om;

public Controller() {
	as = new addOrderServiceImpl();
	ps = new payMethodServiceImpl();
	od = new orderdataImpl();
}

public void setRoot(Parent orderRoot) {
	// TODO Auto-generated method stub
	this.orderRoot = orderRoot;
}
public void setPayMehtod(Parent orderPay ) {
	// TODO Auto-generated method stub
	this.orderPay = orderPay;
}

//주문 취소 버튼을 눌렀을 때 메인으로 화면 전환하기 위한 Parent 값 설정
public void setorderCancel(Parent orderCancel) {
	this.orderCancel =orderCancel;
}
public void payProc() {
	as.payProc(orderRoot);
}


//주문 취소 버튼 
public void cancelProc() {
	od.deleteOrder();
	as.cancelProc(orderRoot);
	
}

public void card() {
	ps.card(orderPay);
}
public void coupon() {
	ps.coupon(orderPay);
}

//@FXML
}
