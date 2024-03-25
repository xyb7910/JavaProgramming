package com.simon.oop.testclass;

public class SubClass extends SuperClass{
    private int n;
    SubClass(){
        System.out.println("SubClass");
    }

    public SubClass(int n) {
        super(300);
        System.out.println("SubClass(int n)" + n);
        this.n = n;
    }
}
