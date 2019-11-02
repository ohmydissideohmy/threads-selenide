package tests.suites;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.ratingsTests.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        RatingsOnMarksTabCheck.class,
        RatingsOnMarksTabTest.class,
        RatingWorstMoviesTest.class,
        ResetFiltersTest.class,
        SortingOnRatingsPageByExactYearTest.class,
        SortingOnRatingsPageByYearTest.class
})

public class RatingsSuite {

    @Test
    public void ratingsTestSuite() {

    }


}
