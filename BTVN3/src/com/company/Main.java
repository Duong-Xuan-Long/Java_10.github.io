package com.company;

public class Main {

    public static void main(String[] args) {
	String k="Hello every one";
    int count=0;
    int i;
//        System.out.println(k.length());
    for( i=0;i<k.length();i++){
        if(k.charAt(i)=='e'){
            count=count+1;
            System.out.println("kí tự e ở vị trí: "+i);
        }
        }
        System.out.println("Số lần xuất hiện của ký tự e trong "+k+ " là "+count);
    }
}
