package com.company;

public class Dog extends DefaultParameters{
    boolean isHealthy;
    boolean isPitbul;

    public void getDogsProperties(){
        System.out.println("IsHealthy: " + isHealthy);
        System.out.println("IsPitbul: " + isPitbul);
    }

    public boolean getIsHealthy() {
        System.out.println(isHealthy);
        return isHealthy;
    }

    public void setHealthy (boolean healthy){
        this.isHealthy = healthy;
    }

    public boolean isPitbul() {
        System.out.println(isPitbul);
        return isPitbul;
    }

    public void setPitbul(boolean pitbul) {
        this.isPitbul = pitbul;
    }
}
