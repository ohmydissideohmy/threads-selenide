package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tests.concurrency.TestThread;
import tests.suites.AfishaSuite;
import tests.suites.LoginSuite;

import static tests.util.TestRunnerUtil.runSuit;

public class TestRunner {
    public static void main(String[] args) {

        final Logger logger = LoggerFactory.getLogger(TestRunner.class);

        logger.info("------------------------------------ CLASSIC TESTS -------------------------------------");

        long startTime = System.nanoTime();

        runSuit(LoginSuite.class, AfishaSuite.class);

        long endTime = System.nanoTime();

        logger.info("RESULT WITHOUT MULTITHREADING : " + (endTime - startTime));

        logger.info("------------------------------------ MULTITHREADING -------------------------------------");

        startTime = System.nanoTime();

        new TestThread(LoginSuite.class);
        new TestThread(AfishaSuite.class);

        endTime = System.nanoTime();

        logger.info("RESULT WITH MULTITHREADING : " + (endTime - startTime));
    }
}
