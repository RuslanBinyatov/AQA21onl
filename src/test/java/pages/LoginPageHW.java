package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageHW extends BasePageHW {

    // Блок описания локаторов для элементов
    @FindBy (id = "user-name")
    public WebElement userNameInput;

    @FindBy (id = "password")
    public WebElement pswInput;

    @FindBy (id = "login-button")
    public WebElement loginButton;

    // Блок инициализации
    public LoginPageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.id("login-button");
    }

    // Блок атомарных методов

    // Блок комплексных методов
    public void loginHW(String username, String psw) {
        userNameInput.sendKeys(username);
        pswInput.sendKeys(psw);
        loginButton.click();
    }
}