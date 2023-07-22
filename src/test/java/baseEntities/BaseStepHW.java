package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStepHW {
    protected WebDriver driver;

    protected LoginPageHW loginPageHW;
    protected InventoryPageHW inventoryPageHW;
    protected CartPageHW cartPageHW;
    protected CheckoutYourInformationPageHW checkoutYourInformationPageHW;
    protected CheckoutOverviewPageHW checkoutOverviewPageHW;
    protected CheckoutCompletePageHW checkoutCompletePageHW;


    public BaseStepHW(WebDriver driver) {
        this.driver = driver;

        loginPageHW = new LoginPageHW(driver);
        inventoryPageHW = new InventoryPageHW(driver);
        cartPageHW = new CartPageHW(driver);
        checkoutYourInformationPageHW = new CheckoutYourInformationPageHW(driver);
        checkoutOverviewPageHW = new CheckoutOverviewPageHW(driver);
        checkoutCompletePageHW = new CheckoutCompletePageHW(driver);
    }
}
