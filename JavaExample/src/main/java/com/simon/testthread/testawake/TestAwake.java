package com.simon.testthread.testawake;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class TestAwake {

    public static void main(String[] args) throws InterruptedException {
//        Object lock = new Object();
//        // 创建线程并执行
//        new Thread(() -> {
//            System.out.println("线程1：开始执行");
//            synchronized (lock) {
//                try {
//                    System.out.println("线程1：进入等待");
//                    lock.wait();
//                    System.out.println("线程1：继续执行");
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println("线程1：执行完成");
//            }
//        }).start();
//
//        Thread.sleep(1000);
//        synchronized (lock) {
//            // 唤醒线程
//            System.out.println("执行 notifyAll()");
//            lock.notifyAll();
//        }

            Thread t1 = new Thread(() -> {
                LockSupport.park();
                System.out.println("线程1");
            }, "线程1");
            t1.start();
            Thread t2 = new Thread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("唤醒线程1");
                LockSupport.unpark(t1);
            }, "线程2");
            t2.start();



    }
}
