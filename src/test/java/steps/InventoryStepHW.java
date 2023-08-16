package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CartPageHW;
import pages.InventoryPageHW;

public class InventoryStepHW extends BaseStepHW {

    public InventoryStepHW(WebDriver driver) {
        super(driver);
    }

    public InventoryPageHW addToCart_HW() {
        inventoryPageHW.getAddToCartButton().click();
        return inventoryPageHW;
    }

    public InventoryPageHW removeButtonIsDisplayed() {
        inventoryPageHW.getRemoveFromCartButton().isDisplayed();
        return inventoryPageHW;
    }

    public CartPageHW openCartHW() {
        inventoryPageHW.getOpenCartButton().click();
        return cartPageHW;
    }
}