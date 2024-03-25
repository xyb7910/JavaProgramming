package com.simon.testthread;

public class TestThread {
    public static void main(String[] args) {
//        new RunnableDemo("Thread-1").start();
//        new RunnableDemo("Thread-2").start();

        new ThreadDemo("Thread-1").start();
        new ThreadDemo("Thread-2").start();
    }
}
