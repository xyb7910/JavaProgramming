package com.simon.oop.testenum;

enum Color {
    RED, GREEN, BLUE;
}
public class MyClass {
    public static void main(String[] args) {
//        Color color = Color.RED;
//        System.out.println(color);
        for (Color color : Color.values()) {
            System.out.println(color);
        }
    }
}
