package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.configuration.ReadProperties;

import java.time.Duration;

public class BrowserFactory {
    private WebDriver driver = null;
    private DriverManagerType driverManagerType = null;
    public BrowserFactory(){

        switch (ReadProperties.browserName().toLowerCase()){
            case "chrome":
                driverManagerType = DriverManagerType.CHROME;
                //WebDriverManager.getInstance(driverManagerType).setup();
                WebDriverManager.chromedriver().driverVersion("114.0.573.98");
                driver = new ChromeDriver(getChromeOptions());
                break;
            case "firefox":
                driverManagerType = DriverManagerType.FIREFOX;
                WebDriverManager.getInstance(driverManagerType).setup();
                driver = new FirefoxDriver(getFirefoxOptions());
                break;
            default:
                System.out.println("Browser " + ReadProperties.browserName() + " is not supported");
                break;
        }
    }

    public WebDriver getDriver(){
        driver.manage().window().maximize(); // принудительное развертывание окна браузера на макс
        // driver.manage().window().fullscreen(); // исчезают все эл-ты управления
        driver.manage().deleteAllCookies();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return this.driver;
    }

    public ChromeOptions getChromeOptions() {
        // класс ChromeOptions позволяет добавлять параметрв до момента инициализации
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false); // запускает браузер без визуальноц части. Работает только в памяти, визуально не виден
        // так же позволяет проверить работоспособность тестов перед запуском на удаленной машине
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--silent");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");

        return chromeOptions;
    }
    public FirefoxOptions getFirefoxOptions() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setHeadless(false);
        firefoxOptions.addArguments("--disable-gpu");
        firefoxOptions.addArguments("--ignore-certificate-errors");
        firefoxOptions.addArguments("--silent");
        firefoxOptions.addArguments("--start-maximized");
        firefoxOptions.addArguments("--incognito");

        return firefoxOptions;
    }
}