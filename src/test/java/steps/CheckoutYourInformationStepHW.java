package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutOverviewPageHW;
import pages.CheckoutYourInformationPageHW;

public class CheckoutYourInformationStepHW extends BaseStepHW {

    public CheckoutYourInformationStepHW(WebDriver driver) {
        super(driver);
    }

    public CheckoutYourInformationPageHW fillingInWithValidData_HW() {
        checkoutYourInformationPage_HW.fillInYourInfoData();
        return checkoutYourInformationPage_HW;
    }

    public CheckoutOverviewPageHW continueCheckout(){
        checkoutYourInformationPage_HW.getContinueButton().click();
        return checkoutOverviewPage_HW;
    }


}