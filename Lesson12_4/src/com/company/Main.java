package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] string= {"bame1","aame2","name3"};
     List<String> list=Arrays.asList(string);
        String[] string1= {"bame1","aame2333","name3"};
      ArrayList<String> string2=new ArrayList<>();
      string2.add("pk");
        Collections.addAll(list,string1);
        System.out.println(list);
    }
}
