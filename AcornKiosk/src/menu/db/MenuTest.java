package menu.db;

import java.util.List;


public interface MenuTest {
	List<MenuMen> menus();
	public boolean input(Orders od);
	public List<Orders> menuoutput();
	public String menuName(int menuid);
	public int menuPrice(int menuid);
	public String orderName(int searchid);
	public int orderPrice(int searchid);
}
