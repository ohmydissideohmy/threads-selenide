package tests.util;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tests.concurrency.TestThread;

public class TestRunnerUtil {

    final private static Logger logger = LoggerFactory.getLogger(TestThread.class);

    public static void runSuit(Class... suitClass) {

        Result result = JUnitCore.runClasses(suitClass);

        for (Failure failure : result.getFailures()) {
            logger.error(failure.toString());
        }

        logger.info("RESULT WAS SUCCESSFUL : " + result.wasSuccessful());
    }
}
