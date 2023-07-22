package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutOverviewPageHW;
import pages.CheckoutYourInformationPageHW;

public class CheckoutYourInformationStepHW extends BaseStepHW {

    public CheckoutYourInformationStepHW(WebDriver driver) {
        super(driver);
    }

    public CheckoutYourInformationPageHW fillingInWithValidDataHW() {
        checkoutYourInformationPageHW.fillInYourInfoData();
        return checkoutYourInformationPageHW;
    }

    public CheckoutOverviewPageHW continueCheckout(){
        checkoutYourInformationPageHW.getContinueButton().click();
        return checkoutOverviewPageHW;
    }


}