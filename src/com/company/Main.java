package com.company;

public class Main {

    public static void main(String[] args) {
        Beeline bee = new Beeline("111222");
        O oshka = new O("232323");

        Phone phone = new Phone(bee, oshka);

        phone.call("777", "323232", 10);
    }
}
