package com.company;

public class Display {
    int diagonal;
    int power;
    String matrixType;

    public Display() {
    }

    public Display(int diagonal, int power, String matrixType) {
        this.diagonal = diagonal;
        this.power = power;
        this.matrixType = matrixType;
    }

    public void printInfo(){
        System.out.println("Display: diagonal - " + diagonal + ",  power - " + power + ",  matrix - " + matrixType);
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

    public String getMatrixType() {
        return matrixType;
    }

}
