package tests.ratingsTests;

import org.junit.Test;
import tests.BaseTest;

public class GamePlatormChangeTest extends BaseTest {

    @Test
    public void GamePlatormChangeTest() {
        homePage.clickOnGamesButton();
        gamesPage.selectPS4Platform();
        gamesPage.checkAllGamesAreForPS4();
    }
}
