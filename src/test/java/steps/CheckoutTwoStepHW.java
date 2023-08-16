package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutCompletePageHW;

public class CheckoutTwoStepHW extends BaseStepHW {

    public CheckoutTwoStepHW(WebDriver driver) {
        super(driver);
    }

    public CheckoutCompletePageHW finishCheckout (){
        checkoutTwoPageHW.finishButton.click();
        return checkoutCompletePageHW;
    }

    public boolean checkProductIsInTheOverview(){
        inventoryPageHW.itemTitle.isDisplayed();
        return true;
    }
}