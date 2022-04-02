package com.company;

public class Bmi {
    public void bmii() {
        double height = 1.5;
        double weight = 40;
        double bmi = weight / (height * height);
        System.out.println(bmi);
    }
    public double bmiii(double height, double weight){
        return weight / (height * height);
    }

public String result(double bmi){
        String rs="";
        if(bmi<08.5){
            rs="gay";
        }
        return rs;
}
    }




