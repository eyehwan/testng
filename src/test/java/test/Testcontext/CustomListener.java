package test.Testcontext;

import static org.testng.Assert.assertNotNull;

import org.testng.Assert;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.asserts.IAssert;

public class CustomListener implements IInvokedMethodListener {

    public static String s = "";
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        ITestContext dependsOn = testResult.getTestContext();
        if (dependsOn == null) {
            s = "null";
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        ITestContext tct = testResult.getTestContext();
        if (tct == null) {
            s = "null";
        }
    }
}
