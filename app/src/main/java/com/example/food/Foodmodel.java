package com.example.food;

public class Foodmodel {

    private String name;

    private Integer num;

    public String getName() {
        return name;
    }

    public Integer getNum() {
        return num;
    }

    public Foodmodel(String name, Integer num) {
        this.name = name;
        this.num = num;
    }
}
