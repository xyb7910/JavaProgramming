package com.simon.testthread.testsync;

public class SynchronizedDemo {
    private int count = 0;
    public synchronized void increment() {
        count ++;
    }
    public int getCount() {
        return count;
    }
}
