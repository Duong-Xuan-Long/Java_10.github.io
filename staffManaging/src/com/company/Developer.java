package com.company;

public class Developer extends Staff {
    int overTime;

    public Developer(int id, String name, String dateOfBirth, String address, Gender gender, long mobilePhone, String email, long salary, int overTime) {
        super(id, name, dateOfBirth, address, gender, mobilePhone, email, salary);
        this.overTime = overTime;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "overTime=" + overTime +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", mobilePhone=" + mobilePhone +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public long tinhluong() {
        long l= this.salary+(this.overTime*200000);
        return 0;
    }

}
