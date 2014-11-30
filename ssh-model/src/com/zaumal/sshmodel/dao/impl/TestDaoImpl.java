package com.zaumal.sshmodel.dao.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.zaumal.sshmodel.dao.TestDao;
import com.zaumal.sshmodel.model.TestModel;

@Repository("testDao")
public class TestDaoImpl implements TestDao {
	private Logger logger = Logger.getLogger(this.getClass());
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void testSave(TestModel model) {
		logger.info("TestDaoImpl..testSave..begin..");
		Session session = this.sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(model);
		session.getTransaction().commit();
		logger.info("TestDaoImpl..testSave..end!");
	}

}
