package tests.suites;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.searchTests.SearchByGameTest;
import tests.searchTests.SearchByMovieTest;
import tests.searchTests.SearchByMusicTest;
import tests.searchTests.SearchByTVSeriesTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SearchByGameTest.class,
        SearchByTVSeriesTest.class,
        SearchByMusicTest.class,
        SearchByMovieTest.class
})
public class SearchSuite {

    @Test
    public void searchTestSuite() {

    }


}
