import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class XpathLocatorsTestHW {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void basicXpathLocatorsTest() {
        driver.get(ReadProperties.getUrl());

        // Все элементы на странице начина с HTML
        driver.findElements(By.xpath("//*"));

        // Аналог поиска по tagName
        Assert.assertTrue(driver.findElement(By.xpath("//sup")).isDisplayed());

        // Аналог родительского ol и на один уровень ниже li
        Assert.assertTrue(driver.findElement(By.xpath("//ol/li")).isDisplayed());

        // Аналог родительского form и на любом уровене ниже div
        Assert.assertTrue(driver.findElement(By.xpath("//form//div")).isDisplayed());

        // Поиск элемента с тэгом form у которого есть аьттрибут id
        Assert.assertTrue(driver.findElement(By.xpath("//form[@id]")).isDisplayed());

        // Поиск элемента у которого есть аттрибут id cо значением hiddenForm
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id = 'hiddenForm']")).isDisplayed());

        // Поиск элемента у которого есть аттрибут name cо значением и aттрибут type со значением
        Assert.assertTrue(driver.findElement(By.xpath("//*[@name='fieldText' and @type='hidden']")).isDisplayed());

        // Поиск элемента у которого значение аттрибута начинается с
        Assert.assertTrue(driver.findElement(By.xpath("//*[starts-with(@id, 'autosize')]")).isDisplayed());

        // Поиск элемента у которого значение аттрибута содержит подстроку
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@id, 'helpers')]")).isDisplayed());

        // Поиск элемента у которого текстовое значение содержит равно
        Assert.assertTrue(driver.findElement(By.xpath("//span[text() = 'Рассчитать']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[. = 'Рассчитать']")).isDisplayed());

        // Поиск элемента у которого текстовое значение содержит подстроку
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'обратной')]")).isDisplayed());

        // Поиск элемента по индексу
        Assert.assertTrue(driver.findElement(By.xpath("//li[21]")).isDisplayed());
    }

    @Test
    public void axesXPathTest() {
        driver.get(ReadProperties.getUrl());

        // Поиск родителя у элемента с тэгом h1
        Assert.assertTrue(driver.findElement(By.xpath("//h1/..")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//h1/parent::div")).isDisplayed());

        // Поиск всех предков с тэгом div у элемента с тэгом h1
        Assert.assertTrue(driver.findElement(By.xpath("//h1/ancestor::div")).isDisplayed());

        // Использование child - все дочерние элементы с тэго a от div
        Assert.assertTrue(driver.findElement(By.xpath("//div/child::a")).isDisplayed());

        // Использование child - все дочерние элементы с тэго a от div
        Assert.assertTrue(driver.findElement(By.xpath("//div/descendant::a")).isDisplayed());

        //Использование following - Выбирает всё в документе после закрытия тэга текущего узла
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='dialog-title']/following::form")).isDisplayed());

        //Использование following-sibling - Выбирает все узлы одного уровня после текущего узла
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='dialog-title']/following-sibling::form")).isDisplayed());

        //Использование preceding- Выбирает все узлы, которые появляются перед текущим узлом в документе
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class=\"dialog-title\"]/preceding::form")).isDisplayed());

        //Использование preceding-sibling - Выбирает все узлы одного уровня до текущего узла
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='dialog-title']/preceding-sibling::form")).isDisplayed());
    }
}
