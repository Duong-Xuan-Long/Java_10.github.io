package com.company;

import java.util.Scanner;

public class Calculator {
    public void sum(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap a: ");
        int a=scanner.nextInt();
        System.out.println("nhap b: ");
        int b=scanner.nextInt();
        int c=a+b;
        System.out.println(c);

    }
    public void minus(int a,int b){
        System.out.println("tru: "+(a-b));
    }


}
