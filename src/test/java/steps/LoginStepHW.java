package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.InventoryPageHW;

public class LoginStepHW extends BaseStepHW {

    public LoginStepHW(WebDriver driver) {
        super(driver);
    }

    public InventoryPageHW successLoginHW(String username, String psw) {
        loginPageHW.loginHW(username, psw);

        return inventoryPageHW;
    }
}