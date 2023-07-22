package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutCompletePageHW;

public class CheckoutOverviewStepHW extends BaseStepHW {

    public CheckoutOverviewStepHW(WebDriver driver) {
        super(driver);
    }

    public CheckoutCompletePageHW finishCheckout (){
        checkoutOverviewPage_HW.getFinishButton().click();
        return checkoutCompletePage_HW;
    }

    public boolean checkProductIsInTheOverview(){
        productsPage_HW.getItemTitle().isDisplayed();
        return true;
    }

}
