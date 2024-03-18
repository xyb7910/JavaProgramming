package com.xyb7910.base.methods;

import java.util.Scanner;

/**
 * @author xyb7910
 * @date 2024/3/15
 * @description 方法调用
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(max(a, b));
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
