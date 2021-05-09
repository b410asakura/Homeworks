package com.company;

public class Baget extends Bread {
    int length;
    int countRubsov;

    @Override
    void bakeBread(){
        System.out.println("Baget was baked");
    }

    @Override
    void packBread(){
        System.out.println("only eco package");
    }

    void makeRubsi(){
        System.out.println("making rubsi");
    }
}

