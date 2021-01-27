package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class iTestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Start of execution (TEST) ==>> " +result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Started ==>" +result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test FAILED ==>>" +result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test SKIPPED ==>>" +result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test FAILED within SUCCESS % ==>>" +result.getName());
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Test FAILED with TIMEOUT ==>>" +result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("END of execution ==>>" +context.getStartDate() + "\n Test suite name ===>>> " +context.getSuite().getName());
    }
}
