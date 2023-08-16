package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.*;
import utils.configuration.ReadProperties;

public class BaseTestHW {
    protected WebDriver driver;
    protected LoginStepHW loginStepHW;
    protected InventoryStepHW inventoryStepHW;
    protected CartStepHW cartStepHW;
    protected CheckoutOneStepHW checkoutOneStepHW;
    protected CheckoutTwoStepHW checkoutTwoStepHW;
    private CheckoutCompleteStepHW checkoutCompleteStepHW;


    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
        loginStepHW = new LoginStepHW(driver);
        inventoryStepHW = new InventoryStepHW(driver);
        cartStepHW = new CartStepHW(driver);
        checkoutOneStepHW = new CheckoutOneStepHW(driver);
        checkoutTwoStepHW = new CheckoutTwoStepHW(driver);
        checkoutCompleteStepHW = new CheckoutCompleteStepHW(driver);
        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}