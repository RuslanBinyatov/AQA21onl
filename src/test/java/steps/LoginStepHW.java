package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;

public class LoginStepHW extends BaseStepHW {

    public LoginStepHW(WebDriver driver) {
        super(driver);
    }

    public LoginPageHW successLogin(String username, String psw) {
        loginPage.login(username, psw);

        return inventoryPage;
    }
}