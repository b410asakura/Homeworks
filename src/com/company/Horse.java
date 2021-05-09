package com.company;

public class Horse extends DefaultParameters{
    String color;

    public Horse(){}

    public Horse(String name, int weight, int age, boolean sex, String color) {
        super(name, weight, age, sex);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
