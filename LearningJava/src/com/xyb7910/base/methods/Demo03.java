package com.xyb7910.base.methods;

/**
 * @author xyb7910
 * @date 2024/3/15
 * @description 方法重载
 */
public class Demo03 {
    public static void main(String[] args) {
        int ans1 = add(1, 2);
        double ans2 = add(13.1, 23.3);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
