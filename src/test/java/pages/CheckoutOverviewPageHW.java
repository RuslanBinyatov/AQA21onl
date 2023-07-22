package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPageHW extends BasePageHW {

    // Блок описания локаторов для элементов

    private final By headerTitleLocator_CheckoutOverviewPageHW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Checkout: Overview')]");

    private final By finishButtonLocator = By.id("finish");

    // Блок инициализации

    public CheckoutOverviewPageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocator_CheckoutOverviewPageHW;
    }

    // Блок атомарных методов

    public WebElement getFinishButton() {
        return driver.findElement(finishButtonLocator);
    }

}