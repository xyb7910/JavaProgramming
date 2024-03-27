package com.simon.testthread.testsync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int count = 0;
    private Lock  lock = new ReentrantLock();

    public void increment() {
        //  add lock
        lock.lock();
        try {
            count ++;
        } finally {
            //  release lock
            lock.unlock();
        }
    }

    public void decrement() {
        //  add lock
        lock.lock();
        try {
            count --;
        } finally {
            //  release lock
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}
