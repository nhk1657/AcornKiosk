package order;

import javafx.scene.Parent;
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


public Controller() {
	as = new addOrderServiceImpl();
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

public void setorderCancel(Parent orderCancel) {
	this.orderCancel =orderCancel;
}
public void payProc() {
	as.payProc(orderRoot);
}
public void cancelProc() {
	//as.cancelProc(mainrootvalues);
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
