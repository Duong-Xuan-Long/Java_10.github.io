package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Random random=new Random();
    int n=random.nextInt();
        System.out.println(n);
        System.out.println("n is a primenumber: "+isPrimeNumber(n));
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
