package com.zaumal.sshmodel.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.zaumal.sshmodel.dao.TestDao;

@Repository("testDao")
public class TestDaoImpl implements TestDao {
	private Logger logger = Logger.getLogger(this.getClass());
	@Override
	public void testSave() {
		logger.info("TestDaoImpl..testSave..begin..");
	}

}
