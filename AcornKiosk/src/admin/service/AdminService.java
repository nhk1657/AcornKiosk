package admin.service;

import javafx.scene.Parent;

public interface AdminService {
void menuManage(Parent adminMenuManage);
void sales(Parent adminSaleManage);
void membermManage(Parent adminMemberManage);
void couponManage(Parent adminCouponManage);
void endSystem(Parent root);
void menuback(Parent adminMenuManage);
void saleback(Parent adminSaleManage);
void memberback(Parent adminMemberManage);
void couponback(Parent adminCouponManage);

}
