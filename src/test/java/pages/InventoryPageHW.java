package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPageHW extends BasePageHW {

    // Блок описания локаторов для элементов
    @FindBy (xpath = "//span[contains(@class, 'title') and contains(text(), 'Products')]")
    public WebElement headerTitleInventoryPageHW;

    public CartPageHW cartPageHW;

    @FindBy (id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCartButton;

    @FindBy (id = "shopping_cart_container")
    public WebElement openCartButton;

    @FindBy (id = "shopping_cart_container")
    public WebElement itemTitle;

    // Блок инициализации
    public InventoryPageHW(WebDriver driver) {
        super(driver);

        cartPageHW = new CartPageHW(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.xpath("//span[contains(@class, 'title') and contains(text(), 'Products')]");
    }

    // Блок атомарных методов
}