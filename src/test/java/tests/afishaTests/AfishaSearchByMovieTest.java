package tests.afishaTests;

import org.junit.Test;
import tests.BaseTest;

public class AfishaSearchByMovieTest extends BaseTest {

    @Test
    public void afishaSearchByMovieTest() {
        homePage.clickOnAfishaButton();
        afishaPage.clickOnMoviesDropdown();
        afishaPage.getMovieFromDropdown();
        afishaPage.selectMovieInDropdown();
        afishaPage.clickOnShowResultsButton();
        searchResultsPage.openRandomCinema();
        searchResultsPage.checkThatCinemaHaveSelectedMovie();
    }

}
