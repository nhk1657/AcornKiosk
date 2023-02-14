package member.dao;

import member.service.Member;

public interface DatabaseService {
	public int login(String id, String pw) throws Exception;
	public int check(Member m) throws Exception;
	public boolean insert(Member m) throws Exception;
}
