package tests.ratingsTests;

import org.junit.Test;
import tests.BaseTest;

public class RatingsOnMarksTabTest extends BaseTest {

    @Test
    public void ratingsOnMarksTabTest() {
        homePage.openRatingsPage();
        ratingsPage.openMarksTab();
        ratingsPage.clickOnRatingsByButton();
        ratingsPage.checkMoviesAreSortedByRatingOnMarksTab();
    }
}
