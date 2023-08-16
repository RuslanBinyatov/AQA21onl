package steps;

import baseEntities.BaseStepHW;
import models.UserData;
import org.openqa.selenium.WebDriver;
import pages.CheckoutTwoPageHW;
import pages.CheckoutOnePageHW;

public class CheckoutOneStepHW extends BaseStepHW {

    public CheckoutOneStepHW(WebDriver driver) {
        super(driver);
    }

    public CheckoutOnePageHW fillingInWithValidDataHW(UserData userData) {
        checkoutOnePageHW.fillInYourInfoData(userData);
        return checkoutOnePageHW;
    }

    public CheckoutTwoPageHW continueCheckout(){
        checkoutOnePageHW.getContinueButton().click();
        return checkoutTwoPageHW;
    }
}