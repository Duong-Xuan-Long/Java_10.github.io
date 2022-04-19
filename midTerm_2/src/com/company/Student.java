package com.company;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private double point;
    private String classRoom;

    public Student(int id, String name, int age, String address, double point, String classRoom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.point = point;
        this.classRoom = classRoom;
    }

    public Student() {

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", point=" + point +
                ", classRoom='" + classRoom + '\'' +
                '}';
    }
}
