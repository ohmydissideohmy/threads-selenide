package tests.afishaTests;

import org.junit.Test;
import tests.BaseTest;

public class AfishaLocationTest extends BaseTest {

    @Test
    public void afishaLocationTest() {
        homePage.clickOnAfishaButton();
        afishaPage.checkCityIsCorrect();
        afishaPage.checkCountryIsCorrect();
    }

}
