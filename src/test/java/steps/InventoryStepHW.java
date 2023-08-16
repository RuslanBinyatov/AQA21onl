package steps;

import baseEntities.BaseStepHW;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.CartPageHW;
import pages.InventoryPageHW;

public class InventoryStepHW extends BaseStepHW {

    static Logger logger = LogManager.getLogger(InventoryStepHW.class);

    public InventoryStepHW(WebDriver driver) {
        super(driver);
    }

    public InventoryPageHW addToCartHW() {
        inventoryPageHW.getAddToCartButton().click();

        logger.info("Selected item is added to cart");
        return inventoryPageHW;
    }

    public InventoryPageHW removeButtonIsDisplayed() {
        inventoryPageHW.getRemoveFromCartButton().isDisplayed();

        logger.info("'Add to cart' button is changed to 'Remove' button");
        return inventoryPageHW;
    }

    public CartPageHW openCartHW() {
        inventoryPageHW.getOpenCartButton().click();

        logger.info("Cart is opened");
        return cartPageHW;
    }
}