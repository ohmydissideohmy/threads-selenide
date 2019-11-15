package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import tests.suites.LoginSuite;
import tests.suites.RatingsSuite;
import tests.suites.SearchSuite;
import java.lang.reflect.Method;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(LoginSuite.class, RatingsSuite.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
            System.out.println(result.wasSuccessful());
        }
    }
}