package com.company.dao.pojo;

import java.io.Serializable;

public class Detail implements Serializable {
	private int id;
	private String realName;
	private String balance;

	private static final long serialVersionUID = 1L;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public Detail(String realName, String balance) {
		super();
		this.realName = realName;
		this.balance = balance;
	}

	public Detail() {
		super();
	}

}
