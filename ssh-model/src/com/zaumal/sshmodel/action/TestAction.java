package com.zaumal.sshmodel.action;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;

import com.zaumal.sshmodel.service.TestService;

@ParentPackage("testPackage")
@Action("testAction")
public class TestAction {
	private Logger logger = Logger.getLogger(this.getClass());
	private TestService testService;
	public TestService getTestService() {
		return testService;
	}
	@Resource(name="testService")
	public void setTestService(TestService testService) {
		this.testService = testService;
	}
	public void sayHi(){
		logger.info("TestAction..sayHi..begin..");
		this.testService.testAdd();
		logger.info("TestAction..sayHi..end!");
	}
}
