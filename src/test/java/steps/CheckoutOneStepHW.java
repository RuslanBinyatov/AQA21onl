package steps;

import baseEntities.BaseStepHW;
import models.UserData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.CheckoutTwoPageHW;
import pages.CheckoutOnePageHW;

public class CheckoutOneStepHW extends BaseStepHW {

    static Logger logger = LogManager.getLogger(CheckoutOneStepHW.class);

    public CheckoutOneStepHW(WebDriver driver) {
        super(driver);
    }

    public CheckoutOnePageHW fillingInWithValidDataHW(UserData userData) {
        checkoutOnePageHW.fillInYourInfoData(userData);

        logger.info("User information form is filled with data");
        return checkoutOnePageHW;
    }

    public CheckoutTwoPageHW continueCheckout(){
        checkoutOnePageHW.getContinueButton().click();

        logger.info("Continue checkout");
        return checkoutTwoPageHW;
    }
}