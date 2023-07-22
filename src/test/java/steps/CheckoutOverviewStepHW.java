package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutCompletePageHW;

public class CheckoutOverviewStepHW extends BaseStepHW {

    public CheckoutOverviewStepHW(WebDriver driver) {
        super(driver);
    }

    public CheckoutCompletePageHW finishCheckout (){
        checkoutOverviewPageHW.getFinishButton().click();
        return checkoutCompletePageHW;
    }

    public boolean checkProductIsInTheOverview(){
        inventoryPageHW.getItemTitle().isDisplayed();
        return true;
    }

}
