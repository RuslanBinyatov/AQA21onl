package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.ProductsPageHW;

public class LoginStepHW extends BaseStepHW {

    public LoginStepHW(WebDriver driver) {
        super(driver);
    }

    public ProductsPageHW successLoginHW(String usernameHW, String pswHW) {
        loginPageHW.login_HW(usernameHW, pswHW);

        return productsPageHW;
    }
}