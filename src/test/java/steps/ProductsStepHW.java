package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CartPageHW;
import pages.ProductsPageHW;

public class ProductsStepHW extends BaseStepHW {

    public ProductsStepHW(WebDriver driver) {
        super(driver);
    }

    public ProductsPageHW addToCartHW() {
        productsPageHW.getAddToCartButton().click();
        return productsPageHW;
    }

    public ProductsPageHW removeButtonIsDisplayed() {
        productsPageHW.getRemoveFromCartButton().isDisplayed();
        return productsPageHW;
    }

    public CartPageHW openCartHW() {
        productsPageHW.getOpenCartButton().click();
        return cartPageHW;
    }

}