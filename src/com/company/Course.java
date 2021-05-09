package com.company;

public class Course {
    String name;
    String createDate;
    int ID;
    String teacherFullName;

    public Course(String name, String createDate, int ID, String teacherFullName) {
        this.name = name;
        this.createDate = createDate;
        this.ID = ID;
        this.teacherFullName = teacherFullName;
    }

    public void printInfo(){
        System.out.println("Course name - " + name + " | Create date - "
                + createDate + " | ID - " + ID + " | Teacher name - " + teacherFullName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTeacherFullName() {
        return teacherFullName;
    }

    public void setTeacherFullName(String teacherFullName) {
        this.teacherFullName = teacherFullName;
    }
}
