package com.simon.testthread.testsync;

public class SynchronizedDemoTest {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedDemo demo = new SynchronizedDemo();

        Runnable r = () -> {
          for (int i = 0; i < 100; i ++) {
              demo.increment();
          }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count : " + demo.getCount());
    }
}
