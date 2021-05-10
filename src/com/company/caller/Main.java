package com.company.caller;

import com.company.studyClasses.Course;
import com.company.studyClasses.Group;
import com.company.studyClasses.Student;

import java.util.Locale;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Student[] students1 = new Student[12];
        String[] arrayWords = {"ай", "нур", "бек", "лан", "болот", "хан", "жека", "лин", "дин"};
        String[] randomNames = new String[12];
        String[] randomSurnames = new String[12];
        String[] randomBithdays = new String[12];
        boolean[] randomSex = new boolean[12];
        int[] age = new int[12];

        // генераторы случайных имен, фамилий, ДР, пола
        for (int i = 0; i < students1.length; i++) {
            randomNames[i] = arrayWords[random.nextInt(9)] + arrayWords[random.nextInt(9)];
            randomNames[i] = randomNames[i].substring(0, 1).toUpperCase(Locale.ROOT) + randomNames[i].substring(1);
        }
        for (int i = 0; i < students1.length; i++) {
            randomSurnames[i] = arrayWords[random.nextInt(9)] + arrayWords[random.nextInt(9)];
            randomSurnames[i] = randomSurnames[i].substring(0, 1).toUpperCase(Locale.ROOT) + randomSurnames[i].substring(1);
        }

        for (int i = 0; i < students1.length; i++) {
            String birthYear =  "" + (random.nextInt(2005 - 1995) + 1995);
            randomBithdays[i] = random.nextInt(31) + "." + random.nextInt(13) + "." + birthYear;
            age[i] = 2021 - Integer.parseInt(birthYear);
        }
        for (int i = 0; i < students1.length; i++) {
            int sexNum = random.nextInt(2);
            if (sexNum == 1){
                randomSex[i] = true;
            }
            else randomSex[i] = false;
        }


        Course course1 = new Course("eng", "01.01.2010", 01012010, "Askat Tabaldiev");
        Group group1 = new Group(students1, course1, "1 of May", 12);
//        course1.printInfo();
        for (int i = 0; i < students1.length; i++) {
            students1[i] = new Student(randomBithdays[i], randomSurnames[i],
                    randomNames[i], randomSex[i], age[i]);
//            System.out.print(i + 1 + ") "); students1[i].printInfo();
        }
        System.out.println(students1[0]);
//        System.out.println(course1);
        System.out.println(group1);
    }
}
