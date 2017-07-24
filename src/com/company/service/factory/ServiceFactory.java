package com.company.service.factory;

import com.company.service.impl.ServiceDetailImpl;
import com.company.service.impl.ServiceItemImpl;
import com.company.service.impl.ServiceLoginImpl;
import com.company.service.impl.ServiceOrdersImpl;
import com.company.service.impl.ServiceProductImpl;
import com.company.service.iservice.IDetailService;
import com.company.service.iservice.IItemService;
import com.company.service.iservice.ILoginService;
import com.company.service.iservice.IOrdersService;
import com.company.service.iservice.IProductService;

public class ServiceFactory {
	public static ILoginService getLoginInstance(){
		return new ServiceLoginImpl();
	}
	public static IDetailService getDetailInstance(){
		return new ServiceDetailImpl();
	}
	public static IProductService getProductInstance(){
		return new ServiceProductImpl();
	}
	public static IItemService getItemInstance(){
		return new ServiceItemImpl();
	}
	public static IOrdersService getOrdersInstance(){
		return new ServiceOrdersImpl();
	}
}
