package tests.searchTests;

import org.junit.Test;
import tests.BaseTest;

public class NegativeSearchTest extends BaseTest {

    @Test
    public void negativeSearchTest() {
        homePage.inputInSearchPlaceholder("adklgjadlgkjsdklgsjdlgjsjdkg");
        searchResultsPage.checkSearchErrorIsShown();
    }

}
