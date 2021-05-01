package com.company;

public class Main {

    public static void main(String[] args) {
        Parrot ara = new Parrot();
        ara.setAnimal("parrot");
        ara.setName("petya");
        ara.setAge(6);
        ara.setIsFly(true);
        ara.setIsMale(true);
        ara.setISTalk(true);
        ara.setIsSwim(false);

        ara.getAnimal();
        ara.getName();
        ara.getAge();
        ara.getIsFly();
        ara.getIsMale();
        ara.getIsTalk();
        ara.getIsSwim();

        Parrot araWife = new Parrot();
        araWife.setAnimal("parrot");
        araWife.setName("mairash");
        araWife.setAge(5);
        araWife.setIsFly(true);
        araWife.setIsMale(false);
        araWife.setISTalk(true);
        araWife.setIsSwim(false);

        araWife.getAnimal();
        araWife.getName();
        araWife.getAge();
        araWife.getIsFly();
        araWife.getIsSwim();
        araWife.getIsMale();
        araWife.getIsTalk();

        Dog belka = new Dog();
        belka.setAnimal("dog");
        belka.setName("belka");
        belka.setAge(8);
        belka.setIsFly(false);
        belka.setIsSwim(true);
        belka.setHealthy(true);
        belka.setPitbul(true);

        belka.getAllProperties();
        belka.getDogsProperties();

        Dog belkaWife = new Dog();
        belkaWife.setAnimal("dog");
        belkaWife.setName("Zhainagul");
        belkaWife.setAge(5);
        belkaWife.setIsFly(false);
        belkaWife.setIsSwim(true);
        belkaWife.setHealthy(true);
        belkaWife.setPitbul(true);

        belkaWife.getAllProperties();
        belkaWife.getDogsProperties();

        Cat mishik = new Cat();
        mishik.setAnimal("cat");
        mishik.setName("mishik");
        mishik.setAge(4);
        mishik.setIsFly(false);
        mishik.setIsSwim(false);

        mishik.getAllProperties();

        Cat mishikWIfe = new Cat();
        mishikWIfe.setAnimal("cat");
        mishikWIfe.setName("Samara");
        mishikWIfe.setAge(4);
        mishikWIfe.setIsFly(false);
        mishikWIfe.setIsSwim(false);

        mishikWIfe.getAllProperties();

        Fish balyk = new Fish();
        balyk.setAnimal("fish");
        balyk.setName("balyk");
        balyk.setAge(10);
        balyk.setIsFly(false);
        balyk.setIsSwim(true);

        balyk.getAllProperties();

        Fish balykWife = new Fish();
        balykWife.setAnimal("fish");
        balykWife.setName("Alina");
        balykWife.setAge(21);
        balykWife.setIsFly(false);
        balykWife.setIsSwim(true);

        balykWife.getAllProperties();
    }
}
