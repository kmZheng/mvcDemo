package com.company.dao.idao;

import java.util.List;

import com.company.dao.pojo.Product;

public interface IProductDao extends IBaseDao<Product, Integer>{
	List<Product> findByName(String pname) throws Exception;//接口独有功能，名字模糊查询
	List<Product> findByPage(int page,int size) throws Exception;
}
