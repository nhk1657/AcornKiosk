package order;

import javafx.scene.Parent;
import order.service.addOrderService;
import order.service.addOrderServiceImpl;
import order.service.payMethodService;
import order.service.payMethodServiceImpl;

public class Controller {
private Parent root;
private addOrderService as;
private Parent paymethod;
private payMethodService ps;


public Controller() {
	as = new addOrderServiceImpl();
	ps = new payMethodServiceImpl();
}

public void setRoot(Parent root) {
	// TODO Auto-generated method stub
	this.root = root;
}
public void setPayMehtod(Parent paymethod ) {
	// TODO Auto-generated method stub
	this.paymethod = paymethod;
}
public void payProc() {
	as.payProc(root);
}
public void cancelProc() {
	as.cancelProc(root);
}

public void card() {
	ps.card(paymethod);
}
public void coupon() {
	ps.coupon(paymethod);
}

//@FXML
}
