package tests.searchTests;

import org.junit.Test;
import tests.BaseTest;

public class PositiveSearchTest extends BaseTest {

    @Test
    public void positiveSearchTest() {
//        homePage.inputInSearchPlaceholder("Бойцовский Клуб");
        searchResultsPage.checkMovieFound("Бойцовский клуб");
    }


}
