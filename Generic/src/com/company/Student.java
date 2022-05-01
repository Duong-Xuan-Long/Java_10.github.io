package com.company;

public class Student extends Person{
    private double point;

    public Student(String name, int age, String address, double point) {
        super(name, age, address);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                "point=" + point +
                '}';
    }
}
