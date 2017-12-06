package com.online.service;

import java.util.Map;

import org.apache.log4j.Logger;

import com.online.common.web.SpringBeanFactory;
import com.online.test.dao.TestDao;

import junit.framework.TestCase;

public class AppTest extends TestCase{
	
	Logger logger = Logger.getLogger(AppTest.class);
	
	
	public void testApp(){
		
		TestDao testDao = (TestDao) SpringBeanFactory.getBean("testDao");
		Map<String, Object> map = testDao.testQuery();
		logger.info("### curDate = "  + map.get("curdate"));
	}

}
