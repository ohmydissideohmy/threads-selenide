package tests.loginTests;

import org.junit.Test;
import tests.BaseTest;

public class NegativeLoginIncorrectPasswordTest extends BaseTest {

    @Test
    public void negativeLoginIncorrectPasswordTest() {
        homePage.clickOnSignInButton();
        yandexPasportPage.inputLogin(propertyReader.getProperty("username"));
        yandexPasportPage.inputPassword(propertyReader.getProperty("incorrectPassword"));
        yandexPasportPage.checkIncorrectPasswordErrorIsShown();
    }
}
