package tests.suites;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.loginTests.NegativeLoginIncorrectLoginTest;
import tests.loginTests.NegativeLoginIncorrectPasswordTest;
import tests.loginTests.PositiveLoginTest;
import tests.newAndNotableTests.MoviesNewAndNotableTest;
import tests.newAndNotableTests.NewAndNotableGamesTest;
import tests.newAndNotableTests.NewAndNotableMusicTest;
import tests.newAndNotableTests.NewAndNotableTVTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MoviesNewAndNotableTest.class,
        NewAndNotableGamesTest.class,
        NewAndNotableMusicTest.class,
        NewAndNotableTVTest.class
} )

public class NewAndNotableSuite {

    @Test
    public void newAndNotableTestSuite() {

    }

}
