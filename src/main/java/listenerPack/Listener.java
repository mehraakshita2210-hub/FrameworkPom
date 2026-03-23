package listenerPack;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	
	
	public void onTestStart() 
	{
		System.out.println("Hello Test Started");
	}
	
	public void onTestSuccess() 
	{
		System.out.println("Hello Test Succeeded");
	}
	
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Hello Test Failed");
		System.out.println(result.getMethod().getMethodName()); 
		System.out.println(result.getThrowable());
	}
	

}
