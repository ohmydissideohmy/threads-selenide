package tests.concurrency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static tests.util.TestRunnerUtil.runSuit;

public class TestThread implements Runnable {

    private Thread t;
    private Class suitClass;

    final private Logger logger = LoggerFactory.getLogger(TestThread.class);


    public TestThread(Class suitClass) {

        this.suitClass = suitClass;
        t = new Thread(this, suitClass.getName());
        logger.info("Thread with " + suitClass.getName() + " is created");
        t.start();

    }

    @Override
    public void run() {
        runSuit(suitClass);
    }

}
