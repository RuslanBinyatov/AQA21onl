package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.LoginPageHW;
import pages.InventoryPageHW;

public class BaseStepHW {
    protected WebDriver driver;

    protected LoginPageHW loginPage;
    protected InventoryPageHW inventoryPage;

    public BaseStepHW(WebDriver driver) {
        this.driver = driver;

        loginPage = new LoginPageHW(driver);
        inventoryPage = new InventoryPageHW(driver);
    }
}