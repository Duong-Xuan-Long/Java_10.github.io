package com.company;

public class Employee  {
    String name;
    int payMentPerHour;

    public Employee(String name, int payMentPerHour) {
        this.name = name;
        this.payMentPerHour = payMentPerHour;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayMentPerHour() {
        return payMentPerHour;
    }

    public void setPayMentPerHour(int payMentPerHour) {
        this.payMentPerHour = payMentPerHour;
    }
}
