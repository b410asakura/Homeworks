package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String [] rayons = {"1", "2", "3"};
        Locality city1 = new City("Rashid", "Bishkek", rayons);
        Locality city2 = new City("Bolot", "Osh", rayons);
        Locality city3 = new City("Turan", "KaraSuu", rayons);

        Locality village1 = new Village("Shabdan", "Kemin");
        Locality village2 = new Village("Atai", "Uch emchek");

        Locality[] localities = {city1, city2, city3, village1, village2};

        for (Locality item : localities){
            System.out.println(item);
        }

        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.next();
        boolean isFlag = false;
        for (Locality locality : localities) {
            if (locality.getBoss().equals(searchName)) {
                System.out.println(locality.getName());
                isFlag = true;
                break;
            }
        }
        if (!isFlag) System.out.println("There is no " + searchName + " boss");


//        String[] oblasti = {"Чуй", "Osh", "Batken", "Talas", "IK", "Naryn", "Jalal-Abad"} ;
//        System.out.println("Каяктан болосун??");
//        String biaktan = scanner.next();
//        if (biaktan.equals("Чуй")){

        }
    }

