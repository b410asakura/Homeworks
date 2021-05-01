package com.company;

public class Parrot extends DefaultParameters{
    boolean isTalk;
    boolean isMale;

    public boolean getIsTalk() {
        System.out.println("IsTalk: " + isTalk);
        return isTalk;
    }

    public void setISTalk(boolean talk) {
        this.isTalk = talk;
    }

    public boolean getIsMale() {
        System.out.println("IsMale: " + isMale);
        return isMale;
    }

    public void setIsMale(boolean male) {
        this.isMale = male;
    }
}
