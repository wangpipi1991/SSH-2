package com.zaumal.sshmodel.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.zaumal.sshmodel.dao.TestDao;
import com.zaumal.sshmodel.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {
	private Logger logger = Logger.getLogger(this.getClass());
	private TestDao testDao;
	public TestDao getTestDao() {
		return testDao;
	}
	@Resource(name="testDao")
	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}
	@Override
	public void testAdd() {
		logger.info("TestServiceImpl..TestServiceImpl..begin..");
		this.testDao.testSave();
		logger.info("TestServiceImpl..testAdd..end!");
	}

}
