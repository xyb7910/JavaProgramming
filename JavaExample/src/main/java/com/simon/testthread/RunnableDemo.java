package com.simon.testthread;

// 1. Create a new thread by implementing the Runnable interface.
public class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;

    RunnableDemo(String name){
        this.threadName = name;
        System.out.println("Creating thread " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running thread" + threadName);
        try {
            for (int i = 4;  i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted." + e);
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting thread " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}


