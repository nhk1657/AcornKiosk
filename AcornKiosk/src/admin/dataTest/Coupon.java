package admin.dataTest;

import java.sql.Date;

public class Coupon {
int couponNum;
String memId;
Date usedDate;
public Date getUsedDate() {
	return usedDate;
	
}
public void setUsedDate(Date usedDate) {
	this.usedDate = usedDate;
}
public int getCouponNum() {
	return couponNum;
}
public void setCouponNum(int couponNum) {
	this.couponNum = couponNum;
}
public String getMemId() {
	return memId;
}
public void setMemId(String memId) {
	this.memId = memId;
}
}
