package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CartPageHW;
import pages.ProductsPageHW;

public class ProductsStepHW extends BaseStepHW {

    public ProductsStepHW(WebDriver driver) {
        super(driver);
    }

    public ProductsPageHW addToCart_HW() {
        productsPage_HW.getAddToCartButton().click();
        return productsPage_HW;
    }

    public ProductsPageHW removeButtonIsDisplayed() {
        productsPage_HW.getRemoveFromCartButton().isDisplayed();
        return productsPage_HW;
    }

    public CartPageHW openCart_HW() {
        productsPage_HW.getOpenCartButton().click();
        return cartPage_HW;
    }

}