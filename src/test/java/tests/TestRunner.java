package tests;

import tests.cuncurrency.ThreadPoolManager;

import static tests.utils.Suites.suites;

public class TestRunner {
    public static void main(String[] args) {
        ThreadPoolManager manager = new ThreadPoolManager(suites);
        manager.execute();
    }
}
