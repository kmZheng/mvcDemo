package com.company.dao.pojo;

import java.io.Serializable;
/**
 * 
 * @author Administrator
 *	Item表：订单详情表  有自己的自增主键itemid 通过两个外键与产品表和订单表关联
 */
public class Item implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int itemid;//自增   订单详情表
	private int oid; //外键orders表
	private int pid; //外键product表
	private int pnum;//订单数量
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public Item(int oid, int pid, int pnum) {
		super();
		this.oid = oid;
		this.pid = pid;
		this.pnum = pnum;
	}
	public Item() {
		super();
	}
	
}
