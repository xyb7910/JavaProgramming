package com.simon.testthread.testmethods;

public class GuessANumber extends  Thread{
    private int number;

    public GuessANumber(int number){
        this.number = number;
    }

    @Override
    public void run() {
        int counter = 0;
        int guess = 0;
        do {
            guess = (int) (Math.random() * 100 + 1);
            System.out.println(this.getName() + " guesses " + guess);
            counter ++;
        } while (guess != number);
        System.out.println("**Correct!" + this.getName() + " guesses " + counter + " times.");
    }
}
