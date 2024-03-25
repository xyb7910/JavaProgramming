package com.simon.datastruct.testhashmap;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","1");
        map.put("3","1");
        map.put("4","1");
        System.out.println(map);

        System.out.println(map.get("1"));

        map.remove("1");
        System.out.println(map);
    }
}
