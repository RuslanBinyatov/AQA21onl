//package tests;
//
//import baseEntities.BaseTest_;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import utils.configuration.ReadProperties;
//
//import static utils.configuration.ReadProperties.password;
//
//public class EndToEndTestHW extends BaseTest_ {
//        @Test
//        public void successAuthorizationTest() {
//            Assert.assertTrue(
//                    authorizationStep.successAuthorization(
//                            ReadProperties.username(), ReadProperties.password()
//                    ).isPageOpened()
//            );
//        }
//
////    @Test(dependsOnMethods = "successAuthorizationTest")
////    public void successShoppingTest() {
////        Assert.assertEquals(
////                shoppingStep.successShopping(), "1"
////        );
////    }
////
////    @Test(dependsOnMethods = "successShoppingTest")
////    public void purchaseConfirmationTest() {
////        Assert.assertTrue(
////                shoppingStep.purchaseConfirmation().isPageOpened()
////        );
////    }
////
////    @Test(dependsOnMethods = "purchaseConfirmationTest")
////    public void successCartInformationTest() {
////        Assert.assertTrue(
////                shoppingStep.successCartInformation().isPageOpened()
////        );
////    }
////
////    @Test(dependsOnMethods = "successCartInformationTest")
////    public void successFinishShoppingTest() {
////        Assert.assertTrue(
////                shoppingStep.successFinishShopping().isPageOpened()
////        );
////    }
//}
