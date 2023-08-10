package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutTwoPageHW extends BasePageHW {

    // Блок описания локаторов для элементов

//    private final By headerTitleLocatorCheckoutTwoPageHW = By.xpath("//span[contains(@class, 'title') " +
//            "and contains(text(), 'Checkout: Overview')]");

    @FindBy (xpath = "//span[contains(@class, 'title') and contains(text(), 'Checkout: Overview')]")
    public WebElement CheckoutTwoPage;

//    private final By finishButtonLocator = By.id("finish");

    @FindBy (id = "finish")
    public WebElement finishButton;

    // Блок инициализации

    public CheckoutTwoPageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.xpath("//span[contains(@class, 'title') " +
                "and contains(text(), 'Checkout: Overview')]");
//        return headerTitleLocatorCheckoutTwoPageHW;
    }

    // Блок атомарных методов

    public WebElement getFinishButton() {
        return By.id("finish");
//        return driver.findElement(finishButtonLocator);
    }
}