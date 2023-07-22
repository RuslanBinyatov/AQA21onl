package tests;

import baseEntities.BaseTestHW;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class EndToEndTestHW extends BaseTestHW {

    @Test
    public void E2ETest() {
        Assert.assertTrue(loginStep_HW.successLogin_HW(ReadProperties.username(), ReadProperties.password()).isPageOpened());
        Assert.assertTrue(productsStep_HW.addToCart_HW().isPageOpened());
        Assert.assertTrue(productsStep_HW.removeButtonIsDisplayed().isPageOpened());
        Assert.assertTrue(productsStep_HW.openCart_HW().isPageOpened());
        Assert.assertTrue(cartStep_HW.checkProductIsInTheCart());
        Assert.assertTrue(cartStep_HW.checkout_HW().isPageOpened());
        Assert.assertTrue(checkoutYourInformationStep_HW.fillingInWithValidData_HW().isPageOpened());
        Assert.assertTrue(checkoutYourInformationStep_HW.continueCheckout().isPageOpened());
        Assert.assertTrue(checkoutOverviewStep_HW.checkProductIsInTheOverview());
        Assert.assertTrue(checkoutOverviewStep_HW.finishCheckout().isPageOpened());
    }
}