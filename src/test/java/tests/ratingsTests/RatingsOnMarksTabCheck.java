package tests.ratingsTests;

import org.junit.Ignore;
import org.junit.Test;
import tests.BaseTest;

public class RatingsOnMarksTabCheck extends BaseTest {

    @Ignore
    @Test
    public void ratingsOnMarksTabCheck() {
        homePage.openRatingsPage();
        ratingsPage.openMarksTab();
        ratingsPage.clickOnRatingsByButton();
        ratingsPage.checkMoviesAreSortedByMarksNumber();
    }

}
