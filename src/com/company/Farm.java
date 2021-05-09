package com.company;

public class Farm {
    String adress;
    Cow[] cows;
    Sheep[] sheeps;
    Horse[] horses;
    String fullName;
    int numOfCows;
    int numOfSheeps;
    int numOfHorses;

    public Farm() {
    }

    public Farm(String adress, int numOfCows, int numOfSheeps, int numOfHorses, String fullName) {
        this.adress = adress;
        this.cows = new Cow[numOfCows];
        this.sheeps = new Sheep[numOfSheeps];
        this.horses = new Horse[numOfHorses];
        this.fullName = fullName;
        this.numOfCows = numOfCows;
        this.numOfSheeps = numOfSheeps;
        this.numOfHorses = numOfHorses;
    }

    public void printInfo(){
        System.out.println("Full Name - " + fullName);
        System.out.println("Adress - " + adress);
        System.out.println("cows = " + numOfCows);
        System.out.println("sheeps = " + numOfSheeps);
        System.out.println("horses = " + numOfHorses);

    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
