//package pages;
//
//import baseEntities.BasePageHW;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class InventoryPageHW extends BasePageHW {
//    private final static String pagePath = "/inventory.html";
//
//    // Блок описания локаторов для элементов
//    private final By headerTitleLabelLocator = By.xpath("//span[contains(@class, 'title') and contains(text(), 'Products')]");
//    private final By addToCartButtonLocator = By.id("add-to-cart-sauce-labs-backpack");
//
//    // Блок инициализации
//    public InventoryPageHW(WebDriver driver) {
//        super(driver);
//    }
//
//    @Override
//    protected By getPageIdentifier() {
//        return addToCartButtonLocator;
//    }
//
//    public void openPageByUrl() {
//        super.openPageByUrl(pagePath);
//    }
//
//    // Блок атомарных методов
//    public WebElement getHeaderTitle() {
//        return driver.findElement(headerTitleLabelLocator);
//    }
//    public WebElement getAddToCartButton() {
//        return driver.findElement(addToCartButtonLocator);
//    }
//}
