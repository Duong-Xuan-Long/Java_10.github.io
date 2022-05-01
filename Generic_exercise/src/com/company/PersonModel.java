package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PersonModel<T> {
    Service s=new Service();
    private ArrayList<T> al=new ArrayList<>();
    public void add(T obj){
        al.add(obj);
    }
    public void display(){
        for(T object :al){
            System.out.println(object);
        }
    }
}
