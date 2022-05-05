package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Myinterface myinterface1=new Myinterface(){

        @Override
        public void myAbstractMethod() {
            System.out.println("hello");
        }
    };
    myinterface1.myAbstractMethod();
    Myinterface myinterface=()->{
        System.out.println("ok");
    };
    myinterface.myAbstractMethod();
    Interface2 interface2=(a,b)->{
        return a+b;
    };
        System.out.println(interface2.plus(2,3));
        int[] arr ={1,2,3,4,5};
        //ArrayList<Integer> list= new ArrayList<Integer>(Arrays.asList(arr));

    }
}
