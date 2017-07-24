package com.company.dao.pojo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author Administrator
 *	orders表：订单表
 */
public class Orders implements Serializable{
	
	private int orderNum;//订单编号
	private String orderTime;//订单时间
	private int userid;//与login表关联的外键
	
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Orders(int orderNum, String orderTime, int userid) {
		super();
		this.orderNum = orderNum;
		this.orderTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
		this.userid = userid;
	}
	public Orders() {
		// TODO Auto-generated constructor stub
	}
}
