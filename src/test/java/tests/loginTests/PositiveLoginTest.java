package tests.loginTests;

import org.junit.Test;
import tests.BaseTest;

public class PositiveLoginTest extends BaseTest {

    @Test
    public void positiveLoginTest() {
        homePage.clickOnSignInButton();
        yandexPasportPage.inputLogin(propertyReader.getProperty("username"));
        yandexPasportPage.inputPassword(propertyReader.getProperty("password"));
        homePage.checkloggedUserAvatarIsVisible();
    }
}
