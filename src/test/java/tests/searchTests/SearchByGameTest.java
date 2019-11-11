package tests.searchTests;

import org.junit.Test;
import tests.BaseTest;

public class SearchByGameTest extends BaseTest {

    @Test
    public void searchByGameTest() {
        homePage.inputInSearchField("Death stranding");
        searchResultsPage.clickOnFirstItem();
        itemPage.checkThatGamesPageIsOpened();
    }

}
