package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageHW extends BasePageHW {

    // Блок описания локаторов для элементов
//    private final By userNameInputLocator = By.id("user-name");

    @FindBy (id = "user-name")
    public WebElement userNameInput;

//    private final By pswInputLocator = By.id("password");

    @FindBy (id = "password")
    public WebElement pswInput;

//    private final By loginButtonLocator = By.id("login-button");

    @FindBy (id = "login-button")
    public WebElement loginButton;

    // Блок инициализации
    public LoginPageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return loginButton;
//        return loginButtonLocator;
    }

    // Блок атомарных методов

    public WebElement getUserNameInput() {
        return By.id("user-name");
//        return driver.findElement(userNameInputLocator);
    }

    public WebElement getPswInput() {
        return By.id("password");
//        return driver.findElement(pswInputLocator);
    }

    public WebElement getLoginButton() {
        return By.id("login-button");
//        return driver.findElement(loginButtonLocator);
    }

    // Блок комплексных методов
    public void loginHW(String username, String psw) {
        getUserNameInput().sendKeys(username);
        getPswInput().sendKeys(psw);
        getLoginButton().click();
    }
}
