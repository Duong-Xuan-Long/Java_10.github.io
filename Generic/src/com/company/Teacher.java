package com.company;

public class Teacher extends Person{
    private long salary;

    public Teacher(String name, int age, String address, long salary) {
        super(name, age, address);
        this.salary = salary;
    }


    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +super.toString()+
                "salary=" + salary +
                '}';
    }
}
