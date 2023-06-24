package CucumberPackage.CucumberProject;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started " +result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case executed " +result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed " +result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped " +result.getName());
	}
	

}
