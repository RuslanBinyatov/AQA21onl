package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutTwoPageHW extends BasePageHW {

    // Блок описания локаторов для элементов
    @FindBy (xpath = "//span[contains(@class, 'title') and contains(text(), 'Checkout: Overview')]")
    public WebElement headerTitleCheckoutTwoPageHW;

    @FindBy (id = "finish")
    public WebElement finishButton;

    // Блок инициализации
    public CheckoutTwoPageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.xpath("//span[contains(@class, 'title') and contains(text(), 'Checkout: Overview')]");
    }

    // Блок атомарных методов
}