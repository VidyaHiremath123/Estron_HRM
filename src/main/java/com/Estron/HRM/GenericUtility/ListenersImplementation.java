package com.Estron.HRM.GenericUtility;





import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;










public class ListenersImplementation extends BaseClass implements ITestListener
{
	
	ExtentReports report;
	ExtentTest test;
	
	public void onTestStart(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		test = report.createTest(methodName);
		test.log(Status.INFO, " === test script execution started ===");
	
		
		
	}
		


	public void onTestSuccess(ITestResult result) {
		
		// TODO Auto-generated method stub
		
		String methodName = result.getMethod().getMethodName();
		test.log(Status.PASS, methodName+"=== PASS ===");
		
	}

	public void onTestFailure(ITestResult result) {
		
		// TODO Auto-generated method stub
		
					String methodName = result.getMethod().getMethodName();
					
					 
					WebDriverUtility wUtil = new WebDriverUtility();
					
					String screenShotName = methodName+"-"+new JavaUtility().getSystemDateInFormat();
					
					try {
						String path = wUtil.takeScreenShot(BaseClass.sdriver, screenShotName);
						
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}		
		
		
		
	


	

	public void onTestSkipped(ITestResult result) {
		

		String methodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, methodName+" === SKIP ===");
		test.log(Status.INFO, result.getThrowable()); // print the exception in report


	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {


	}

	public void onTestFailedWithTimeout(ITestResult result) {


	}

	public void onStart(ITestContext context) {
		

		System.out.println("=== execution statred ===");
		
		//Extent Report Configuration Report-05 Apr 2023-10-23-45.html
		ExtentSparkReporter htmlreporter = new ExtentSparkReporter("./ExtentReports/report-"+new JavaUtility().getSystemDateInFormat()+".html");
		htmlreporter.config().setDocumentTitle("Vtiger Execution Report");
		htmlreporter.config().setTheme(Theme.DARK);
		htmlreporter.config().setReportName("Automation Execution Report");
		
		report = new ExtentReports();
		report.attachReporter(htmlreporter);
		report.setSystemInfo("Base URL", "http://localhost:8888");
		report.setSystemInfo("Base Browser", "FireFox");
		report.setSystemInfo("Base Platform", "Windows");
		report.setSystemInfo("Reporter-Name", "Vidya");
		
		


	}

	public void onFinish(ITestContext context) {
		
		System.out.println("=== executed finished ===");
		
		report.flush(); // generate the report 

	}
	

}
