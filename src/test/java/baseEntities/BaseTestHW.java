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
    protected ProductsStepHW productsStepHW;
    protected CartStepHW cartStepHW;
    protected CheckoutYourInformationStepHW checkoutYourInformationStepHW;
    protected CheckoutOverviewStepHW checkoutOverviewStepHW;
    private CheckoutCompleteStepHW checkoutCompleteStepHW;


    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
        loginStepHW = new LoginStepHW(driver);
        productsStepHW = new ProductsStepHW(driver);
        cartStepHW = new CartStepHW(driver);
        checkoutYourInformationStepHW = new CheckoutYourInformationStepHW(driver);
        checkoutOverviewStepHW = new CheckoutOverviewStepHW(driver);
        checkoutCompleteStepHW = new CheckoutCompleteStepHW(driver);
        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
