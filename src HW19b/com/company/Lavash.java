package com.company;

public class Lavash extends Bread{
    @Override
    void packBread(){
        System.out.println("zevernut'");
    }
    @Override
    void bakeBread(){
        System.out.println("I'm lavash, I was baked");
    }

}
