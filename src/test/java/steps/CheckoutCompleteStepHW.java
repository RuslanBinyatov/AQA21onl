package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.InventoryPageHW;

public class CheckoutCompleteStepHW extends BaseStepHW {

    public CheckoutCompleteStepHW(WebDriver driver) {
        super(driver);
    }
    public InventoryPageHW backHomeCheckout () {
        checkoutCompletePageHW.getBackHomeButton().click();
        return inventoryPageHW;
    }
}