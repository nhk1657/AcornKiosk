package order.db;

import java.sql.SQLException;

import java.util.List;

public interface orderdata {
List<orderMenu> selectMenu();
public boolean deleteOrder();
public void saveOrder(int menuId, int orderAcc) throws Exception;
}
