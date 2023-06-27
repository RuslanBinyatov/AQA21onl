import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SmokeTestHW {
    @Test
    public void calcElectricHotFloorTest() {
        BrowserFactory browserFactory = new BrowserFactory();
        WebDriver driver = browserFactory.getDriver();

        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");

        WebElement widthInput = driver.findElement(By.id("el_f_width"));
        WebElement lenghtInput = driver.findElement(By.id("el_f_lenght"));
        WebElement calcButton = driver.findElement(By.name("button"));


        driver.quit();
    }
}
