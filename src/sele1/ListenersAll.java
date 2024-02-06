package sele1;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersAll implements ITestListener{
     
    	  
		public void onTestStart(ITestResult result) {
			System.out.println("Test has started");
		}
		public void OnTestFailure(ITestResult result) {
		//enter screenshotcode
			System.out.println(result.getTestName() + "Test failed");
		}
		public void onTestSuccessful(ITestResult result) {
			System.out.println(result.getTestName() +"Test successful");
		}
		public void onTestSkipped(ITestResult result) {
			System.out.println(result.getTestName() +"Test Skipped");
		}
	}

