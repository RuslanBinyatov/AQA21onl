package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutYourInformationPageHW;

public class CartStepHW extends BaseStepHW {

    public CartStepHW(WebDriver driver) {
        super(driver);
    }

    public CheckoutYourInformationPageHW checkout_HW() {
        cartPage_HW.getCheckoutButton().click();
        return checkoutYourInformationPage_HW;
    }

    public boolean checkProductIsInTheCart(){
        productsPage_HW.getItemTitle().isDisplayed();
        return true;
    }

}