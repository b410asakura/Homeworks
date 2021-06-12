package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> arraySentences = new ArrayList<>();
        arraySentences.add("Ветер с моря дул");
        arraySentences.add("Нагонял беду");
        arraySentences.add("И сказал ты мне");
        arraySentences.add("Больше не приду");
        System.out.println("Первоначальный список: " +arraySentences);
        for (int i = 0; i < 4; i++) {
            arraySentences.add(arraySentences.get(i));
        }
        System.out.println("Продублированный список: " + arraySentences);
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < arraySentences.size(); i++) {
            if (arraySentences.get(i).length() >= 15){
                newList.add(arraySentences.get(i));
                arraySentences.remove(i);
                i--;
            }
        }
        System.out.println("Список с элементами меньше 15 знаков: " + arraySentences);
        System.out.println("Новый список: " + newList);
        newList.removeIf(str -> str.equals("И сказал ты мне"));
        System.out.println("Новый список без 'И сказал ты мне' :" + newList);
    }
}
