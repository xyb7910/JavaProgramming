package com.xyb7910.base.array;

/**
 * @author xyb7910
 * @date 2024/3/15
 * @description 一维数组的定义与创建
 */
public class Demo01 {
    public static void main(String[] args) {
        // define a array
        int[] a;
        double[] b = {1.1, 2.2, 3.3, 4.4, 5.5};

        // new arr array
        int[] arr = new int[10];

        // build array and assign value
        int [] arr1 = {1, 2, 3, 4, 5};

        // array example
        int size = 10;
        int[] myList = new int[size];
        myList[0] = 1;
        myList[1] = 2;
        myList[2] = 3;
        myList[3] = 10;

        int sum = 0;
        for (int i = 0; i < myList.length; i++) {
            sum += myList[i];
        }
        System.out.println(sum);
    }
}
