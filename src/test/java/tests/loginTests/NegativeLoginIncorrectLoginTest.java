package tests.loginTests;

import org.junit.Test;
import tests.BaseTest;

public class NegativeLoginIncorrectLoginTest extends BaseTest {

    @Test
    public void negativeLoginIncorrectLoginTest() {
        homePage.clickOnSignInButton();
        loginPage.inputLogin("incorrectLogin");
        loginPage.clickOnLoginButton();
        loginPage.checkIncorrectPasswordErrorIsShown();
    }
}
