package steps;

import baseEntities.BaseStepHW;
import models.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.InventoryPageHW;

public class LoginStepHW extends BaseStepHW {

    static Logger logger = LogManager.getLogger(LoginStepHW.class);

    public LoginStepHW(WebDriver driver) {
        super(driver);
    }

    public InventoryPageHW successLoginHW(User user) {
        loginPageHW.loginNormal(user);

        logger.info("User is successfully logged in");
        return inventoryPageHW;
    }
}