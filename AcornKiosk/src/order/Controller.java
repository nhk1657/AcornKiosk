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
//order 결제 선택 Parent
private Parent orderPay;
//카드결제 버튼 선택 Parent
private Parent orderCard;
private addOrderService as;
private payMethodService ps;
private Parent orderCancel;
private orderdata od;
private orderMenu om;


public Controller() {
	as = new addOrderServiceImpl();
	ps = new payMethodServiceImpl();
	od = new orderdataImpl();
	ps = new payMethodServiceImpl();
}

public void setRoot(Parent orderRoot) {
	// TODO Auto-generated method stub
	this.orderRoot = orderRoot;
}
public void setPayMehtod(Parent orderPay ) {
	// TODO Auto-generated method stub
	this.orderPay = orderPay;
}
public void setOrderCard(Parent orderCard) {
	this.orderCard = orderCard;
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

public void card2() {
	ps.card2(orderPay);
}
//public void coupon() {
//	ps.coupon(orderPay);
//}


}
