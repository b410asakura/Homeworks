package com.company;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Alina";
        student1.surname = "Aitibaldieva";
        student1.age = 22;
        student1.course = 4;
        student1.isGrant = true;

        Student student2 = new Student();
        student2.name = "Azat";
        student2.surname = "Aitibaldiev";
        student2.age = 17;
        student2.course = -2;
        student2.isGrant = false;

        Student student3 = new Student();
        student3.name = "Perizat";
        student3.surname = "Saburova";
        student3.age = 12;
        student3.course = -8;
        student3.isGrant = false;

        System.out.println(student1.name + " "  + student1.surname);
        System.out.println(student1.age + " года " + student1.course + " курс");
        System.out.println("Бюджет = " + student1.isGrant);
        System.out.println();
        System.out.println(student2.name + " "  + student2.surname);
        System.out.println(student2.age + " лет " + student2.course + " курс");
        System.out.println("Бюджет = " + student2.isGrant);
        System.out.println();
        System.out.println(student3.name + " "  + student3.surname);
        System.out.println(student3.age + " лет " + student3.course + " курс");
        System.out.println("Бюджет = " + student3.isGrant);
    }
}
