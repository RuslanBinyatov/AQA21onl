package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.InventoryPageHW;

public class LoginStepHW extends BaseStepHW {

    public LoginStepHW(WebDriver driver) {
        super(driver);
    }

    public InventoryPageHW successLoginHW(String usernameHW, String pswHW) {
        loginPageHW.loginHW(usernameHW, pswHW);

        return inventoryPageHW;
    }
}