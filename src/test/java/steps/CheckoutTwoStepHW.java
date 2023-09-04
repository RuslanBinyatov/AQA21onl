package steps;

import io.cucumber.java.en.Then;
import pages.CheckoutTwoPageHW;
import baseEntities.BaseTestHW;

public class CheckoutTwoStepHW extends BaseTestHW {

    private BaseTestHW baseTest;
    private CheckoutTwoPageHW checkoutTwoPageHW;

    public CheckoutTwoStepHW (BaseTestHW baseTest) {
        this.baseTest = baseTest;
        checkoutTwoPageHW = new CheckoutTwoPageHW(driver);
    }

    @Then("user finishes checkout")
    public void finishCheckout (){
        checkoutTwoPageHW.getFinishButton().click();
    }
}