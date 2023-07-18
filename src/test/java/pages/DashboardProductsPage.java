package pages;

import baseEntities.BasePage;
import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardProductsPage extends BasePageHW {
    private final static String pagePath = "/inventory.html";

    // Блок описания локаторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//span[contains(@class, 'title') and contains(text(), 'Products')]");

    public TopMenuPage topMenuPage;
    public SideMenuPage sideMenuPage;

    // Блок инициализации
    public DashboardProductsPage(WebDriver driver) {
        super(driver);

        topMenuPage = new TopMenuPage(driver);
        sideMenuPage = new SideMenuPage(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public WebElement getHeaderTitle() {
        return driver.findElement(headerTitleLabelLocator);
    }
}
