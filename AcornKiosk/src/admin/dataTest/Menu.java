package admin.dataTest;

public class Menu {
int menuid;
String menuname;
int menuprice;
int menuremains;
int menusell;
int menusection;
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
public int getMenuremains() {
	return menuremains;
}
public void setMenuremains(int menuremains) {
	this.menuremains = menuremains;
}
public int getMenusell() {
	return menusell;
}
public void setMenusell(int menusell) {
	this.menusell = menusell;
}
public int getMenusection() {
	return menusection;
}
public void setMenusection(int menusection) {
	this.menusection = menusection;
}

}
