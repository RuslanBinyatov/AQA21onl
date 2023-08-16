package steps;

import baseEntities.BaseStepHW;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.CheckoutCompletePageHW;

public class CheckoutTwoStepHW extends BaseStepHW {

    static Logger logger = LogManager.getLogger(CheckoutTwoStepHW.class);

    public CheckoutTwoStepHW(WebDriver driver) {
        super(driver);
    }

    public CheckoutCompletePageHW finishCheckout (){
        checkoutTwoPageHW.getFinishButton().click();

        logger.info("Checkout is finished");
        return checkoutCompletePageHW;
    }

    public boolean checkProductIsInTheOverview(){
        inventoryPageHW.getItemTitle().isDisplayed();

        logger.info("Added to cart product is displayed in overview");
        return true;
    }
}
