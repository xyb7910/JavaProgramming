package com.simon.oop.testover.load;

public class OverLoading {
    public int test() {
        System.out.println("test1");
        return 1;
    }

    public void test(int a) {
        System.out.println("test2");
    }

    public String test(String a) {
        System.out.println("test3");
        return a;
    }

    public int test(int a, String str) {
        System.out.println(str);
        return a;
    }

    public static void main(String[] args) {
        OverLoading o = new  OverLoading();
        o.test();
        o.test(1);
        o.test(23, "hello, yxc");
    }
}
