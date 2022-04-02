package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
        System.out.println("enter string : ");
    String original=scanner.nextLine();
    scanner.close();
    String after="";
    for(int i=original.length()-1;i>=0;i--){
        after=after+original.charAt(i);
        }
    if(original.equals(after)){
        System.out.println(original+" is a Palindmore string");
    }
        else{
            System.out.println(original+" is not a Palindmore string");
        }
    }
}
