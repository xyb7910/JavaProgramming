package com.simon.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Host {
    @Autowired
    @Qualifier(value = "cat1")
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;


    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }


    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Host{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
