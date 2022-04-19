package com.company;

public class PartTime extends Employee implements IEmployee{
    int workingHours;

    public PartTime(String name, int payMentPerHour, int workingHours) {
        super(name, payMentPerHour);
        this.workingHours = workingHours;
    }


    @Override
    public int calculatorSalary() {

        return this.workingHours*super.getPayMentPerHour();
    }
}
