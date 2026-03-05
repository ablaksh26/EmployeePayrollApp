package com.employee;

public class User {
	private String userName;
	private String password;
	private String role;
	
	public User(String userName,String password,String role) {
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return password;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setPass(String password) {
		this.password = password;
	}
}