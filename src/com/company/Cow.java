package com.company;

public class Cow extends DefaultParameters{

    public Cow (String name, int weight, int age, boolean sex){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.sex = sex;
    }

    public Cow() {
    }

    public void printInfo(){
        System.out.println("name - " + name + " | weight - " + weight + " | age - " + age + " | gender - " + sex);
    }
}
