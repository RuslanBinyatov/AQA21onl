package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePageHW extends BasePageHW {

    // Блок описания локаторов для элементов

    private final By headerTitleLocator_CheckoutCompletePageHW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Checkout: Complete!')]");

    // Блок инициализации

    public CheckoutCompletePageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocator_CheckoutCompletePageHW;
    }

}