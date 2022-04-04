package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    int n=0;
        System.out.println("Nhập số phần tử của mảng : ");
        if(scanner.hasNextInt()) n=scanner.nextInt();
        int[] mang= new int[n];
        for(int i=0;i<mang.length;i++){
            System.out.printf("nhập phần tử mảng thứ %d : ",(i+1));
            if(scanner.hasNextInt())mang[i]=scanner.nextInt();
            if(mang[i]%2==0){
                mang[i]=mang[i]+1;
            }

        }
//        Arrays.toString(mang);
//        for(int i=0;i<mang.length;i++){
//            System.out.println(mang[i]);
//        }

        System.out.println(Arrays.toString(mang));

    }
}
