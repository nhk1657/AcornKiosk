package admin.service;




import java.io.IOException;

import javafx.scene.Parent;

public interface AdminService {
void menuManage(Parent root);
//void menuEdit(Parent root);
void sales(Parent root);
void membermManage(Parent root);
//void memberEdit(Parent root);
void couponManage(Parent root);
void endSystem(Parent root);
void menuback(Parent root);
void saleback(Parent root);
void memberback(Parent member);
void couponback(Parent coupon);

}
