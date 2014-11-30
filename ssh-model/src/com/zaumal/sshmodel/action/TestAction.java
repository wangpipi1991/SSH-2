package com.zaumal.sshmodel.action;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ModelDriven;
import com.zaumal.sshmodel.model.TestModel;
import com.zaumal.sshmodel.service.TestService;

@ParentPackage("testPackage")

@Results({
	@Result(name="success",location="/success.jsp")
})
public class TestAction implements ModelDriven<TestModel>{
	private Logger logger = Logger.getLogger(this.getClass());
	private TestModel model = new TestModel();
	@Override
	public TestModel getModel() {
		return model;
	}
	private TestService testService;
	public TestService getTestService() {
		return testService;
	}
	@Resource(name="testService")
	public void setTestService(TestService testService) {
		this.testService = testService;
	}
	@Action("testAction")
	public String testRegister(){
		logger.info("TestAction..testRegister..begin..");
		this.testService.testAdd(this.model);
		logger.info("TestAction..testRegister..end!");
		return "success";
	}
}
