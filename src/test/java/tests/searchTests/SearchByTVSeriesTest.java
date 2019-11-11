package tests.searchTests;

import org.junit.Test;
import tests.BaseTest;

public class SearchByTVSeriesTest extends BaseTest {

    @Test
    public void searchByTVTest() {
        homePage.inputInSearchField("Black Mirror");
        searchResultsPage.clickOnFirstItem();
        itemPage.checkThatTVPageIsOpened();
    }
}
