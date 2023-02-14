package member.service;

import javafx.scene.Parent;

public interface MemberService {
	public void joinProc(Parent registerRoot) throws Exception;
	public void cancelProc(Parent registerRoot) throws Exception;
}
