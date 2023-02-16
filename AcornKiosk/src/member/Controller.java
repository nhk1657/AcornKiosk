package member;

import javafx.scene.Parent;
import member.service.LoginService;
import member.service.LoginServiceImpl;
import member.service.MemberService;
import member.service.MemberServiceImpl;

public class Controller {
	private Parent loginRoot;
	private LoginService ls;
	private MemberService ms;

	public Controller() {
		ls = new LoginServiceImpl();
		ms = new MemberServiceImpl();
	}

	public void setRoot(Parent loginRoot) {
		this.loginRoot = loginRoot;
	}
	public void loginProc() throws Exception {
		ls.loginProc(loginRoot);
	}

	public void registerProc() {
		ls.registerProc(loginRoot);
	}

	public void joinProc() throws Exception {
		ms.joinProc(loginRoot);
	}

	public void cancelProc() throws Exception {
		ms.cancelProc(loginRoot);
	}
}
