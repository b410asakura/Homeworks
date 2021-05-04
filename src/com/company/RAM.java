package com.company;

public class RAM {
    int memory;
    int power;

    public RAM() {
    }

    public RAM(int memory, int power) {
        this.memory = memory;
        this.power = power;
    }

    public void printInfo(){
        System.out.println("RAM: memory - " + memory + ",  power - " + power);
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
