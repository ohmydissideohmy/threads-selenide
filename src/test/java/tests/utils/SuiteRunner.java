package tests.utils;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class SuiteRunner {

    public static void runSuite(Class suite) {
        Result result = JUnitCore.runClasses(suite);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("RESULT FOR SUITE " + suite.getName() + " IS : " + result.wasSuccessful());
    }
}
