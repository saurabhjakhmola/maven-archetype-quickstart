package Academy;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;

import org.testng.ITestResult;

import resources.base;

public class listeners implements ITestListener {
	base b = new base();

	public void OnTestFinish(ITestResult arg0) {

	}
	public void OnTestFailure(ITestResult result) {
		result.getName();
		try {
			b.getScreenshots(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

	public void onTeststart(ITestResult arg0) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

	public void onTestSkipped(ITestResult arg0) {

	}

	public void onTestStart(ITestResult arg0) {

	}

	public void onTestSuccess(ITestResult arg0) {

	}
}
