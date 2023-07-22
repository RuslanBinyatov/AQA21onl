package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.*;
import utils.configuration.ReadProperties;

public class BaseTestHW {
    protected WebDriver driver;
    protected LoginStepHW loginStep_HW;
    protected ProductsStepHW productsStep_HW;
    protected CartStepHW cartStep_HW;
    protected CheckoutYourInformationStepHW checkoutYourInformationStep_HW;
    protected CheckoutOverviewStepHW checkoutOverviewStep_HW;
    private CheckoutCompleteStepHW checkoutCompleteStep_HW;


    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
        loginStep_HW = new LoginStepHW(driver);
        productsStep_HW = new ProductsStepHW(driver);
        cartStep_HW = new CartStepHW(driver);
        checkoutYourInformationStep_HW = new CheckoutYourInformationStepHW(driver);
        checkoutOverviewStep_HW = new CheckoutOverviewStepHW(driver);
        checkoutCompleteStep_HW = new CheckoutCompleteStepHW(driver);
        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
