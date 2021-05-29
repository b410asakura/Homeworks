package com.company;

public class City extends Locality{
    private String[] districts;

    public City(){}

    public City(String boss, String name, String[] districts) {
        super(boss, name);
        this.districts = districts;
    }

    public String[] getDistricts() {
        return districts;
    }

    public void setDistricts(String[] districts) {
        this.districts = districts;
    }
}
