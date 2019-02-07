package com.bit.sts06.model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BbsDaoTest {
	static BbsDao bbsDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext ac=null;
		ac=new GenericXmlApplicationContext("classpath:applicationContext.xml");
		bbsDao=(BbsDao) ac.getBean("bbsDao");
	}

	@Test
	public void testSelectAll() throws SQLException {
		assertNotNull(bbsDao.selectAll());
		assertSame(4, bbsDao.selectAll().size());
	}

}
