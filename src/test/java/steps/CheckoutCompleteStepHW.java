package steps;

import pages.CheckoutCompletePageHW;
import baseEntities.BaseTestHW;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CheckoutCompleteStepHW extends BaseTestHW {

    private BaseTestHW baseTest;
    private CheckoutCompletePageHW checkoutCompletePagehw;

    public CheckoutCompleteStepHW (BaseTestHW baseTest) {
        this.baseTest = baseTest;
        checkoutCompletePagehw = new CheckoutCompletePageHW(driver);
    }

    @Then("complete checkout page is displayed")
    public void checkCompleteCheckoutPageIsOpened() {
        Assert.assertTrue(new CheckoutCompletePageHW(driver).isPageOpened());
    }
}