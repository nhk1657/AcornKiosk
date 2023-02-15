package admin.dataTest;

public class Menu {
int menuid;
String menuname;
int menuprice;
int menusell;
int menusale;
public int getMenusale() {
	return menusale;
}
public void setMenusale() {
	this.menusale = menuprice*menusell;
}
public int getMenuid() {
	return menuid;
}
public void setMenuid(int menuid) {
	this.menuid = menuid;
}
public String getMenuname() {
	return menuname;
}
public void setMenuname(String menuname) {
	this.menuname = menuname;
}
public int getMenuprice() {
	return menuprice;
}
public void setMenuprice(int menuprice) {
	this.menuprice = menuprice;
}

public int getMenusell() {
	return menusell;
}
public void setMenusell(int menusell) {
	this.menusell = menusell;
}


}
