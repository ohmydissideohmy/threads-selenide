package tests.ratingsTests;

import org.junit.Test;
import tests.BaseTest;

public class PlatformUserScoreTest extends BaseTest {

    @Test
    public void platformUserScoreTest() {
        homePage.clickOnGamesButton();
        gamesPage.selectPS4Platform();
        gamesPage.clickOnUserScoreButton();
        gamesPage.expandAllDescriptions();
        gamesPage.checkGamesAreSortedByUserScore();
    }
}
