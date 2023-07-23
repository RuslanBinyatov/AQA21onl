import data.StaticProviderHW;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalcTestHW extends BaseTest {
    private int attempt = 1;

    @Test(enabled = false)
    public void divTest_1() {
        int expectedValue  = 6;
        int actualValue = calculator.div(18, 3);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(testName = "Division test")
    public void divTest_2() {
        double expectedValue  = 632.8;
        double actualValue = calculator.div(158.2, 0.25);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(timeOut = 1000)
    public void waitLongTimeTest() throws InterruptedException {
        Thread.sleep(500);
        double expectedValue  = 632.8;
        double actualValue = calculator.div(158.2, 0.25);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(invocationCount = 2, invocationTimeOut = 2000)
    public void invocationCountTest() throws  InterruptedException {
        Thread.sleep(500);
        int expectedValue  = 6;
        int actualValue = calculator.div(18, 3);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void exceptionTest() {
        int result = calculator.div(18, 0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void exceptionTest_1() {
        int result = calculator.div(0, 0);
    }

    @Test
    public void exceptionTest_2() {
        double result = calculator.div(158.2, 0);

        Assert.assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    public void exceptionTest_3() {
        double result = calculator.div(0.0, 0);

        Assert.assertEquals(Double.NaN, result);
    }

    @Test(dataProvider = "Data for Division test", dataProviderClass = StaticProviderHW.class)
    public void dataProviderTest(int a, int b, int expectedValue) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(calculator.div(a, b), expectedValue, "Значения не одинаковые");
    }

    @Parameters({"login", "psw"})
    @Test
    public void paramTest(@Optional("Default login") String login, @Optional("Default psw") String psw) {
        System.out.println("Login: " + login + " Password: " + psw);
    }

    @Test(retryAnalyzer = Retry.class)
    public void retryTest() {
        if (attempt == 5) {
            System.out.println("Attempt is: " + attempt);
            Assert.assertTrue(true);
        } else {
            attempt++;
            System.out.println("Attempt is: " + attempt);
            throw new NullPointerException();
        }
    }
}