package pages;

import baseEntities.BasePageHW;
import models.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOnePageHW extends BasePageHW {

    // Блок описания локаторов для элементов
    private final By headerTitleLocatorCheckoutOnePageHW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Checkout: Your Information')]");
    private final By firstNameInputLocator = By.id("first-name");
    private final By lastNameInputLocator = By.id("last-name");
    private final By postalCodeInputLocator = By.id("postal-code");
    private final By continueButtonLocator = By.id("continue");

    // Блок инициализации
    public CheckoutOnePageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocatorCheckoutOnePageHW;
    }

    // Блок атомарных методов
    public WebElement getFirstNameInput() {
        return driver.findElement(firstNameInputLocator);
    }

    public WebElement getLastNameInput() {
        return driver.findElement(lastNameInputLocator);
    }

    public WebElement getPostalCodeInput() {
        return driver.findElement(postalCodeInputLocator);
    }

    public WebElement getContinueButton() {
        return driver.findElement(continueButtonLocator);
    }

    public void setFirstName(String value) {
        getFirstNameInput().sendKeys(value);
    }

    public void setLastName(String value) {
        getLastNameInput().sendKeys(value);
    }

    public void setPostalCode(int value) {
        getPostalCodeInput().sendKeys(String.valueOf(value));
    }

    public void fillInYourInfoData(UserData userData) {
        setFirstName(userData.getFirstName());
        setLastName(userData.getLastName());
        setPostalCode(userData.getPostalCode());
    }
}