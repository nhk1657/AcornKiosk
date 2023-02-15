package menu.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import member.service.Member;
import order.db.orderMenu;



public class MenuDataImpl implements MenuData{
	int ordercnt=1;
	Connection con;
	ResultSet rs;
	PreparedStatement pstmt;
	
	public MenuDataImpl(){
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String pass = "oracle";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("오라클 연결 성공");
		} catch(Exception e) {
			System.out.println("오라클 연결 실패");
			e.printStackTrace();
		}
	}
	
	@Override
	public List<MenuDB> menus(){
		// TODO Auto-generated method stub
		String sql = "select * from menu ";
    	List<MenuDB> menuList = new ArrayList<>();
    	try {
			pstmt = con.prepareStatement(sql);
			
			rs= pstmt.executeQuery();
			
			while(rs.next()) {
				MenuDB m = new MenuDB();
				m.setMenuID(rs.getInt(1));
				m.setMenuName(rs.getString(2));
				m.setMenuPrice(rs.getInt(3));
				m.setMenuSell(rs.getInt(4));
				System.out.println(m.getMenuID()+" "+m.getMenuName()+" "+m.getMenuPrice()+" "+m.getMenuSell());
				menuList.add(m);
				System.out.println(rs.getInt(1));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return menuList;
	}
	
	
	@Override
	public String menuName(int menuid){
		String sql = "SELECT menuName FROM menu where menuID = ?";
		String name = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, menuid);
			rs=pstmt.executeQuery();
			if(rs.next()){
				name=rs.getString("menuName");
			}
			
		}catch (Exception e){
			// TODO: handle exception
			e.printStackTrace();
			name= "err";		
		}
		
		return name;
	}

	@Override
	public int menuPrice(int menuid){
		// TODO Auto-generated method stub
		String sql = "SELECT menuPrice FROM menu where menuID = ?";
		int price = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, menuid);
			rs=pstmt.executeQuery();
			if(rs.next()){
				System.out.println(rs.getInt("menuPrice"));
				price=rs.getInt("menuPrice");
				System.out.println(price);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			price= 0;		
		}
		
		return price;
	}

	@Override
	public String orderName(int searchid){
		// TODO Auto-generated method stub
		String name=null;
		String sql="SELECT Name FROM orders where id=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, searchid);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				name=rs.getString("Name");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return name;
	}

	@Override
	public int orderPrice(int searchid){
		// TODO Auto-generated method stub
		int price=0;
		String sql="SELECT Price FROM orders where id=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, searchid);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				price=rs.getInt("Price");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return price;
	}

	@Override
	public boolean input(OrderMenu od){
		// TODO Auto-generated method stub
		String sql = "INSERT INTO orderMenu VALUES(?,?,?,?)";
		int result=0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, od.getMenuid());
			pstmt.setString(2, od.getMenuname());
			pstmt.setInt(3, od.getMenuprice());
			pstmt.setInt(4, od.getMenusell());
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(result>0) {
			System.out.println("success");
		}else {
			System.out.println("err");
		}
		
		return false;
	}
	
	@Override
	public List<OrderMenu> menuoutput(){
	
	// TODO Auto-generated method stub
	String sql = "select * from orders";
	List<OrderMenu> orders = new ArrayList<>();
    
	try {
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {		
			OrderMenu ods = new OrderMenu();
			
			ods.setMenuid(rs.getInt(1));
			ods.setMenuname(rs.getString(2));
			ods.setMenuprice(rs.getInt(3));
			ods.setMenusell(rs.getInt(4));
			System.out.println(ods.getMenuid() + " " + ods.getMenuname() +" "+ ods.getMenuprice() +" " +ods.getMenusell());

			orders.add(ods);			
		}
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	} 
		return orders;
	}
	
}