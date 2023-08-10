package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPageHW extends BasePageHW {

    // Блок описания локаторов для элементов
//    private final By headerTitleLocatorInventoryPageHW = By.xpath("//span[contains(@class, 'title') " +
//            "and contains(text(), 'Products')]");

    @FindBy (xpath = "//span[contains(@class, 'title') and contains(text(), 'Products')]")
    public WebElement InventoryPage;

    public CartPageHW cartPageHW;

//    private final By addToCartButtonLocator = By.id("add-to-cart-sauce-labs-backpack");

    @FindBy (id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCartButton;

//    private final By openCartButtonLocator = By.id("shopping_cart_container");

    @FindBy (id = "shopping_cart_container")
    public WebElement openCartButton;

    // Блок инициализации
    public InventoryPageHW(WebDriver driver) {
        super(driver);

        cartPageHW = new CartPageHW(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.xpath("//span[contains(@class, 'title') " +
                "and contains(text(), 'Products')]");
//        return headerTitleLocatorInventoryPageHW;
    }

    // Блок атомарных методов

    public WebElement getAddToCartButton() {
        return By.id("add-to-cart-sauce-labs-backpack");
//        return driver.findElement(addToCartButtonLocator);
    }

    public WebElement getOpenCartButton() {
        return By.id("shopping_cart_container");
//        return driver.findElement(openCartButtonLocator);
    }
}