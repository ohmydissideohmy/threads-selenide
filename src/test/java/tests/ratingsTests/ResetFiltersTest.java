package tests.ratingsTests;

import org.junit.Test;
import tests.BaseTest;

public class ResetFiltersTest extends BaseTest {

    @Test
    public void resetFiltersTest() {
        homePage.openRatingsPage();
        ratingsPage.getMoviesList();
        ratingsPage.searchForMovieByExactYear("2010");
        ratingsPage.checkMoviesAreSortedByExactYear("2010");
        ratingsPage.searchForMovieByExactYear("-");
        ratingsPage.checkMoviesSortedByDefault();
    }

}
