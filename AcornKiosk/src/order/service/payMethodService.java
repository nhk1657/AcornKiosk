package order.service;

import javafx.scene.Parent;

public interface payMethodService {
	void card(Parent orderPay);
	void coupon(Parent orderPay);
}
