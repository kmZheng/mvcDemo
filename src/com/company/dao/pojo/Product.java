package com.company.dao.pojo;
/**
 * 
 * @author Administrator
 *	product:product产品表  与orders表是多对多的关系
 */
public class Product {
	private int pid;//产品编号
	private String pname;//产品名称
	private String ean;//国际商品编号
	private double price;//商品价格
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getEan() {
		return ean;
	}
	public void setEan(String ean) {
		this.ean = ean;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(String pname, String ean, double price) {
		super();
		this.pname = pname;
		this.ean = ean;
		this.price = price;
	}
	public Product() {
		super();
	}
	
}
