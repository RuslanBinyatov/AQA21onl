package tests;

import baseEntities.BaseTestHW;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutCompletePageHW;
import pages.LoginPageHW;
import utils.configuration.ReadProperties;

public class EndToEndTestHW extends BaseTestHW {
        @Test
    public void E2ETest() {
            new LoginPageHW(driver)

                    .loginHW(ReadProperties.username(), ReadProperties.password())
                    .addToCartHW()
                    .openCartHW()
                    .checkoutHW()
                    .fillingInWithValidDataHW()
                    .continueCheckout()
                    .finishCheckout();

            Assert.assertTrue(new CheckoutCompletePageHW(driver).isPageOpened());
        }
}