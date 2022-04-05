package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập email : ");
        String email = scanner.nextLine();

//        long phoneNumber = scanner.nextLong();
        String regex = "^\\w+[a-z0-9]*@{1}\\w+mail.com$";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);
        if(matcher.find()){
            System.out.println("valid");

        }
        else{
            System.out.println("invalid");
        }
        System.out.println("nhập số điện thoại : ");
        String phonenumber = scanner.nextLine();
        scanner.close();
        String regex1 = "^0[98]{1}\\d{7,9}$";
        Pattern pattern1= Pattern.compile(regex1);
        Matcher matcher1=pattern1.matcher(phonenumber);
        if(matcher1.find()){
            if(phonenumber.length()==9||phonenumber.length()==11){
                System.out.println("valid");
            }
           else{
                System.out.println("invalid");
            }

        }
        else{
            System.out.println("invalid");
        }
    }
}