package tests.ratingsTests;

import org.junit.Test;
import tests.BaseTest;

public class PlatformMetaScoreTest extends BaseTest {

    @Test
    public void platformMetaScoreTest() {
        homePage.clickOnGamesButton();
        gamesPage.selectPS4Platform();
        gamesPage.checkGamesSortedByMetaRating();

    }

}
