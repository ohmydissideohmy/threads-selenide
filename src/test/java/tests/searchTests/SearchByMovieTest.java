package tests.searchTests;

import org.junit.Test;
import tests.BaseTest;

public class SearchByMovieTest extends BaseTest {

    @Test
    public void searchByMovieTest() {
        homePage.inputInSearchField("Men In black");
        searchResultsPage.clickOnFirstItem();
        itemPage.checkThatMoviePageIsOpened();
    }
}
