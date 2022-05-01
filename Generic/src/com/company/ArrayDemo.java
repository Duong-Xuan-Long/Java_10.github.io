package com.company;

public class ArrayDemo {

    public static void main(String[] args) {
        String[] sArr={"a","b","c","d"};
        Integer[] iArr={1,2,3,4};
        show(iArr);
    }
    public static <T>void show(T[] arr){
        for(T m:arr){
            System.out.println(m);
        }
    }
}
