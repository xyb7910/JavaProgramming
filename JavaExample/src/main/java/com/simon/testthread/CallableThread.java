package com.simon.testthread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThread implements Callable {

    public static void main(String[] args) {
        CallableThread callableThread = new CallableThread();
        FutureTask<Integer> futureTask = new FutureTask<>(callableThread);
        for (int i = 0; i < 100; i ++) {
            System.out.println(Thread.currentThread().getName() + "的循环变量i的值为" + i);
            if (i == 20) {
                new Thread(futureTask, "有返回值的线程").start();
            }
        }

        try {
            System.out.println("子进程的返回值" + futureTask.get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Integer call() throws Exception {
        int i = 0;
        for ( ; i < 100; i ++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return i;
    }
}
