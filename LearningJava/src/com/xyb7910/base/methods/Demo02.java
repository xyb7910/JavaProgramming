package com.xyb7910.base.methods;

/**
 * @author xyb7910
 * @date 2024/3/15
 * @description 值传递参数
 */
public class Demo02 {
    public static void main(String[] args) {
        nPrintMessage("Hello World", 5);
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
    }


    // print message n times
    public static void nPrintMessage(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }

    // swap two int value
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}
