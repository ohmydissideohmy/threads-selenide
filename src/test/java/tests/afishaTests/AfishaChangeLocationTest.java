package tests.afishaTests;

import org.junit.Test;
import tests.BaseTest;

public class AfishaChangeLocationTest extends BaseTest {

    @Test
    public void afishaChangeLocationTest() {
//        homePage.clickOnAfishaButton();
        afishaPage.selectCountryFromDropdown("Украина");
        afishaPage.selectCityFromDropdown("Киев");
        afishaPage.clickOnShowResultsButton();
        searchResultsPage.checkThatCityHaveExactCinema("Wizoria");
    }
}
