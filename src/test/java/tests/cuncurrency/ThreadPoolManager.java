package tests.cuncurrency;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static tests.utils.SuiteRunner.runSuite;

public class ThreadPoolManager {

    private ExecutorService executor;
    private Class[] suits;

    public ThreadPoolManager(Class[] suits) {
        this.executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() + 1);
        this.suits = suits;
    }

    public void execute() {
        Arrays.stream(suits).forEach(suit -> executor.submit(() -> runSuite(suit)));
        executor.shutdown();
    }
}
