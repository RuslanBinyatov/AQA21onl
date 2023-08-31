package steps;

import pages.LoginPageHW;
import utils.configuration.ReadProperties;
import baseEntities.BaseTestHW;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepHW extends BaseTestHW{
    private BaseTestHW baseTest;
    private LoginPageHW loginPagehw;

    public LoginStepHW(BaseTestHW baseTest) {
        this.baseTest = baseTest;
    }

    @Given("start browser")
    public void startBrowser() {
    }

    @Given("open login page")
    public void openLoginPage() {
        driver.get(ReadProperties.getUrl());
    }

    @When("user logged in with username {} and password {}")
    public void setUsernameAndPassword(String username, String password) {
        loginPagehw = new LoginPageHW(driver);
        loginPagehw.getUserNameInput().sendKeys(username);
        loginPagehw.getPswInput().sendKeys(password);
        loginPagehw.getLoginButton().click();
    }
}