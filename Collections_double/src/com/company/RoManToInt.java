package com.company;

import java.util.Arrays;

public class RoManToInt {
    public static void main(String[] args) {
        String s="MCMXCIV";
        int arr[]=stringToArray(s);
        System.out.println(Arrays.toString(arr));
        int rs=romanToInt(s);
        System.out.println(rs);
    }
    public static int romanToInt(String s){
        int arr[]=stringToArray(s);
        int sum=0;
        for(int i=arr.length-1;i>=0;i--){
            if(i-1>=0&& arr[i]>arr[i-1]){
                sum=sum+(arr[i]-arr[i-1]);
                i--;
            }else{
                sum=sum+arr[i];
            }
        }
        return sum;
    }
    public static int[] stringToArray(String s){
        int[] tmp=new int[s.length()];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch (ch){
                case'I':
                    tmp[i]=1; break;
                case'V':
                    tmp[i]=5; break;
                case'X':
                    tmp[i]=10; break;
                case'L':
                    tmp[i]=50; break;
                case'C':
                    tmp[i]=100; break;
                case'D':
                    tmp[i]=500; break;
                case'M':
                    tmp[i]=1000; break;
            }
        }
        return tmp;
    }
}
