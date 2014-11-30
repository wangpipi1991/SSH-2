package com.zaumal.sshmodel.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zaumal.sshmodel.service.TestService;

public class MyTest {
	Logger logger = Logger.getLogger(this.getClass());
	@Test
	public void testSpring(){
		logger.info("testSpring..begin..");
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		TestService testService = (TestService)ac.getBean("testService");
		testService.testAdd();
		logger.info("testSpring..end!!!");
	}
}
