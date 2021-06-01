package com.company;

public class Monkey implements Climbable, CarryOtherAnimal, Eatable{
    @Override
    public void climb(){
        System.out.println("Monkey climbs");
    }

    @Override
    public void carry(){
        System.out.println("Monkey carrys other animal");
    }

    @Override
    public void eat() {
        System.out.println("Monkey eats fruits");
    }
}
