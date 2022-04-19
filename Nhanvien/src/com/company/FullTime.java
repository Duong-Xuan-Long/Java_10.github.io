package com.company;

public class FullTime extends Employee implements IEmployee{

    public FullTime(String name, int payMentPerHour) {
        super(name, payMentPerHour);
    }


    @Override
    public int calculatorSalary() {

        return 8*super.getPayMentPerHour();
    }
}
