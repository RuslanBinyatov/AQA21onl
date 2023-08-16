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

    private final By addToCartButtonLocator = By.id("add-to-cart-sauce-labs-bike-light");
    private final By removeFromCartButtonLocator = By.id("remove-sauce-labs-bike-light");
    private final By openCartButtonLocator = By.id("shopping_cart_container");
    private final By itemTitleLocator = By.id("shopping_cart_container");

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

    public WebElement getRemoveFromCartButton() {
        return driver.findElement(removeFromCartButtonLocator);
    }

    public WebElement getOpenCartButton() {
        return driver.findElement(openCartButtonLocator);
    }

    public WebElement getItemTitle() {
        return driver.findElement(itemTitleLocator);
    }

    // Блок комплексных методов
    public InventoryPageHW addToCartHW() {
        getAddToCartButton().click();
        return new InventoryPageHW(driver);
    }

    public CartPageHW openCartHW() {
        getOpenCartButton().click();
        return new CartPageHW(driver);
    }
}