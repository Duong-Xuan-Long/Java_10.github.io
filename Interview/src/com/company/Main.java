package com.company;

public class Main {

    public static void main(String[] args) {
	int[] arr=new int[4];
        arr[0]=1235;
        arr[1]=7;
        arr[2]=86;
        arr[3]=937;
        int count=0;
        int count1=0;
        for(int i:arr){
            while(i!=0){
                i/=10;
                count++;
            }
            if(count%2==0){
                count1++;
            }
        }
        System.out.println(count1);
    }
}
