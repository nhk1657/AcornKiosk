package member.service;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import member.Controller;
import member.dao.DatabaseService;
import member.dao.DatabaseServiceImpl;
import admin.AdminMain;
import menu.MenuMain;

public class LoginServiceImpl implements LoginService {
	private DatabaseService ds = new DatabaseServiceImpl();
	private AdminMain am = new AdminMain();
	private MenuMain tm = new MenuMain();
		
		// 로그인
		public void loginProc(Parent loginRoot) throws Exception {
			
			Stage primaryStage = (Stage) loginRoot.getScene().getWindow();
			
			// 아이디 / 패스워드 값 가져오기
			 TextField id = (TextField) loginRoot.lookup("#txtId");
			 PasswordField pw = (PasswordField) loginRoot.lookup("#txtPw");
			 
			switch(ds.login(id.getText(), pw.getText())) {
			// 아이디 존재하지 않는 경우
			case 0:
				id.clear();
				pw.clear();
				id.requestFocus();
				System.out.println("로그인 실패");
				break;
				
			// 비밀번호 일치하지 않는 경우
			case 1:
				pw.clear();
				pw.requestFocus();
				System.out.println("로그인 실패");
				break;
				
			// 로그인 성공한 경우
			case 2:
				tm.start(primaryStage);
				break;
				
			// 관리자 모드 진입하는 경우 (admin, 1234)
			case 3:
				am.start(primaryStage);
				break;
			}
		}
	
	public void registerProc(Parent loginRoot) {		
		Stage registerForm = (Stage) loginRoot.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("../registerUI.fxml"));
		
		try {
			loginRoot = loader.load();
			registerForm.setScene(new Scene(loginRoot));
		} catch(Exception e) {
			e.printStackTrace();
		}

		Controller ctrl = loader.getController();
		ctrl.setRoot(loginRoot);
		
		registerForm.setTitle("회원 가입");
		registerForm.show();
	}
}
