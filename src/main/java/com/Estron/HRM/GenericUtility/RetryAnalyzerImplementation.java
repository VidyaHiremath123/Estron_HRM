package com.Estron.HRM.GenericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class RetryAnalyzerImplementation implements IRetryAnalyzer{
	int count=0;
	int retrycount=4;

	public boolean retry(ITestResult result) 
	{
		while(count<retrycount)
		{
			count++;
			return true;
		}


     
		return false;
	

}
	}
