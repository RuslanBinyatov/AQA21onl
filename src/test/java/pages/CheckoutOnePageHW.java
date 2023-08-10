package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOnePageHW extends BasePageHW {

    // Блок описания локаторов для элементов

//    private final By headerTitleLocatorCheckoutOnePageHW = By.xpath("//span[contains(@class, 'title') " +
//            "and contains(text(), 'Checkout: Your Information')]");

    @FindBy (xpath = "//span[contains(@class, 'title') and contains(text(), 'Checkout: Your Information')]")
    public WebElement CheckoutOnePage;

//    private final By firstNameInputLocator = By.id("first-name");

    @FindBy (id = "first-name")
    public WebElement firstNameInput;

//    private final By lastNameInputLocator = By.id("last-name");

    @FindBy (id = "last-name")
    public WebElement lastNameInput;

//    private final By postalCodeInputLocator = By.id("postal-code");

    @FindBy (id = "postal-code")
    public WebElement postalCodeInput;

    private final By continueButtonLocator = By.id("continue");

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
//        return headerTitleLocatorCheckoutOnePageHW;
    }

    // Блок атомарных методов

    public WebElement getFirstNameInput() {
        return By.id("first-name");
//        return driver.findElement(firstNameInputLocator);
    }

    public WebElement getLastNameInput() {
        return By.id("last-name");
//        return driver.findElement(lastNameInputLocator);
    }

    public WebElement getPostalCodeInput() {
        return By.id("postal-code");
//        return driver.findElement(postalCodeInputLocator);
    }

    public WebElement getContinueButton() {
        return By.id("continue");
//        return driver.findElement(continueButtonLocator);
    }

    public void setFirstName(String value) {
        getFirstNameInput().sendKeys(value);
    }

    public void setLastName(String value) {
        getLastNameInput().sendKeys(value);
    }

    public void setPostalCode(String value) {
        getPostalCodeInput().sendKeys(value);
    }

    public void fillInYourInfoData() {
        setFirstName("FirstName");
        setLastName("LastName");
        setPostalCode("PostalCode");
    }
}