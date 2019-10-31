package tests.suites;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.searchTests.NegativeSearchTest;
import tests.searchTests.PositiveSearchTest;
import tests.searchTests.SearchByActor;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        NegativeSearchTest.class,
        PositiveSearchTest.class,
        SearchByActor.class
})
public class SearchSuite {

    @Test
    public void searchTestSuite() {

    }


}
