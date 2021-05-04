package com.company;

public class HHD {
    int memory;
    int diskCount;

    public HHD() {
    }

    public HHD(int memory, int diskCount) {
        this.memory = memory;
        this.diskCount = diskCount;
    }

    public void printInfo(){
        System.out.println("HDD: memory - " + memory + ",  diskCount - " + diskCount);
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void setDiskCount(int diskCount) {
        this.diskCount = diskCount;
    }

    public int getDiskCount() {
        return diskCount;
    }

}
