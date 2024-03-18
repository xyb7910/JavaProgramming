package com.xyb7910.base.array;


/**
 * @author xyb7910
 * @date 2024/3/15
 * @description 处理数组
 */
public class Demo02 {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // 打印数组
        for (int i = 0; i < myList.length; i ++) {
            System.out.println(myList[i] + " ");
        }

        // 计算数组的总和
        double sum = 0.0;
        for (double num : myList) {
            sum += num;
        }
        System.out.println(sum);

        // 查找数组中的最大值
        double max_v = myList[0];
        for (double num : myList) {
            if (num > max_v) {
                max_v = num;
            }
        }
        System.out.println(max_v);
    }
}
