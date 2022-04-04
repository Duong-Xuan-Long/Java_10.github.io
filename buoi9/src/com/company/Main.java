package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
int[] array=creatArray();
show(array);
        System.out.println(findMax(array));

    }
    public static int[] creatArray(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap so phan tu mang: ");
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("nhap phan tu thu %d:",(i+1));
            arr[i]=scanner.nextInt();
        }
        return arr;
    }
    public static void show(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\t");
        }
        System.out.println();
            }
            public static int findMax(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
                return max;
            }
    }

