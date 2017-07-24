package com.company.dao.pojo;

import java.io.Serializable;

public class Login implements Serializable {
	private int id;
	private String userName;
	private String passWord;
	private static final long serialVersionUID = 1L;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Login(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	public Login() {
		super();
	}

}
