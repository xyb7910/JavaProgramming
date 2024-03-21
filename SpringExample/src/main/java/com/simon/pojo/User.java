package com.simon.pojo;

public class User {
    private String name;

    public User() {
        System.out.println("user no args constructor");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name" + name);
    }
}
