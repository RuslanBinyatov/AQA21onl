package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePageHW extends BasePageHW {

    // Блок описания локаторов для элементов

//    private final By headerTitleLocatorCheckoutCompletePageHW = By.xpath("//span[contains(@class, 'title') " +
//            "and contains(text(), 'Checkout: Complete!')]");

    @FindBy (xpath = "//span[contains(@class, 'title') and contains(text(), 'Checkout: Complete!')]")
    public WebElement CheckoutCompletePage;

//    private final By completeHeaderLocator = By.xpath("//h2[contains(@class, 'complete-header') " +
//            "and contains(text(), 'Thank you for your order!')]");

    @FindBy (xpath = "//h2[contains(@class, 'complete-header') and contains(text(), 'Thank you for your order!')]")
    public WebElement comleteHeader;

    // Блок инициализации

    public CheckoutCompletePageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.xpath("//span[contains(@class, 'title') and contains(text(), 'Checkout: Complete!')]");
//        return headerTitleLocatorCheckoutCompletePageHW;
    }

    // Блок атомарных методов

    public WebElement getCompleteHeader() {
        return By.xpath("//h2[contains(@class, 'complete-header') " +
                "and contains(text(), 'Thank you for your order!')]");
//        return driver.findElement(completeHeaderLocator);
    }

}