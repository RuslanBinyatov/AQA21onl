package tests;

import baseEntities.BaseTestHW;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class EndToEndTestHW extends BaseTestHW {

    @Test
    public void E2ETest() {
        Assert.assertTrue(loginStepHW.successLoginHW(ReadProperties.username(), ReadProperties.password()).isPageOpened());
        Assert.assertTrue(inventoryStepHW.addToCartHW().isPageOpened());
//        Assert.assertTrue(inventoryStepHW.removeButtonIsDisplayed().isPageOpened());
        Assert.assertTrue(inventoryStepHW.openCartHW().isPageOpened());
        Assert.assertTrue(cartStepHW.checkProductIsInTheCart());
        Assert.assertTrue(cartStepHW.checkout_HW().isPageOpened());
        Assert.assertTrue(checkoutYourInformationStepHW.fillingInWithValidDataHW().isPageOpened());
        Assert.assertTrue(checkoutYourInformationStepHW.continueCheckout().isPageOpened());
        Assert.assertTrue(checkoutOverviewStepHW.checkProductIsInTheOverview());
        Assert.assertTrue(checkoutOverviewStepHW.finishCheckout().isPageOpened());
    }
}