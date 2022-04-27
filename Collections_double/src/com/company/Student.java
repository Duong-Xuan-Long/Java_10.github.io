package com.company;

public class Student {
    int id;
    String name;
    String classRoom;
    double grades;

    public Student(int id, String name, String classRoom, double grades) {
        this.id = id;
        this.name = name;
        this.classRoom = classRoom;
        this.grades = grades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classRoom='" + classRoom + '\'' +
                ", grades=" + grades +
                '}';
    }
}
