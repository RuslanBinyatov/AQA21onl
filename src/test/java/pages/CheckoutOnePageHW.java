package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOnePageHW extends BasePageHW {

    // Блок описания локаторов для элементов
    private final By headerTitleLocatorCheckoutOnePageHW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Checkout: Your Information')]");

    //public BurgerMenuPage_HW burgerMenuPage_HW;
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

    public void setPostalCode(String value) {
        getPostalCodeInput().sendKeys(value);
    }

    public void fillInYourInfoData() {
        setFirstName("FirstName");
        setLastName("LastName");
        setPostalCode("PostalCode");
    }

    // Блок комплексных методов
    public CheckoutOnePageHW fillingInWithValidDataHW() {
        fillInYourInfoData();
        return new CheckoutOnePageHW(driver);
    }

    public CheckoutTwoPageHW continueCheckout(){
        getContinueButton().click();
        return new CheckoutTwoPageHW(driver);
    }
}