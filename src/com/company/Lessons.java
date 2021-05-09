package com.company;

import java.util.SplittableRandom;

public class Lessons {
    String lessonDate;
    Student[] attendedStudents;
    Course courseName;
    String startTime;
    boolean homework;
    boolean exam;

    public Lessons(){}

    public Lessons(String lessonDate, Student[] attendedStudents,
                   Course courseName, String startTime, boolean homework, boolean exam) {
        this.lessonDate = lessonDate;
        this.attendedStudents = attendedStudents;
        this.courseName = courseName;
        this.startTime = startTime;
        this.homework = homework;
        this.exam = exam;
    }

    @Override
    public String toString(){
        return "klfd'";
    }

    public String getLessonDate() {
        return lessonDate;
    }

    public void setLessonDate(String lessonDate) {
        this.lessonDate = lessonDate;
    }

    public Student[] getAttendedStudents() {
        return attendedStudents;
    }

    public void setAttendedStudents(Student[] attendedStudents) {
        this.attendedStudents = attendedStudents;
    }

    public Course getCourseName() {
        return courseName;
    }

    public void setCourseName(Course courseName) {
        this.courseName = courseName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public boolean isHomework() {
        return homework;
    }

    public void setHomework(boolean homework) {
        this.homework = homework;
    }

    public boolean isExam() {
        return exam;
    }

    public void setExam(boolean exam) {
        this.exam = exam;
    }
}
