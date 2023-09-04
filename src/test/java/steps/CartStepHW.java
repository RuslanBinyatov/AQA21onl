package steps;

import baseEntities.BaseTestHW;
import io.cucumber.java.en.When;
import pages.CartPageHW;

public class CartStepHW extends BaseTestHW {

    private BaseTestHW baseTest;
    private CartPageHW cartPagehw;

    public CartStepHW(BaseTestHW baseTest) {
        this.baseTest = baseTest;
        cartPagehw = new CartPageHW(driver);
    }

    @When("user clicks checkout")
    public void checkoutHW() {
        cartPagehw.getCheckoutButton().click();
    }
}