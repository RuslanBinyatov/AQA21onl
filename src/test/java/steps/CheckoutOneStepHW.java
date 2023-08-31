package steps;

import io.cucumber.java.en.When;
import baseEntities.BaseTestHW;
import pages.CheckoutOnePageHW;

public class CheckoutOneStepHW extends BaseTestHW {

    private BaseTestHW baseTest;
    private CheckoutOnePageHW checkoutOnePageHW;

    public CheckoutOneStepHW(BaseTestHW baseTest) {
        this.baseTest = baseTest;
        checkoutOnePageHW = new CheckoutOnePageHW(driver);
    }

    @When("user fills in first name {} last name {} and postal code {}")
    public void fillInYourInfoData(String firstName, String lastName, String postalCode){
        checkoutOnePageHW.getFirstNameInput().sendKeys(firstName);
        checkoutOnePageHW.getLastNameInput().sendKeys(lastName);
        checkoutOnePageHW.getPostalCodeInput().sendKeys(postalCode);
    }

    @When("user clicks continue checkout")
    public void continueCheckout(){
        checkoutOnePageHW.getContinueButton().click();
    }
}