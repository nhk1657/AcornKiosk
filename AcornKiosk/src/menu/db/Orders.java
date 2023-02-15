package menu.db;



public class Orders {
	int menuid;
	String menuname;
	//주문가격 + 유료/무료옵션 가격도 추가
	int menuprice;
	//판매갯수
	int menusell;
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

