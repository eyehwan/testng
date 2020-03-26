package test.Testcontext;


import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import test.SimpleBaseTest;
import test.annotationtransformer.SimpleTest;

public class TestContextInListenerTest extends SimpleBaseTest {

    @Test
    public void test1() {
        TestNG tng = create(TestClass.class);
        tng.run();
        Assert.assertTrue(!CustomListener.s.contains("null"));
    }

}
