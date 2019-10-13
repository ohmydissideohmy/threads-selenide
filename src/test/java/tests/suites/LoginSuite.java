package tests.suites;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.loginTests.NegativeLoginIncorrectLoginTest;
import tests.loginTests.NegativeLoginIncorrectPasswordTest;
import tests.loginTests.PositiveLoginTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        NegativeLoginIncorrectLoginTest.class,
        NegativeLoginIncorrectPasswordTest.class,
        PositiveLoginTest.class} )

public class LoginSuite {

        @Test
        public void loginTestSuite() {

        }

    }

