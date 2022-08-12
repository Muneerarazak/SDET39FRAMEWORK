package comcast.vtiger.genericUtility2;

import org.testng.ITestResult;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int count=0;
	int retryLimit=4;
	
	public boolean retry(ITestResult result) 
	{
		if(count<retryLimit) 
		{
			count++;
			return true;
			
		}
		return false;
	}

}