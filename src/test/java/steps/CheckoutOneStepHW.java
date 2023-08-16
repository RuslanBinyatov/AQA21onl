package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutTwoPageHW;
import pages.CheckoutOnePageHW;

public class CheckoutOneStepHW extends BaseStepHW {

    public CheckoutOneStepHW(WebDriver driver) {
        super(driver);
    }

    public CheckoutOnePageHW fillingInWithValidDataHW() {
        checkoutOnePageHW.fillInYourInfoData();
        return checkoutOnePageHW;
    }

    public CheckoutTwoPageHW continueCheckout(){
        checkoutOnePageHW.continueButton.click();
        return checkoutTwoPageHW;
    }
}