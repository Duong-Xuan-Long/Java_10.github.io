package com.company;


import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//   for(int i=10;i>=0;i--) {
//       if(i % 2 == 0) {
//           System.out.println(i);
//       }
//   }
//        int i=0;
//
//        while(i<10){
//            System.out.println("xin chao");
//            i++;
//        }
//        Scanner scanner=new Scanner(System.in);
//        int age=0;
//        int count=0;
//        boolean iscontinue=true;
//        while(iscontinue){
//            System.out.println("Nhap tuoi: ");
//            age=scanner.nextInt();
//            count++;
//            if(age>0){
//                iscontinue=false;}
//        }
//
//            if(count>=3){
//                System.out.println("ban da nhap qua nhieu");
////                iscontinue=false;
//                System.exit(0);
//
//        }
//        System.out.println("tuoi cua ban la "+ age);
//        int i=0;
//        do{
//            System.out.println("xin chao");
//            i++;
//        }while(i<10);
//        for(int i=0;i<=100;i++){
//            if(i%3==0&&i%5!=0){
//                System.out.println(i+" is 3");
//
//            }
//            else if(i%5==0&&i%3!=0){
//                System.out.println(i+" is 5");
//
//            }
//            else if(i%3==0 && i%5==0){
//                System.out.println(i+" is 3 va 5");
//
//            }
//            else{
//                System.out.println(i);
//            }
//        }
//        for(int i=0;i<=100;i++){
//            if(i%3==0){
//               if(i%5==0){
//                   System.out.println("this is 3 and 5");
//               }
//               else{
//                   System.out.println("this is 3");
//               }
//            }
//            else{
//                if (i%5==0){
//                    System.out.println("this is 5");
//                }
//                else{
//                    System.out.println(i);
//                }
//            }
//        }
//        for(int i=0;i<=100;i++){
//            if(i%3==0&&i%5==0){
//                System.out.println("this is 3 and 5");
//            }
//            else if(i%5==0){
//                System.out.println("this is 5");
//            }
//            else if(i%3==0){
//                System.out.println("this is 3");
//            }
//            else {
//                System.out.println(i);
//            }
//        }
//        ax^2+bx+c
//        Scanner scanner =new Scanner(System.in);
//
//        double a = 0;
//        do{
//            System.out.println("nhap a phai khac 0:");
//            a=scanner.nextDouble();
//
//        }while(a==0);
//        System.out.println("nhap b :");
//        double b=scanner.nextDouble();
//        System.out.println("nhap c :");
//        double c=scanner.nextDouble();
//        scanner.close();
//        double d=b*b-4*a*c;
//        if(d>0){
//            double d2=Math.sqrt(d);
//            double x1=(-b+d2)/(2*a);
//            double x2=(-b-d2)/(2*a);
//            System.out.println("nghiem 1 la : "+x1+" ,nghiem 2 la : "+x2);
//        }
//        else if (d==0){
//            double x=-b/(2*a);
//            System.out.println("nghiem kep cua phuong trinh la :"+ x);
//        }
//        else{
//            System.out.println("phuong trinh vo nghiem");
//        }
//        Random random=new Random();
//        boolean isCheck=true;
//        while(isCheck){
//            int randomnumber=random.nextInt(100);
//            System.out.println(randomnumber);
//            if(randomnumber>90){
//                isCheck=false;
//            }
//        }
//        Scanner scanner =new Scanner(System.in);
//        Random random=new Random();
//
//        scanner.close();
//        boolean c=true;
//        int b=random.nextInt(100);
//        int a;
//      do{
//          System.out.println("nhap a : ");
//          int a=scanner.nextInt();
//          if(a>b){
//              System.out.println("ban nhap so lon hon roi");
//          }
//      }while(a>b);
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
       int b = random.nextInt(100);
        int a;
        do {
            System.out.println("nhap so a: ");
            a = scanner.nextInt();
            if(a>b){
                System.out.println(b);
                System.out.println("ban nhao so lon hon roi");

            }
            else{
                System.out.println(b);
                System.out.println("ban nhao so nho hon roi");
            }
        } while (a > b || b > a);
        System.out.println("ban nhap dung roi");

    }
}
