package com.company;

public class Student {
    String birthDate;
    String surname;
    String name;
    Boolean sex;
    int age;

    public Student(String birthDate, String surname, String name, Boolean sex, int age) {
        this.birthDate = birthDate;
        this.surname = surname;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString(){
        String message = "I'm a student " + this.surname + " " + this.name + ". I'm " + this.age;
        return message;
    }

    public void printInfo(){
        System.out.println("Fullname - " + surname + " "+ name + " | birthday - " + birthDate + " | sex - " + sex);
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
