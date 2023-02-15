package order.db;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class orderdataImpl implements orderdata{
	Connection con;
	ResultSet rs;
	PreparedStatement pstmt;

	public orderdataImpl(){

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
	public List<orderMenu> selectMenu() {

	
	// TODO Auto-generated method stub

	String sql = "select * from orderMenu";
	
	List<orderMenu> orderList = new ArrayList<>();
    
	try {
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		orderMenu om = new orderMenu();

		om.SumZero();
		while(rs.next()) {
			
			om.setMenuid(rs.getInt(1));
			om.setMenuname(rs.getString(2));
			om.setMenuprice(rs.getInt(3));
			om.setMenusell(rs.getInt(4));
			
			om.setSale();
			//sum+=om.getSale();
			//System.out.println("Before="+om.getSum());
			om.setSum();
			//System.out.println("After="+om.getSum());
			System.out.println(om.getMenuid() + " " + om.getMenuname() +" "+ om.getMenuprice() +" " +om.getMenusell()+ " "+ om.getSale()+ " "+ om.getSum());

			orderList.add(om);
			
		}

	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	} 
	return orderList;

}
	
//	public void delOrder() throws SQLException {
//		// TODO Auto-generated method stub
//		String sql="delect  from  orderMenu";
//		pstmt = con.prepareStatement(sql);
//		
//	}
	
	
	@Override
	public boolean deleteOrder() {
		// TODO Auto-generated method stub
		try {
			System.out.println(7777);
			String sql="delete from  orderMenu";
	
			pstmt = con.prepareStatement(sql);
			//orderList.
			System.out.println(8888);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return true;
	}
}