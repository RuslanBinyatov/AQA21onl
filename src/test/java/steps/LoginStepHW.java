package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.ProductsPageHW;

public class LoginStepHW extends BaseStepHW {

    public LoginStepHW(WebDriver driver) {
        super(driver);
    }

    public ProductsPageHW successLogin_HW(String usernameHW, String pswHW) {
        loginPage_HW.login_HW(usernameHW, pswHW);

        return productsPage_HW;
    }
}