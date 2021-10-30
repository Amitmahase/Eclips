package Test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITest listeners
public class Listeners implements ITestListener {
	
	
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		//can put the code for take screen shot.
		System.out.println("when task pass"+ result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		//can put the code for take screen shot.
		System.out.println("Tasks failed" + result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}


}
