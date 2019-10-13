package tests.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.afishaTests.AfishaLocationTest;
import tests.afishaTests.AfishaSearchByMovieTest;
import tests.loginTests.NegativeLoginIncorrectLoginTest;
import tests.loginTests.NegativeLoginIncorrectPasswordTest;
import tests.loginTests.PositiveLoginTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AfishaLocationTest.class,
        AfishaSearchByMovieTest.class
})

public class AfishaSuite {
}
