package tests;

import baseEntities.BaseTestHW;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

import static java.lang.Thread.sleep;

public class EndToEndTestHW extends BaseTestHW {

    @Test
    public void E2ETest() throws InterruptedException {
        sleep(2000);
        Assert.assertTrue(loginStepHW.successLoginHW(ReadProperties.username(), ReadProperties.password()).isPageOpened());
        sleep(2000);
        Assert.assertTrue(inventoryStepHW.addToCartHW().isPageOpened());
        sleep(2000);
        Assert.assertTrue(inventoryStepHW.openCartHW().isPageOpened());
        sleep(2000);
        Assert.assertTrue(cartStepHW.checkoutHW().isPageOpened());
        sleep(2000);
        Assert.assertTrue(checkoutOneStepHW.fillingInWithValidDataHW().isPageOpened());
        sleep(2000);
        Assert.assertTrue(checkoutOneStepHW.continueCheckout().isPageOpened());
        sleep(2000);
        Assert.assertTrue(checkoutTwoStepHW.finishCheckout().isPageOpened());
        sleep(2000);
    }
}