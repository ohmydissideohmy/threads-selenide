package tests.loginTests;

import org.junit.Test;
import tests.BaseTest;

public class NegativeLoginIncorrectPasswordTest extends BaseTest {

    @Test
    public void negativeLoginIncorrectPasswordTest() {
        homePage.clickOnSignInButton();
        loginPage.inputLogin(propertyReader.getProperty("username"));
        loginPage.inputPassword(propertyReader.getProperty("incorrectPassword"));
        loginPage.clickOnLoginButton();
        loginPage.checkIncorrectPasswordErrorIsShown();
    }
}
