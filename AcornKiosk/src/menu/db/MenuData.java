package menu.db;

import java.util.List;


public interface MenuData {
	List<MenuDB> menus();
	public boolean input(OrderMenu od);
	public List<OrderMenu> menuoutput();
	public String menuName(int menuid);
	public int menuPrice(int menuid);
	public String orderName(int searchid);
	public int orderPrice(int searchid);
	public boolean deleteMenu();
}
