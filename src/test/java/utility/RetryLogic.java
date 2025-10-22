package utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer{
	
	int initialcout=0;
	int retryCount=2;
	

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(initialcout<retryCount) {
		initialcout++;
		return true;
		}
		return false;
	}
	

}
