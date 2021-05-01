package com.company;

public class DefaultParameters {
    String animal;
    private String name;
    private int age;
    private boolean isFly;
    private boolean isSwim;

    // warning!!! cheat code
    public void getAllProperties(){
        System.out.println("\nAnimal: " + animal);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("IsFly: " + isFly);
        System.out.println("IsSwim: " + isSwim);
    }

    public String getAnimal(){
        System.out.println("\nAnimal: " + animal);
        return animal;
    }

    public void setAnimal(String animal){
        this.animal = animal;
    }

    public String getName() {
        System.out.println("Name: " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println("Age: " + age);
        return age;
    }

    public void setAge(int age) {
        if (age < 0) System.err.println("error");
        else this.age = age;
    }

    public boolean getIsFly(){
        System.out.println("IsFly: " + isFly);
        return isFly;
    }

    public void setIsFly(boolean fly) {
        this.isFly = fly;
    }

    public boolean getIsSwim() {
        System.out.println("IsSwim: " + isSwim);
        return isSwim;
    }

    public void setIsSwim(boolean swim) {
        this.isSwim = swim;
    }
}
