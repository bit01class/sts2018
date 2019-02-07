package com.bit.sts06;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ConnectionTest {
	static DataSource dataSource;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext ac=null;
		ac=new GenericXmlApplicationContext("classpath:applicationContext.xml");
		dataSource=(DataSource) ac.getBean("dataSource");
	}

	@Test
	public void test() throws SQLException {
		assertNotNull(dataSource.getConnection());
	}

}














