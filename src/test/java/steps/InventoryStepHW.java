package steps;

import pages.InventoryPageHW;
import baseEntities.BaseTestHW;
import io.cucumber.java.en.When;

public class InventoryStepHW extends BaseTestHW {

    private BaseTestHW baseTest;
    private InventoryPageHW inventoryPageHW;

    public InventoryStepHW (BaseTestHW baseTest) {
        this.baseTest = baseTest;
        inventoryPageHW = new InventoryPageHW(driver);
    }

    @When("user added item to the cart")
    public void addToCart_HW() {
        inventoryPageHW.getAddToCartButton().click();
    }

    @When("user opens the cart")
    public void openCart_HW() {
        inventoryPageHW.getOpenCartButton().click();
    }

    @When("user see added product on the opened page")
    public void checkProductIsInTheCart() {
        inventoryPageHW.getItemTitle().isDisplayed();
    }
}