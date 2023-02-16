package order.db;

public class orderMenu {
	int menuid;
	String menuname;
	//주문가격 + 유료/무료옵션 가격도 추가
	int menuprice;
	//판매갯수
	int menusell;
	int Sale;
	int sum;
	
	public int getSum() {
		return sum;
	}
	public void SumZero(){
		//누적값을 더하기 위해서 한번 초기화를 해줘야함/		
		this.sum=0;
	}
	public void setSum() {
		this.sum += Sale;
	}


	public int getSale() {
		return Sale;
	}
	public void setSale() {
		setSum();
		this.Sale = ( menuprice * menusell);
		// setSum메서드 호출 -> 누적 합계 가능해짐
		//setSum();
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
