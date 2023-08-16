package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CartPageHW;
import pages.InventoryPageHW;

public class InventoryStepHW extends BaseStepHW {

    public InventoryStepHW(WebDriver driver) {
        super(driver);
    }

    public InventoryPageHW addToCartHW() {
        inventoryPageHW.addToCartButton.click();
        return inventoryPageHW;
    }

    public CartPageHW openCartHW() {
        inventoryPageHW.openCartButton.click();
        return cartPageHW;
    }
}