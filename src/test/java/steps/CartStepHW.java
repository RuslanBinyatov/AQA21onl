package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutOnePageHW;

public class CartStepHW extends BaseStepHW {

    public CartStepHW(WebDriver driver) {
        super(driver);
    }

    public CheckoutOnePageHW checkoutHW() {
        cartPageHW.getCheckoutButton().click();
        return checkoutOnePageHW;
    }
}