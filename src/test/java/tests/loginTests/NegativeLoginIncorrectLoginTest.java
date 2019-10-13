package tests.loginTests;

import org.junit.Test;
import tests.BaseTest;

public class NegativeLoginIncorrectLoginTest extends BaseTest {

    @Test
    public void negativeLoginIncorrectLoginTest() {
        homePage.clickOnSignInButton();
        yandexPasportPage.inputLogin("incorrectLogin");
        yandexPasportPage.checkPasswordPlaceholderIsNotVisible();
    }
}
