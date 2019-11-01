package tests.ratingsTests;

import org.junit.Ignore;
import org.junit.Test;
import tests.BaseTest;

public class SortingOnRatingsPageByYearTest extends BaseTest {

    @Ignore
    @Test
    public void sortingOnRatingsPageByYearTest() {
        homePage.openRatingsPage();
        ratingsPage.selectMoviesYears("60");
        ratingsPage.checkMoviesAreSortedByYear("196");
    }
}
