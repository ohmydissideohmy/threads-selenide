package tests.ratingsTests;

import org.junit.Test;
import tests.BaseTest;

public class RatingWorstMoviesTest extends BaseTest {

    @Test
    public void ratingWorstMoviesTest() {
        homePage.openRatingsPage();
        ratingsPage.selectWorstMovie("триллеры");
        ratingsPage.checkMoviesAreSortedAsWorst();
    }
}
