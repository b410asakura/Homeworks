package com.company;

public class Main {

    public static void main(String[] args) {
        Kelin kelinForErhan = new Kelin();
        kelinForErhan.fullName = "Aidana Galifreeva";
        kelinForErhan.age = 19;
        kelinForErhan.appearance = 10;
        kelinForErhan.education = "software engeneer in Ala-too";
        kelinForErhan.fromKaisiJak = "Osh";
        kelinForErhan.height = 166;
        kelinForErhan.weight = 48;
        kelinForErhan.isFIFA = false;

        Kelin kelinForIslam = new Kelin();
        kelinForIslam.fullName = "Zhainagoul Sydykova";
        kelinForIslam.age = 19;
        kelinForIslam.appearance = 10;
        kelinForIslam.education = "software engeneer in Ala-too";
        kelinForIslam.fromKaisiJak = "Jalal-Abad";
        kelinForIslam.height = 165;
        kelinForIslam.weight = 47;
        kelinForIslam.isFIFA = false;

        Kelin kelinForAziz = new Kelin();
        kelinForAziz.fullName = "Nargiza Toktosunova";
        kelinForAziz.age = 20;
        kelinForAziz.appearance = 10;
        kelinForAziz.education = "International Relatioship in Ala-too";
        kelinForAziz.fromKaisiJak = "Osh";
        kelinForAziz.height = 164;
        kelinForAziz.weight = 44;
        kelinForAziz.isFIFA = false;

        System.out.println(kelinForErhan.fullName);
        System.out.println("age: " + kelinForErhan.age);
        System.out.println("appearance: " + kelinForErhan.appearance);
        System.out.println("education: " + kelinForErhan.education);
        System.out.println("root: " + kelinForErhan.fromKaisiJak);
        System.out.println("height: " + kelinForErhan.height);
        System.out.println("weight: " + kelinForErhan.weight);
        System.out.println("IsFifa: " + kelinForErhan.isFIFA);
        System.out.println();
        System.out.println(kelinForIslam.fullName);
        System.out.println("age: " + kelinForIslam.age);
        System.out.println("appearance: " + kelinForIslam.appearance);
        System.out.println("education: " + kelinForIslam.education);
        System.out.println("root: " + kelinForIslam.fromKaisiJak);
        System.out.println("height: " + kelinForIslam.height);
        System.out.println("weight: " + kelinForIslam.weight);
        System.out.println("IsFifa: " + kelinForIslam.isFIFA);
        System.out.println();
        System.out.println(kelinForAziz.fullName);
        System.out.println("age: " + kelinForAziz.age);
        System.out.println("appearance: " + kelinForAziz.appearance);
        System.out.println("education: " + kelinForAziz.education);
        System.out.println("root: " + kelinForAziz.fromKaisiJak);
        System.out.println("height: " + kelinForAziz.height);
        System.out.println("weight: " + kelinForAziz.weight);
        System.out.println("IsFifa: " + kelinForAziz.isFIFA);
    }
}
