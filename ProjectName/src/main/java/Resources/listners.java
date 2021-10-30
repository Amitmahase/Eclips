package Resources;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listners   implements ITestListener {
	
	Base b=new Base();

	public void onTestFailure(ITestResult result) {
		result.getName();
		
		try {
			b.getScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	

	
	
	
	

}
