package menu.db;

public class Orders {
	int orderlines;	
	int id;
	String name;
	int price;
	int sell;
	int sum;
	
	public int getOrderlines() {
		return orderlines;
	}
	public void setOrderlines(int orderlines) {
		this.orderlines = orderlines;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSell() {
		return sell;
	}
	public void setSell(int sell) {
		this.sell = sell;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
}
