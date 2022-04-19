package com.company;

public class Student extends Person{
    private float point;

    public Student(String name, String address, float point) {
        super(name, address);
        this.point = point;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    @Override
    public void show() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "point=" + point +
                '}';
    }

    @Override
    public void method() {
        super.method();
    }
}
