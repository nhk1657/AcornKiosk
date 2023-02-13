package admin.dataTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class dataTestImpl implements dataTest{
	Connection con;
	ResultSet rs;
	PreparedStatement pstmt;
	
	public dataTestImpl(){
		
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

	public List<Menu> selectAll() {
		// TODO Auto-generated method stub
		String sql = "select * from menu";
    	List<Menu> menuList = new ArrayList<>();
    	try {
			pstmt = con.prepareStatement(sql);
			
			rs= pstmt.executeQuery();
			
			while(rs.next()) {
				Menu m = new Menu();
				m.setMenuid(rs.getInt(1));
				m.setMenuname(rs.getString(2));
				m.setMenuprice(rs.getInt(3));
				m.setMenuremains(rs.getInt(4));
				m.setMenusell(rs.getInt(5));
				m.setMenusection(rs.getInt(6));
				System.out.println(m.getMenuid()+" "+m.getMenuname()+" "+m.getMenuprice()+" "+m.getMenuremains()+" "+m.getMenusection()+" "+m.getMenusell());
				menuList.add(m);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return menuList;
	}
}
