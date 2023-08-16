package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStepHW {
    protected WebDriver driver;

    protected LoginPageHW loginPage_HW;
    protected InventoryPageHW productsPage_HW;
    protected CartPageHW cartPage_HW;
    protected CheckoutOnePageHW checkoutYourInformationPage_HW;
    protected CheckoutTwoPageHW checkoutOverviewPage_HW;
    protected CheckoutCompletePageHW checkoutCompletePage_HW;


    public BaseStepHW(WebDriver driver) {
        this.driver = driver;

        loginPage_HW = new LoginPageHW(driver);
        productsPage_HW = new InventoryPageHW(driver);
        cartPage_HW = new CartPageHW(driver);
        checkoutYourInformationPage_HW = new CheckoutOnePageHW(driver);
        checkoutOverviewPage_HW = new CheckoutTwoPageHW(driver);
        checkoutCompletePage_HW = new CheckoutCompletePageHW(driver);
    }
}
