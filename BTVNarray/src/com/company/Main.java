package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập họ tên của bạn : ");
        String name=scanner.nextLine();
        scanner.close();
        name=name.trim().toLowerCase();
        name=name.replace("\\s"," ");
        String[] namePart=name.split(" ");
        String st="";
        for(int i=0;i<namePart.length;i++){
        st+=String.valueOf(namePart[i].charAt(0)).toUpperCase()+namePart[i].substring(1).toLowerCase();
        if(i<namePart.length-1){
            st+=" ";
        }
        }
        System.out.println("Tên sau chuẩn hóa là : "+st);
    }
}
