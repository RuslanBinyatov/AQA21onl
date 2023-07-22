package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPageHW extends BasePageHW {

    // Блок описания локаторов для элементов

    private final By headerTitleLocator_CartPage_HW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Your Cart')]");

    private final By checkoutButtonLocator = By.id("checkout");

    // Блок инициализации

    public CartPageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocator_CartPage_HW;
    }

    // Блок атомарных методов

    public WebElement getCheckoutButton() {
        return driver.findElement(checkoutButtonLocator);
    }

}