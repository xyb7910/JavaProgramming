package com.simon.datastruct.testarrays;

import java.util.ArrayList;
import java.util.Collections;


public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 添加元素
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
        // 获取元素
        System.out.println(list.get(1));
        // 修改元素
        list.set(1, "4");
        System.out.println(list);
        // 删除元素
        list.remove(1);
        System.out.println(list);
        // 计算大小
        System.out.println(list.size());

        list.add("9");
        list.add("6");
        list.add("3");
        list.add("7");
        list.add("8");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
