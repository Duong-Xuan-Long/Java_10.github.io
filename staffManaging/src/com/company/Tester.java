package com.company;

public class Tester extends Staff{
    int bug;

    public Tester(int id, String name, String dateOfBirth, String address, Gender gender, long mobilePhone, String email, long salary, int bug) {
        super(id, name, dateOfBirth, address, gender, mobilePhone, email, salary);
        this.bug = bug;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", mobilePhone=" + mobilePhone +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", bug=" + bug +
                '}';
    }

    @Override
    public long tinhluong() {
        long l= this.salary+(this.bug*50000);
        return l;
    }
}
