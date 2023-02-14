package member.service;

import javafx.scene.Parent;

public class Controller {
	private Parent loginRoot;
	private Parent registerRoot;
	private LoginServiceImpl ls;
	private MemberServiceImpl ms;
	
	public Controller() {
		ls = new LoginServiceImpl();
		ms = new MemberServiceImpl();
	}
	
	public void setRoot(Parent loginRoot) {
		this.loginRoot = loginRoot;
	}

	public void setMember(Parent registerRoot) {
		this.registerRoot = registerRoot;
	}

	public void loginProc() throws Exception {
		ls.loginProc(loginRoot);
	}
	
	public void registerProc() {
		ls.registerProc(registerRoot);
	}

	public void joinProc() throws Exception {
		ms.joinProc(registerRoot);
	}
}
