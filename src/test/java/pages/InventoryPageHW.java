package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPageHW extends BasePageHW {
    private final static String pagePath = "/inventory.html";

    // Блок описания локаторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//span[contains(@class, 'title') and contains(text(), 'Products')]");

    // Блок инициализации
    public InventoryPageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public WebElement getHeaderTitle() {
        return driver.findElement(headerTitleLabelLocator);
    }
}
