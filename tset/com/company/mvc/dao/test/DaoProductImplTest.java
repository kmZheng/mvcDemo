package com.company.mvc.dao.test;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.company.dao.factory.DaoFactory;
import com.company.dao.idao.IProductDao;
import com.company.dao.pojo.Product;

public class DaoProductImplTest {
	private IProductDao productDao; 
	@Before
	public void setUp() throws Exception {
		productDao = DaoFactory.getProductInstance();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSave() throws Exception {
		Product p1 = new Product("fruit","f001",11.1);
		Product p2 = new Product("apple","f002",12.1);
		Product p3 = new Product("orange","f003",13.1);
		Product p4 = new Product("watermelon","f004",14.1);
		productDao.save(p1);
		productDao.save(p2);
		productDao.save(p3);
		productDao.save(p4);
	}

	@Test
	public void testUpdate() throws Exception {
		Product p1 = new Product();
		p1.setPname("aaa");
		p1.setEan("a001");
		p1.setPrice(22.2);
		p1.setPid(4);
		productDao.update(p1);
	}

	@Test
	public void testDelete() throws Exception {
		Product p = new Product();
		p.setPid(4);
		productDao.delete(p);
	}

	@Test
	public void testFindById() throws Exception {
		System.out.println(productDao.findById(2));
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByPage() {
		fail("Not yet implemented");
	}

}
