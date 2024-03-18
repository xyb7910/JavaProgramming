package com.xyb7910.base.methods;


/**
 * @author xyb7910
 * @date 2024/3/15
 * @description 可变参数
 */
public class Demo05 {
    public static void main(String[] args) {
        printfMax(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    public static void printfMax(int... args) {
        if (args.length == 0) {
            System.out.println("args is empty");
            return ;
        }
        int max = args[0];

        for (int i = 1; i < args.length; i++) {
            if (args[i] > max) {
                max = args[i];
            }
        }
        System.out.println(max);
    }
}
