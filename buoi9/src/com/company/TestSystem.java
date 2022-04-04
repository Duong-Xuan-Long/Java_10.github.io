package com.company;

import java.util.Arrays;

public class TestSystem{
public static void main(String[] args) {
    int[] arr=new int[5];
    arr[0]=8;
    arr[1]=1;
    arr[2]=8;
    arr[3]=9;
    arr[4]=2;
    for(int i : arr){
        System.out.println(i);
    }
    Arrays.sort(arr);
    System.out.println("mang sau khi sap xep");
    for(int i : arr){
        System.out.println(i);
    }
int[] copy=Arrays.copyOf(arr,10);
    System.out.println("mang sao chep");
    for(int i : copy){
        System.out.println(i);}
//    String s=Arrays.toString(copy);
    System.out.println(Arrays.toString(copy));

    }}

