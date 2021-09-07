package com.kiboCRM.genericLibs;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListeners implements ITestListener {
	
	@Override
	public void onStart(ITestContext context) {
		Reporter.log(context.getName()+" Started", true);	
	}
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+" Method Started", true);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+" method Passed", true);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+ " method failed", true);
		            WebDriverCommonLib wlib = new WebDriverCommonLib();
		            wlib.getFullPageScreenshot("./screenshots" +result.getName()+".png");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+" method skipped", true);
	}
	@Override
	public void onFinish(ITestContext result) {
		Reporter.log(result.getName()+" ended", true);
		
	}

}
