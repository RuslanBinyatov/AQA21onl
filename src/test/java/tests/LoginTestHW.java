package tests;

import baseEntities.BaseTestHW;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class LoginTestHW extends BaseTestHW {

    @Test
    public void successLoginTest() {
        Assert.assertTrue(
                loginStep.successLogin(ReadProperties.username(), ReadProperties.password()
                ).isPageOpened());
    }
}