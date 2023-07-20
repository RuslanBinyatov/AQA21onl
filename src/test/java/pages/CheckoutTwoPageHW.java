package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.WebDriver;

public class CheckoutTwoPageHW extends BasePageHW {
    private final static String pagePath = "/checkout-step-two.html";

    // Блок описания локаторов для элементов

    // Блок инициализации
    public CheckoutTwoPageHW(WebDriver driver) {
        super(driver);
    }
    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов

}
