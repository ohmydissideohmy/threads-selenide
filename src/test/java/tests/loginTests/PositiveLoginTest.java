package tests.loginTests;

import org.junit.Test;
import tests.BaseTest;

public class PositiveLoginTest extends BaseTest {

    @Test
    public void positiveLoginTest() {
        homePage.clickOnSignInButton();
        loginPage.inputLogin(propertyReader.getProperty("username"));
        loginPage.inputPassword(propertyReader.getProperty("password"));
        loginPage.clickOnLoginButton();
        homePage.checkloggedUserAvatarIsVisible();
    }
}
