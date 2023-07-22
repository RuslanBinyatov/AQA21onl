package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStepHW {
    protected WebDriver driver;

    protected LoginPageHW loginPageHW;
    protected InventoryPageHW inventoryPageHW;
    protected CartPageHW cartPageHW;
    protected CheckoutOnePageHW checkoutOnePageHW;
    protected CheckoutTwoPageHW checkoutTwoPageHW;
    protected CheckoutCompletePageHW checkoutCompletePageHW;

    public BaseStepHW(WebDriver driver) {
        this.driver = driver;

        loginPageHW = new LoginPageHW(driver);
        inventoryPageHW = new InventoryPageHW(driver);
        cartPageHW = new CartPageHW(driver);
        checkoutOnePageHW = new CheckoutOnePageHW(driver);
        checkoutTwoPageHW = new CheckoutTwoPageHW(driver);
        checkoutCompletePageHW = new CheckoutCompletePageHW(driver);
    }
}
