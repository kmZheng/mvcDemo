package com.company.dao.factory;

import com.company.dao.Impl.DaoDetailImpl;
import com.company.dao.Impl.DaoItemImpl;
import com.company.dao.Impl.DaoLoginImpl;
import com.company.dao.Impl.DaoOrdersImpl;
import com.company.dao.Impl.DaoProductImpl;
import com.company.dao.idao.IDetailDao;
import com.company.dao.idao.IItemDao;
import com.company.dao.idao.ILoginDao;
import com.company.dao.idao.IOrdersDao;
import com.company.dao.idao.IProductDao;

public class DaoFactory {
	public static ILoginDao getILoginInstance(){
		return new DaoLoginImpl();
	} 
	public static IDetailDao getIDetailInstance(){
		return new DaoDetailImpl();
	} 
	public static IProductDao getProductInstance(){
		return new DaoProductImpl();
	} 
	public static IOrdersDao getIOrdersInstance(){
		return new DaoOrdersImpl();
	} 
	public static IItemDao getItemInstance(){
		return new DaoItemImpl();
	} 
	
}
