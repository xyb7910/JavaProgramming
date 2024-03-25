package com.simon.datastruct.testlink;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list);

        list.addLast("6");
        list.addFirst("0");
        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        System.out.println(list.getLast());
        System.out.println(list.getFirst());

        System.out.println(list.size());
    }
}
