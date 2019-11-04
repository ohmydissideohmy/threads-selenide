package tests.ratingsTests;

import org.junit.Test;
import tests.BaseTest;

public class UserScoreGamesRatingTest extends BaseTest {

    @Test
    public void userScoreGamesRatingTest() {
        homePage.clickOnGamesButton();
        gamesPage.clickOnUserScoreButton();
        gamesPage.expandAllDescriptions();
        gamesPage.checkGamesAreSortedByUserScore();
    }

}
