package test.testcontext;

import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
import test.SimpleBaseTest;


public class TestContestInListenerTest extends SimpleBaseTest {

    @Test
    public void test1() {
        TestNG tng = create(TestClass.class);
        tng.run();
        Assert.assertTrue(!CustomListener.s.contains("null"), "testcontext return null is not excepted");
    }
}
