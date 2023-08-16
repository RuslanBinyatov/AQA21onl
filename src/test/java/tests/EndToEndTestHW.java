package tests;

import baseEntities.BaseTestHW;
import helper.DataHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndToEndTestHW extends BaseTestHW {

    @Test
    public void E2ETest() {
            Assert.assertTrue(loginStepHW.successLogin_HW(DataHelper.getStandardUser()).isPageOpened());
            Assert.assertTrue(inventoryStepHW.addToCart_HW().isPageOpened());
            Assert.assertTrue(inventoryStepHW.removeButtonIsDisplayed().isPageOpened());
            Assert.assertTrue(inventoryStepHW.openCartHW().isPageOpened());
            Assert.assertTrue(cartStepHW.checkProductIsInTheCart());
            Assert.assertTrue(cartStepHW.checkoutHW().isPageOpened());
            Assert.assertTrue(checkoutOneStepHW.fillingInWithValidDataHW(DataHelper.getCommonUserData()).isPageOpened());
            Assert.assertTrue(checkoutOneStepHW.continueCheckout().isPageOpened());
            Assert.assertTrue(checkoutTwoStepHW.checkProductIsInTheOverview());
            Assert.assertTrue(checkoutTwoStepHW.finishCheckout().isPageOpened());
        }
}