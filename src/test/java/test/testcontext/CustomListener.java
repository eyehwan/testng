package test.testcontext;

import java.util.ArrayList;
import java.util.List;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class CustomListener implements IInvokedMethodListener {

    static List<String> s = new ArrayList<>();

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        ITestContext dependsOn = testResult.getTestContext();
        if (dependsOn == null) {
            s.add("null");
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        ITestContext tct = testResult.getTestContext();
        if (tct == null) {
            s.add("null");
        }
    }

}
