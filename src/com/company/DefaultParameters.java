package com.company;

public class DefaultParameters {
    String name;
    int weight;
    int age;
    boolean sex; // true = male && false = female

    public DefaultParameters(){}

    public DefaultParameters(String name, int weight, int age, boolean sex){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.sex =sex;
    }

    public void printInfo(){
        System.out.println("name - " + name + " | weight - " + weight + " | age - " + age + " | gender - " + sex);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setSex(boolean sex){
        this.sex = sex;
    }

    public boolean getSex(){
        return sex;
    }
}
