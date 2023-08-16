package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOnePageHW extends BasePageHW {

    // Блок описания локаторов для элементов
    @FindBy (xpath = "//span[contains(@class, 'title') and contains(text(), 'Checkout: Your Information')]")
    public WebElement headerTitleCheckoutOnePageHW;

    @FindBy (id = "first-name")
    public WebElement firstNameInput;

    @FindBy (id = "last-name")
    public WebElement lastNameInput;

    @FindBy (id = "postal-code")
    public WebElement postalCodeInput;

    @FindBy (id = "continue")
    public WebElement continueButton;

    // Блок инициализации
    public CheckoutOnePageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.xpath("//span[contains(@class, 'title') " +
                "and contains(text(), 'Checkout: Your Information')]");
    }

    // Блок атомарных методов
    public void fillInYourInfoData() {
        firstNameInput.sendKeys("FirstName");
        lastNameInput.sendKeys("LastName");
        postalCodeInput.sendKeys("PostalCode");
    }
}
