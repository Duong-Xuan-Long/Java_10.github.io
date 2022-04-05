package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("the first 10 prime numbers: ");
        for(int i=0;i<30;i++){
            if(isPrimeNumber(i)) System.out.print(i+", ");
        }
        System.out.println("\nthe prime numbers that are less than 10 :");
        for(int i=0;i<10;i++){
            if(isPrimeNumber(i)) System.out.print(i+", ");
        }
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
