package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import steps.LoginStep;
import steps.LoginStepHW;
import utils.configuration.ReadProperties;

public class BaseTestHW {
    protected WebDriver driver;

    protected LoginStepHW loginStep;

    @BeforeClass
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();

        loginStep = new LoginStepHW(driver);

        driver.get(ReadProperties.getUrl());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
