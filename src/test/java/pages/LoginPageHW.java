package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageHW extends BasePageHW {

    // Блок описания локаторов для элементов
    private final By UserNameInputLocator = By.id("user-name");
    private final By pswInputLocator = By.id("password");
    private final By logInButtonLocator = By.id("login-button");

    // Блок инициализации
    public LoginPageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return logInButtonLocator;
    }

    // Блок атомарных методов
    public WebElement getUserNameInput() {
        return driver.findElement(UserNameInputLocator);
    }

    public WebElement getPswInput() {
        return driver.findElement(pswInputLocator);
    }

    public WebElement getLogInButton() {
        return driver.findElement(logInButtonLocator);
    }

    // Блок комплексных методов

}
