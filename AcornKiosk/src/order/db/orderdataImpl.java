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
	orderMenu om;
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
			
            int sum = 0;
			//om.SumZero();
			while(rs.next()) {
				// 이게 밖에 있으면 같은 객체라서 여러개의 값을 받아와도 전체 데이터가 마지막 데이터로 저장 됩니다.
				orderMenu om = new orderMenu();
				
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

	
	
//주문 취소 버튼응 누르면 sql데이터베이스 내옹 삭제 기능 구현
	@Override
	public boolean deleteOrder() {
		// TODO Auto-generated method stub
		String sql="delete from  orderMenu";   
		//커밋이 안되서 그런가 싶어서 sql값으로 커밋을 넣어줌
		// 이건 안 하셔도 되요;
		//String sql2="commit";

		try {
			
			System.out.println(7777);
		
			pstmt = con.prepareStatement(sql);  
			//pstmt = con.prepareStatement(sql2);
			
			
//변수값을 0으로 보내도 안됨
//			om.setMenuid(0);
//			om.setMenuname(null);
//			om.setMenuprice(0);
//			om.setMenusell(0);
//			om.setSale();
//			om.setSum();
			
			// 이걸 안해서 삭제가 안됐네요 
			int result = pstmt.executeUpdate();
			System.out.println(8888);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return true;
	}
}