package tests.ratingsTests;

import org.junit.Test;
import tests.BaseTest;

public class RatingsOnMarksTabCheck extends BaseTest {

    @Test
    public void ratingsOnMarksTabCheck() {
        homePage.openRatingsPage();
        ratingsPage.openMarksTab();
        ratingsPage.clickOnRatingsByButton();
        ratingsPage.checkMoviesAreSortedByMarksNumber();
    }

}
