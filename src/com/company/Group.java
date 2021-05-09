package com.company;

public class Group {
    Student[] arrayStudents;
    Course  courseName;
    String beginDate;
    int durationMonth;

    public Group(Student[] arrayStudents, Course courseName, String beginDate, int duration) {
        this.arrayStudents = arrayStudents;
        this.courseName = courseName;
        this.beginDate = beginDate;
        this.durationMonth = duration;
    }


    public Student[] getArrayStudents() {
        return arrayStudents;
    }

    public void setArrayStudents(Student[] arrayStudents) {
        this.arrayStudents = arrayStudents;
    }

    public Course  getCourseName() {
        return courseName;
    }

    public void setCourseName(Course courseName) {
        this.courseName = courseName;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public int getDurationMonth() {
        return durationMonth;
    }

    public void setDurationMonth(int duration) {
        this.durationMonth = duration;
    }
}
