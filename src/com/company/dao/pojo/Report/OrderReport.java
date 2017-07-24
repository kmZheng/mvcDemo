package com.company.dao.pojo.Report;

import com.company.dao.pojo.Item;
import com.company.dao.pojo.Login;
import com.company.dao.pojo.Orders;
import com.company.dao.pojo.Product;

public class OrderReport {
	private Login login; 
	private Product prodect; 
	private Orders orders; 
	private Item item;
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public Product getProdect() {
		return prodect;
	}
	public void setProdect(Product prodect) {
		this.prodect = prodect;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public OrderReport(Login login, Product prodect, Orders orders, Item item) {
		super();
		this.login = login;
		this.prodect = prodect;
		this.orders = orders;
		this.item = item;
	}
	public OrderReport() {
		super();
	}
	@Override
	public String toString() {
		return "OrderReport [login=" + login + ", prodect=" + prodect
				+ ", orders=" + orders + ", item=" + item + "]";
	} 
	
}
