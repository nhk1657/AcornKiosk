package admin.dataTest;

import java.util.Date;

public class Member {
String id;
String pw;
String name;
String email;
Date birth;
int stamp;
public Date getBirth() {
	return birth;
}
public void setBirth(Date birth) {
	this.birth = birth;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getStamp() {
	return stamp;
}
public void setStamp(int stamp) {
	this.stamp = stamp;
}

}
