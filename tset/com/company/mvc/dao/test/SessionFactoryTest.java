package com.company.mvc.dao.test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.company.dao.util.SessionFactory;

public class SessionFactoryTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("start...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("end...");
	
	}

	@Test
	public void testGetSession() throws Exception {
		System.out.println(SessionFactory.getSession().toString());
	}

}
