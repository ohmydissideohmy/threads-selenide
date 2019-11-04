package tests.afishaTests;

import org.junit.Test;
import tests.BaseTest;

public class RatingSortingTest extends BaseTest {

    @Test
    public void ratingSortingTest() {
//        homePage.clickOnAfishaButton();
        afishaPage.clickOnSortByResults();
        afishaPage.checkMoviesSortedByRating();
    }

}
