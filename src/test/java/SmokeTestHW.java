import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
import static java.lang.Thread.sleep;

public class SmokeTestHW {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }

    @Test
    public void calcElectricHotFloorTest() {
        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        WebElement widthInput = driver.findElement(By.id("el_f_width"));
        WebElement lenghtInput = driver.findElement(By.id("el_f_lenght"));
        WebElement lossesInput = driver.findElement(By.id("el_f_losses"));
        WebElement calcButton = driver.findElement(By.name("button"));

        WebElement selectWebElement1 = driver.findElement(By.id("room_type"));
        Select selectRoomType = new Select(selectWebElement1);
        WebElement selectWebElement2 = driver.findElement(By.id("heating_type"));
        Select selectHeatingType = new Select(selectWebElement2);

        selectRoomType.selectByVisibleText("Ванная");
        selectHeatingType.selectByValue("3");

        widthInput.sendKeys("3");
        lenghtInput.sendKeys("4");
        lossesInput.sendKeys("120");
        calcButton.click();

        Assert.assertEquals(driver.findElement(By.id("floor_cable_power")).getText(), "67");
        Assert.assertEquals(driver.findElement(By.id("spec_floor_cable_power")).getText(), "6");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
