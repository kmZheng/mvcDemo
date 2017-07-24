package com.company.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.company.dao.idao.IProductDao;
import com.company.dao.pojo.Product;
import com.company.dao.util.SessionFactory;

public class DaoProductImpl implements IProductDao {

	@Override
	public void save(Product t) throws Exception{
		Connection con = SessionFactory.getSession();
		String sql = "INSERT INTO t_product(pname,ean,price) VALUES(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, t.getPname());
		ps.setString(2, t.getEan());
		ps.setDouble(3, t.getPrice());
		ps.executeUpdate();
		SessionFactory.closeConnection(null, ps, con);
	}

	@Override
	public void update(Product t) throws Exception {
		Connection con = SessionFactory.getSession();
		String sql = "UPDATE t_product SET pname=?,ean=?,price=? WHERE pid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, t.getPname());
		ps.setString(2, t.getEan());
		ps.setDouble(3, t.getPrice());
		ps.setInt(4, t.getPid());
		ps.executeUpdate();
		SessionFactory.closeConnection(null, ps, con);
	}

	@Override
	public void delete(Product t) throws Exception {
		Connection con = SessionFactory.getSession();
		String sql = "DELETE FROM t_product WHERE pid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, t.getPid());
		ps.executeUpdate();
		SessionFactory.closeConnection(null, ps, con);
	}

	@Override
	public Product findById(Integer k) throws Exception {
		Connection con = SessionFactory.getSession();
		String sql = "SELECT pid,pname,ean,price FROM t_product WHERE pid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, k);
		ResultSet rs = ps.executeQuery();
		Product p = null;
		if(rs.next()){
			p = new Product(rs.getString(2),rs.getString(3),rs.getDouble(4));
			p.setPid(rs.getInt(1));
		}
		return p;
	}

	@Override
	public List<Product> findAll() throws Exception {
		Connection con = SessionFactory.getSession();
		String sql = "SELECT pid,pname,ean,price FROM t_product";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<Product> productList = new ArrayList<>();
		if(rs.next()){
			Product p = new Product(rs.getString(2),rs.getString(3),rs.getDouble(4));
			p.setPid(rs.getInt(1));
			productList.add(p);
		}
		System.out.println("---"+productList.size());
		SessionFactory.closeConnection(rs, ps, con);
		return productList;
	}

	@Override
	public List<Product> findByName(String pname) throws Exception {
		Connection con = SessionFactory.getSession();
		String sql = "SELECT pid,pname,ean,price FROM t_produt WHERE pname LIKE";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "%" + pname + "%");
		ResultSet rs = ps.executeQuery();
		List<Product> productList = new ArrayList<>();
		if(rs.next()){
			Product p = new Product(rs.getString(2),rs.getString(3),rs.getDouble(4));
			p.setPid(rs.getInt(1));
			productList.add(p);
		}
		return productList;
	}

	@Override
	public List<Product> findByPage(int page, int size) throws Exception {
		Connection con = SessionFactory.getSession();
		String sql = "SELECT pid,pname,ean,price FROM t_product LIMIT ?,?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, (page-1) * size);
		ps.setInt(1, size);
		ResultSet rs = ps.executeQuery();
		List<Product> productList = new ArrayList<>();
		if(rs.next()){
			Product p = new Product(rs.getString(2),rs.getString(3),rs.getDouble(4));
			p.setPid(rs.getInt(1));
			productList.add(p);
		}
		return productList;
	}

}
