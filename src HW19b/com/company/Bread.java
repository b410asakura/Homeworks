package com.company;

public class Bread {
    int weightGramm;
    int priceSom;
    String brandName;

    public void setBrandName(String brandName){
        this.brandName = brandName;
        System.out.println("ozunche ele name - " + brandName);
    }

    public Bread() {
    }

    public Bread(int weightGramm, int priceSom) {
        this.weightGramm = weightGramm;
        this.priceSom = priceSom;
    }

    void bakeBread() {
        System.out.println("Bread was baked");
    }

    void packBread() {
        System.out.println("Bread was packed");
    }

    void show(){
        System.out.println("enter the price and weight");
    }

    public int getWeightGramm() {
        return weightGramm;
    }

    public void setWeightGramm(int weightGramm) {
        if (weightGramm <= 0) System.out.println("Fake");
        else {
            this.weightGramm = weightGramm;
            System.out.println("weight - " + weightGramm);
        }
    }

    public int getPriceSom() {
        return priceSom;
    }

    public void setPriceSom(int priceSom) {
        this.priceSom = priceSom;
        System.out.println("price - " + priceSom);
    }
}
