package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutCompletePageHW;

public class CheckoutTwoStepHW extends BaseStepHW {

    public CheckoutTwoStepHW(WebDriver driver) {
        super(driver);
    }

    public CheckoutCompletePageHW finishCheckout (){
        checkoutTwoPageHW.getFinishButton().click();
        return checkoutCompletePageHW;
    }

    public boolean checkProductIsInTheOverview(){
        inventoryPageHW.getItemTitle().isDisplayed();
        return true;
    }
}
