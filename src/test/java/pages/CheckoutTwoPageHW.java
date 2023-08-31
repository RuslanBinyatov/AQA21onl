package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutTwoPageHW extends BasePageHW {

    // Блок описания локаторов для элементов

    private final By headerTitleLocator_CheckoutOverviewPage_HW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Checkout: Overview')]");

    private final By finishButtonLocator = By.id("finish");

    // Блок инициализации

    public CheckoutTwoPageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocator_CheckoutOverviewPage_HW;
    }

    // Блок атомарных методов

    public WebElement getFinishButton() {
        return driver.findElement(finishButtonLocator);
    }
}