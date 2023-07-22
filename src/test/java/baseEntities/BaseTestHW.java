//package baseEntities;
//
//import factory.BrowserFactory;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import steps.LoginStepHW;
//import steps.ShoppingStep;
//import utils.configuration.ReadProperties;
//
//public class BaseTestHW {
//    protected WebDriver driver;
//
//    protected LoginStepHW loginStep;
//    protected ShoppingStep shoppingStep;
//
//    @BeforeMethod
//    public void setUp() {
//        BrowserFactory browserFactory = new BrowserFactory();
//        driver = browserFactory.getDriver();
//
//        loginStep = new LoginStepHW(driver);
//        shoppingStep = new ShoppingStep(driver);
//
//        driver.get(ReadProperties.getUrl());
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
//}
