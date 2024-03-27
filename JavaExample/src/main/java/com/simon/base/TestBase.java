package com.simon.base;

public class TestBase {
    private static int a;
    private int b;

    static {
        TestBase.a = 5;
        System.out.println(a);

        TestBase t = new TestBase();

        t.f();
        t.b = 10;
        System.out.println(t.b);
    }

    static {
        TestBase.a = 10;
        System.out.println(a);
    }

    static {
        TestBase.a = 15;
        System.out.println(a);
    }

    public void f() {
        System.out.println("hahaha");
    }
}
