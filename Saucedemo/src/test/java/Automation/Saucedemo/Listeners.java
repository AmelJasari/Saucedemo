package Automation.Saucedemo;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import resources.basic;

//implements ITestListener je interfejs
//interfejs ima metode bez body-ja
public class Listeners implements ITestListener {

	basic b = new basic();
	public void onTestStart(ITestResult result) {
		
		
	}

	public void onTestSuccess(ITestResult result) {
		
		
	}

	public void onTestFailure(ITestResult result) {
		
		b.getScreenshot(result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
