package tests.ratingsTests;

import org.junit.Test;
import tests.BaseTest;

public class MetascoreGamesRatingTest extends BaseTest {

    @Test
    public void metascoreGamesRatingTest() {
        homePage.clickOnGamesButton();
        gamesPage.checkGamesSortedByMetaRating();
    }

}
