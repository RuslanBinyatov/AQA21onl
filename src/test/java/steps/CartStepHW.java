package steps;

import baseEntities.BaseStepHW;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.CheckoutOnePageHW;

public class CartStepHW extends BaseStepHW {

    static Logger logger = LogManager.getLogger(CartStepHW.class);

    public CartStepHW(WebDriver driver) {
        super(driver);
    }

    public CheckoutOnePageHW checkoutHW() {
        cartPageHW.getCheckoutButton().click();

        logger.info("Checkout Page is opened");
        return checkoutOnePageHW;
    }

    public boolean checkProductIsInTheCart(){
        inventoryPageHW.getItemTitle().isDisplayed();
        logger.info("Added to cart product is displayed in the cart");
        return true;
    }
}