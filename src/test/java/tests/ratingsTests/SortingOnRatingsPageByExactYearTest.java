package tests.ratingsTests;

import org.junit.Test;
import tests.BaseTest;

public class SortingOnRatingsPageByExactYearTest extends BaseTest {

    @Test
    public void sortingOnRatingsPageByExactYearTest() {
        homePage.openRatingsPage();
        ratingsPage.searchForMovieByExactYear("2010");
        ratingsPage.checkMoviesAreSortedByExactYear("2010");
    }
}
