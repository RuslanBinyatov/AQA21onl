package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStepHW {
    protected WebDriver driver;

    protected LoginPageHW loginPage_HW;
    protected ProductsPageHW productsPage_HW;
    protected CartPageHW cartPage_HW;
    protected CheckoutYourInformationPageHW checkoutYourInformationPage_HW;
    protected CheckoutOverviewPageHW checkoutOverviewPage_HW;
    protected CheckoutCompletePageHW checkoutCompletePage_HW;


    public BaseStepHW(WebDriver driver) {
        this.driver = driver;

        loginPage_HW = new LoginPageHW(driver);
        productsPage_HW = new ProductsPageHW(driver);
        cartPage_HW = new CartPageHW(driver);
        checkoutYourInformationPage_HW = new CheckoutYourInformationPageHW(driver);
        checkoutOverviewPage_HW = new CheckoutOverviewPageHW(driver);
        checkoutCompletePage_HW = new CheckoutCompletePageHW(driver);
    }
}
