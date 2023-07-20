package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.InventoryPageHW;

public class LoginStepHW extends BaseStepHW {

    public LoginStepHW(WebDriver driver) {
        super(driver);
    }

    public InventoryPageHW successLogin(String username, String psw) {
        loginPage.login(username, psw);

        return inventoryPage;
    }
}