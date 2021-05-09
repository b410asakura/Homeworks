package com.company;

public class Lepeshka extends Bread {
    void drawPrints() {
        System.out.println("Prints were drawn");
    }

    @Override
    void bakeBread(){
        System.out.println("Lepeshka was baked");
    }

    @Override
    void packBread(){
        System.out.println("Lepeshka was packed");
    }

    void varnish() {
        System.out.println("Lepeshka was varnished");
    }


}
