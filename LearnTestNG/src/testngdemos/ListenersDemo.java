package testngdemos;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase started and Testcase name:   "+ result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase success and Testcase name:   "+ result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase failed and Testcase name:   "+ result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase skipped and Testcase name:   "+ result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Testcase onstart and Testcase name:   "+ context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Testcase oncompletion and Testcase name:   "+ context.getName());
		
	}

}
