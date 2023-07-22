package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutYourInformationPageHW;

public class CartStepHW extends BaseStepHW {

    public CartStepHW(WebDriver driver) {
        super(driver);
    }

    public CheckoutYourInformationPageHW checkout_HW() {
        cartPageHW.getCheckoutButton().click();
        return checkoutYourInformationPageHW;
    }

    public boolean checkProductIsInTheCart(){
        productsPageHW.getItemTitle().isDisplayed();
        return true;
    }

}