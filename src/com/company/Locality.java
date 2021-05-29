package com.company;

public abstract class Locality {
    private  String boss;
    private String name;

    public Locality(){}

    public Locality(String boss, String name) {
        this.boss = boss;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    @Override
    public String toString(){
        return "управляющий - " + boss + "      название насленного пункта - " + name;
    }
}
