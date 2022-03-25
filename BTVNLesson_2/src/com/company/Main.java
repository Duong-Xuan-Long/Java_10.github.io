package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập chiều dài hình chữ nhật (cm):");
        double a=scanner.nextDouble();
        System.out.println("Nhập chiều rộng hình chữ nhật(cm):");
        double b=scanner.nextDouble();
        scanner.close();
        double p=2*(a+b);
        System.out.println("Chu vi hình chữ nhật là : " +p+" cm");
        double s=a*b;
        System.out.println("Diện tích hing chữ nhật là : "+s+" cm^2");

    }
}
