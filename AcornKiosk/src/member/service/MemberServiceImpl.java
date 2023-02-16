package member.service;

import java.time.ZoneId;
import java.util.Date;

import javafx.scene.Parent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import member.LoginMain;
import member.Member;
import member.dao.DatabaseService;
import member.dao.DatabaseServiceImpl;

public class MemberServiceImpl implements MemberService {
	private CommonService cs;
	private DatabaseService ds;
	private LoginMain lm;
	
	public MemberServiceImpl() {
		cs = new CommonServiceImpl();
		ds = new DatabaseServiceImpl();
		lm = new LoginMain();
	}
	
	public void joinProc(Parent loginRoot) throws Exception {
		Member m = new Member();
		
		// 아이디, 이름, 비밀번호 필드 가져오기
		String txtFldName[] = {"#txtId", "#txtName", "#txtPw", "#txtPwRp"};
		String columnName[] = {"아이디", "이름", "비밀번호", "비밀번호 확인"};
		TextField txtFld[] = new TextField[2];
		PasswordField pwFld[] = new PasswordField[2];
		
		for(int i=0; i<txtFldName.length; i++) {
			if(i < 2) {
				txtFld[i] = (TextField) loginRoot.lookup(txtFldName[i]);
				if(txtFld[i].getText().isEmpty()) {
					cs.errorMsg("경고", "회원 가입 오류", columnName[i] + " 필드가 비어 있습니다.");
					txtFld[i].requestFocus();
					return;
				}
			} else if(i<4) {
				pwFld[i-2] = (PasswordField) loginRoot.lookup(txtFldName[i]);
				if(pwFld[i-2].getText().isEmpty()) {
					cs.errorMsg("경고", "회원 가입 오류", columnName[i] + " 필드가 비어 있습니다.");
					pwFld[i-2].requestFocus();
					return;
				}
			}
		}
		
		// 비밀번호 & 비밀번호 확인 필드 일치 확인
		if(!pwFld[0].getText().equals(pwFld[1].getText())) {
			cs.errorMsg("경고", "회원 가입 오류", "비밀번호가 일치하지 않습니다.");
			pwFld[0].clear();
			pwFld[1].clear();			
			pwFld[0].requestFocus();
			return;
		}

		// DatePicker의 값을 sql에 저장하기 위해 변환하는 과정
		DatePicker datePicker = (DatePicker) loginRoot.lookup("#dateBirth");
		Date date = Date.from(datePicker.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		
		// 이메일 값 가져오기
		TextField emailFld = (TextField) loginRoot.lookup("#txtEmail");

		m.setName(txtFld[1].getText());
		m.setId(txtFld[0].getText());
		m.setPw(pwFld[0].getText());
		m.setEmail(emailFld.getText());
		m.setBirth(sqlDate);
		
		// 아이디 중복 확인
		if(ds.check(m) > 0) {
			cs.errorMsg("경고", "회원 가입 오류", "중복된 아이디입니다.");
			
			txtFld[0].clear();
			txtFld[1].clear();
			pwFld[0].clear();
			pwFld[1].clear();	
			
			emailFld.clear();
			datePicker.setValue(null);
			
			txtFld[0].requestFocus();
			
		} else {
			ds.insert(m);
			Stage primaryStage = (Stage) loginRoot.getScene().getWindow();
			lm.start(primaryStage);
		}
	}
	
	// 취소 버튼 클릭 시 로그인 화면으로 재전환
	public void cancelProc(Parent loginRoot) throws Exception {
		Stage primaryStage = (Stage) loginRoot.getScene().getWindow();
		lm.start(primaryStage);
	}
}
