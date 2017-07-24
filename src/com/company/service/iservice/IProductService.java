package com.company.service.iservice;

import java.util.List;

import com.company.dao.pojo.Product;

public interface IProductService extends IBaseService<Product,Integer>{
	List<Product> findByName(String pname);//接口独有功能，名字模糊查询
	List<Product> findByPage(int page,int size);
	
}
