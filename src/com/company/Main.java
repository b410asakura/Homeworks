package com.company;

public class Main {

    public static void main(String[] args) {

        Farm[] farms = new Farm[2];

        farms[0] = new Farm("Bishkek", 5,
                3, 2, "Sadyr ava");
        Cow[] cows = new Cow[5];
        cows[0] = new Cow("alenka1", 320,6, false);
        cows[1] = new Cow("alenka2", 420,7, false);
        cows[2] = new Cow("alenka3", 520,8, false);
        cows[3] = new Cow("alenka4", 400,9, false);
        cows[4] = new Cow("alenka5", 300,11, false);

        Sheep[] sheeps = new Sheep[3];
        sheeps[0] = new Sheep("barashek1", 80, 8, true);
        sheeps[1] = new Sheep("barashek2", 90, 9, true);
        sheeps[2] = new Sheep("barashek3", 100, 10, true);

        Horse[] horses = new Horse[2];
        horses[0] = new Horse("burushka1", 500, 12, false, "black");
        horses[1] = new Horse("burushka1", 500, 12, false, "brown");


        farms[1] = new Farm("Osh", 2,
                32, 12, "Ravshan aka");
        Cow cow = new Cow("tarzan", 600, 14, true);
        Sheep sheep = new Sheep("kochkor", 150, 15, true);
        Horse horse = new Horse("mulan", 600, 13, true, "white");

        farms[0].printInfo();
        cows[0].printInfo();
        cows[1].printInfo();
        cows[2].printInfo();
        cows[3].printInfo();
        cows[4].printInfo();
        sheeps[0].printInfo();
        sheeps[1].printInfo();
        sheeps[2].printInfo();
        horses[0].printInfo();
        horses[1].printInfo();
        System.out.println();
        farms[1].printInfo();
        cow.printInfo();
        sheep.printInfo();
        horse.printInfo();
    }
}
