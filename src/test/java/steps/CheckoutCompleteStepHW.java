package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutCompletePageHW;
import pages.InventoryPageHW;

public class CheckoutCompleteStepHW extends BaseStepHW {

    public CheckoutCompleteStepHW(WebDriver driver) {
        super(driver);
    }

    public CheckoutCompletePageHW completeHeaderIsDisplayed() {
        checkoutCompletePageHW.getCompleteHeader().isDisplayed();
        return checkoutCompletePageHW;
    }
}