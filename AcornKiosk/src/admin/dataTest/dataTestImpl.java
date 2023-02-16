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

	public List<Menu> selectMenu() {
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
				
				System.out.println(m.getMenuid()+" "+m.getMenuname()+" "+m.getMenuprice());
				menuList.add(m);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return menuList;
	}

	@Override
	public List<Menu> selectSale() {
		// TODO Auto-generated method stub
		String sql = "select * from menu";
    	List<Menu> saleList = new ArrayList<>();
    	
    	try {
			pstmt = con.prepareStatement(sql);
			
			rs= pstmt.executeQuery();
			
			while(rs.next()) {
				Menu m = new Menu();
				m.setMenuname(rs.getString(2));
				m.setMenuprice(rs.getInt(3));
				m.setMenusell(rs.getInt(4));
				m.setMenusale();
				System.out.println(m.getMenuname()+" "+m.getMenuprice()+" "+m.getMenusell()+" "+m.getMenusale());
				saleList.add(m);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
		return saleList;
	}

	@Override
	public List<Member> selectMember() {
		// TODO Auto-generated method stub
		String sql = "select * from member";
    	List<Member> memberList = new ArrayList<>();
    	try {
			pstmt = con.prepareStatement(sql);
			
			rs= pstmt.executeQuery();
			
			while(rs.next()) {
				Member m = new Member();
				m.setId(rs.getString(1));
				m.setPw(rs.getString(2));
				m.setName(rs.getString(3));
				m.setEmail(rs.getString(4));
				m.setBirth(rs.getDate(5));
				System.out.println(m.getId()+" "+m.getPw()+" "+m.getName()+" "+m.getEmail()+" "+m.getBirth()+" "+m.getStamps());
				memberList.add(m);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return memberList;
	}

	@Override
	public List<Coupon> selectCoupon() {
		// TODO Auto-generated method stub
		String sql = "select * from coupon";
    	List<Coupon> couponList = new ArrayList<>();
    	try {
			pstmt = con.prepareStatement(sql);
			
			rs= pstmt.executeQuery();
			
			while(rs.next()) {
				Coupon c = new Coupon();
				c.setCouponNum(rs.getInt(1));
				c.setUsedDate(rs.getDate(2));
				c.setMemId(rs.getString(3));
				
				System.out.println(c.getCouponNum()+" "+c.getUsedDate()+" "+c.getMemId());
				couponList.add(c);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return couponList;
		
	}
}
