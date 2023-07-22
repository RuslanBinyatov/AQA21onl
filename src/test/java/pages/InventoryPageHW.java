package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPageHW extends BasePageHW {

    // Блок описания локаторов для элементов
    private final By headerTitleLocatorInventoryPageHW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Products')]");

    public CartPageHW cartPageHW;

    private final By addToCartButtonLocator = By.id("add-to-cart-sauce-labs-backpack");
    private final By openCartButtonLocator = By.id("shopping_cart_container");

    // Блок инициализации
    public InventoryPageHW(WebDriver driver) {
        super(driver);

        cartPageHW = new CartPageHW(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocatorInventoryPageHW;
    }

    // Блок атомарных методов

    public WebElement getAddToCartButton() {
        return driver.findElement(addToCartButtonLocator);
    }

    public WebElement getOpenCartButton() {
        return driver.findElement(openCartButtonLocator);
    }
}