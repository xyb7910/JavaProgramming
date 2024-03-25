package com.simon.testthread.testmethods;

import sun.rmi.server.Dispatcher;

public class ThreadClassDemo {
    public static void main(String[] args) {
        DisplayMessage hello = new DisplayMessage("Hello");
        Thread helloThread = new Thread(hello);
        helloThread.setDaemon(true);
        helloThread.setName("HelloThread");
        System.out.println("Start HelloThread");
        helloThread.start();

        DisplayMessage bye = new DisplayMessage("Bye");
        Thread byeThread = new Thread(bye);
        byeThread.setPriority(Thread.MIN_PRIORITY);
        byeThread.setDaemon(true);
        byeThread.setName("HelloThread");
        System.out.println("Start byeThread");
        byeThread.start();


        Thread guess = new GuessANumber(27);
        guess.start();
        try {
            guess.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        Thread guess2 = new GuessANumber(75);
        guess2.start();
        System.out.println("main() 线程结束");
    }
}
