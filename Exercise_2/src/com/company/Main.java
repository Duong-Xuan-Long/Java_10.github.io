package com.company;

import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
	String str="You only live once, but if you do it right, once is enough";
    String[] array=str.split(" ");
        System.out.println("the number of words is "+ array.length);
//     C2   StringTokenizer stringTokenizer = new StringTokenizer(str);
//        System.out.println(stringTokenizer.countTokens());
//        System.out.println(wordCount(str));

            int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='o'){
                System.out.println("index of 'o' :"+i);
                count=count+1;}
        }
        System.out.println("the string has "+ count+" 'o' characters");
    }
//  public static int wordCount(String str) {
//
//      int c=0;
//      str=str.trim();
//      for(int i = 0; i<str.length()-1; i++){
//
//        if((str.charAt(i)!=' ')&&(str.charAt(i+1)==' ')) c++;
//    }
//
//      return c+1;
//  }
}
