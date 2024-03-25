package com.simon.oop.testclass;

public class SubClass2 extends SuperClass{
    private int n;

    SubClass2() {
        super(300);
        System.out.println("SubClass2");
    }

    public SubClass2(int n) {
        System.out.println("SubClass2(int n):" + n);
        this.n = n;
    }
}
