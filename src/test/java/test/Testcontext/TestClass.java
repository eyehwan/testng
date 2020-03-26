package test.Testcontext;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)
public class TestClass {

    @BeforeClass
    public void beforeMethod1() {
        throw new SkipException("Skip happened at beforeMethod");
    }

    @Test
    public void test() {
        System.out.println("test is skiped");
    }
}
