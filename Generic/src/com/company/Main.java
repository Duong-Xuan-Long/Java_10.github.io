package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> integers= new ArrayList<>();
        integers.add(1);
        integers.add(2);

        ClassGeneric<String> k=new ClassGeneric<>("hello");
        k.setObj("ok");
        System.out.println(k.getObj());

    }

}
