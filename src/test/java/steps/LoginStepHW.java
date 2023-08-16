package steps;

import baseEntities.BaseStepHW;
import models.User;
import org.openqa.selenium.WebDriver;
import pages.InventoryPageHW;

public class LoginStepHW extends BaseStepHW {

    public LoginStepHW(WebDriver driver) {
        super(driver);
    }

    public InventoryPageHW successLogin_HW(User user) {
        loginPageHW.loginNormal(user);
        return inventoryPageHW;
    }
}