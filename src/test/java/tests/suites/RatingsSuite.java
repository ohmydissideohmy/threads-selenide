package tests.suites;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.ratingsTests.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        GamePlatormChangeTest.class,
        MetascoreGamesRatingTest.class,
        PlatformMetaScoreTest.class,
        PlatformUserScoreTest.class,
        UserScoreGamesRatingTest.class
})

public class RatingsSuite {

    @Test
    public void ratingsTestSuite() {

    }


}
