package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutCompletePageHW extends BasePageHW {

    // Блок описания локаторов для элементов

    private final By headerTitleLocatorCheckoutCompletePageHW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Checkout: Complete!')]");
    private final By backHomeButtonLocator = By.id("back-to-products");

    // Блок инициализации

    public CheckoutCompletePageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocatorCheckoutCompletePageHW;
    }

    // Блок атомарных методов

    public WebElement getBackHomeButton() {
        return driver.findElement(backHomeButtonLocator);
    }
}