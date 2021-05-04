package com.company;

public class Keyboard {
    boolean backlighting;
    boolean additinalNumbers;

    public Keyboard() {
    }

    public Keyboard(boolean backlighting, boolean additinalNumbers) {
        this.backlighting = backlighting;
        this.additinalNumbers = additinalNumbers;
    }

    public void printInfo(){
        System.out.println("Keyboard: backlighting - " + backlighting + ",  additionalNumbers - " + additinalNumbers);
    }

    public void setBacklighting(boolean backlighting) {
        this.backlighting = backlighting;
    }

    public boolean getBacklighting() {
        return backlighting;
    }

    public void setAdditinalNumbers(boolean additinalNumbers) {
        this.additinalNumbers = additinalNumbers;
    }

    public boolean getAdditinalNumbers() {
        return additinalNumbers;
    }
}
