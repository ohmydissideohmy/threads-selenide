package tests.searchTests;

import org.junit.Test;
import tests.BaseTest;

public class SearchByActor extends BaseTest {

    @Test
    public void searchByActor() {
//        homePage.inputInSearchPlaceholder("Таррантино");
        searchResultsPage.checkMovieFound("Квентин Тарантино");
    }
}
