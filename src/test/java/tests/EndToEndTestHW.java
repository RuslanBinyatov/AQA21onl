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
        Assert.assertTrue(inventoryStepHW.openCartHW().isPageOpened());
        Assert.assertTrue(cartStepHW.checkoutHW().isPageOpened());
        Assert.assertTrue(checkoutOneStepHW.fillingInWithValidDataHW().isPageOpened());
        Assert.assertTrue(checkoutOneStepHW.continueCheckout().isPageOpened());
        Assert.assertTrue(checkoutTwoStepHW.finishCheckout().isPageOpened());
        Assert.assertTrue(checkoutCompleteStepHW.backHomeCheckout().isPageOpened());
    }
}