package com.xyb7910.base.array;

/**
 * @author xyb7910
 * @date 2024/3/15
 * @description 数组作为参数
 */
public class Demo03 {
    public static void main(String[] args) {
        printArray(new int[]{1, 2, 3, 4, 5});
        System.out.println(reverse(new int[]{1, 2, 3, 4, 5})[0]);
    }

    // 数组作为入参数
    public static void printArray(int[] arr) {
        for (int d : arr) {
            System.out.println(d + " ");
        }
    }

    // 数组作为返回值
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            result[i] = list[j];
        }
        return result;
    }
}
