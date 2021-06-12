package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= 50; i++) {
            array.add(random.nextInt(99) + 1);
        }
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (Integer integer : array) {
            if (integer % 2 == 0) {
                even.add(integer);
            } else odd.add(integer);
        }
        System.out.println("Full number array: " + array);
        System.out.println("Even number array: " + even);
        System.out.println("Odd number array: " + odd);
    }
}
