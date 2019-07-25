package util; // SQL TABLE 의 속성들을 가져온다.

import java.util.Date;

public class MemberDTO {
	
	//table 속성들을 받아올 땐 소문자로 변수 선언하는게 이득!
	private String id;
	private String name;
	private String password;
	private Date reg_date;
	
	public String getId() {	return id;}
	public void setId(String id) {	this.id = id;}
	
	public String getName() {	return name;}
	public void setName(String name) {	this.name = name;}
	
	public String getPassword() {	return password;}
	public void setPassword(String password) {	this.password = password;}
	
	public Date getReg_date() {	return reg_date;}
	public void setReg_date(Date reg_date) {this.reg_date = reg_date;}
}
