package member.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import member.Member;
import member.service.CommonService;
import member.service.CommonServiceImpl;

public class DatabaseServiceImpl implements DatabaseService {
	private Connection con;
	private ResultSet rs;
	private PreparedStatement pstmt;
	
	private CommonService cs;
	
	// 데이터베이스 연결
	public DatabaseServiceImpl() {
		cs = new CommonServiceImpl();
		
		// 데이터 연결 하기 위한 객체 처리
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String pswd = "oracle";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection(url, user, pswd);
			System.out.println("오라클 연결 성공");
		} catch(Exception e) {
			System.out.println("오라클 연결 실패");
			e.printStackTrace();
		}
	}
	
	// 로그인
	public int login(String id, String pw) throws Exception {
		// 관리자 모드 진입
		if(id.equals("admin") && pw.equals("1234")) {
			return 3;
		}
		
		String sql = "SELECT * FROM member WHERE ID = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		// 아이디 검색 결과조차 없으면
		if(pstmt.executeUpdate() == 0) {
			cs.errorMsg("경고", "로그인 오류", "존재하지 않는 아이디입니다.");
			return 0;
			
		} else {
			sql = "SELECT * FROM member WHERE id = ? AND pw = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);	
			
			// 아이디는 존재하나 비밀번호가 맞지 않으면
			if(pstmt.executeUpdate() <= 0) {				
				cs.errorMsg("경고", "로그인 오류", "비밀번호가 일치하지 않습니다.");
				return 1;
				
			} else {
				System.out.println("로그인 성공");
				return 2;
			}
		}
	}
	
	// 아이디 중복 확인
	public int check(Member m) throws Exception {
		String sql = "SELECT * FROM member WHERE ID = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, m.getId());
		
		int result = pstmt.executeUpdate();
		return result;
	}
	
	// 회원 정보 등록
	public boolean insert(Member m) throws Exception {
		String sql = "INSERT INTO member VALUES(?, ?, ?, ?, ?, ?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, m.getId());
		pstmt.setString(2, m.getPw());
		pstmt.setString(3, m.getName());
		pstmt.setString(4, m.getEmail());
		pstmt.setDate(5, (Date) m.getBirth());
		pstmt.setInt(6, 0);
		
		int result = pstmt.executeUpdate();
		
		if(result > 0) {
			cs.errorMsg("회원 가입", "회원 가입 완료", m.getId() + " 님이 성공적으로 가입되었습니다.");
		} else {
			cs.errorMsg("회원 가입", "회원 가입 실패", m.getId() + " 님의 가입이 실패했습니다.");
		}
		
		return false;
	}
}
