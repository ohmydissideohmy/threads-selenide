package tests.searchTests;

import org.junit.Test;
import tests.BaseTest;

public class SearchByMusicTest extends BaseTest {

    @Test
    public void searchByMusicTest() {
        homePage.inputInSearchField("Testing");
        searchResultsPage.clickOnFirstItem();
        itemPage.checkThatMusicPageIsOpened();
    }

}
