package com.wipro.labsession_19;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("The testcase execution is completed using selenium testng");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("The testcase execution is starting using selenium testng");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("The testcase execution is completed with few issues using selenium testng");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("The testcase execution is failed using selenium testng");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("The testcase execution is skipped using selenium testng");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("The testcase execution is started using selenium testng");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("The testcase execution is completed successfully using selenium testng");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("The testcase execution is failed due to timeout using selenium testng");
        onTestFailure(result); // call normal failure as well
    }
}
