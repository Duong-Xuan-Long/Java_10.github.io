package com.company;

import service.ProductService;
import util.Util;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for(int i=8;i>=1;i--) {
            for(int j=8;j>=i;j--){
                System.out.print(" ");
            }
            System.out.print(i);
            for(int j=1;j<=2*i-2;j++){
                System.out.print(" ");
            }
            System.out.println(i);
        }

    }
}
//Cho mootj mangr soos nguyeen 1 ddeen