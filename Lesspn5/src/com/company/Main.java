package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	Calculator calculator=new Calculator();
////    //goi phuong thuc
////    calculator.sum();
//    calculator.minus(6,4);
//        Bmi bmi=new Bmi();
//        System.out.println(bmi.bmiii(3,4));
Scanner scanner= new Scanner(System.in);

        System.out.println("nhap ban kinh");
        double r=scanner.nextDouble();
        scanner.close();
        Circle circle=new Circle();
        System.out.println(circle.cv(r));
    }
}
