package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        boolean flag=true;
//
//        while(flag)
//        try{
//            System.out.println("nhap weight");
//            double w=Double.parseDouble(scanner.nextLine());
//            System.out.println("nhap height");
//            double h=Double.parseDouble(scanner.nextLine());
//           double  bmi=w/(h*h);
//            System.out.println("chi so bmi la "+ bmi);
//            flag=false;
//        }catch(NumberFormatException e){
//            System.out.println("nhap sai");
//            System.out.println("nhap lai");
//        }
//        boolean flag=true;
//        while(flag){
//            try{
//                System.out.println("nhap so phan tu: ");
//                int n=Integer.parseInt(scanner.nextLine());
//                int[] arr=new int[n];
//                flag=false;
//
//            }catch(NumberFormatException e){
//                System.out.println("nhap sai kieu du lieu");
//            }catch(NegativeArraySizeException e){
//                System.out.println("kich thuoc mang khong duoc am");
//            }
//        }


        BMI bmi = new BMI();
        System.out.println("Chỉ số bmi: ");
        float result = bmi.bmiCalculator();
        System.out.println("Chỉ số bmi của bạn là: " + result);


    }
}
