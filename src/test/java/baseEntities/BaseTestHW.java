//package baseEntities;
//
//import factory.BrowserFactory;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import pages.InventoryPageHW;
//import steps.LoginStepHW;
//import utils.configuration.ReadProperties;
//
//public class BaseTestHW {
//    protected WebDriver driver;
//
//    protected LoginStepHW loginStep;
//    protected InventoryPageHW inventoryPage;
//
//    @BeforeMethod
//    public void setUp() {
//        BrowserFactory browserFactory = new BrowserFactory();
//        driver = browserFactory.getDriver();
//
//        loginStep = new LoginStepHW(driver);
//        inventoryPage = new InventoryPageHW(driver);
//
//        driver.get(ReadProperties.getUrl());
//    }
//
////    @AfterMethod
////    public void tearDown() {
////        driver.quit();
////    }
//
//}
