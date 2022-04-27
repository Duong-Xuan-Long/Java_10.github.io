package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainPerson {
    public static void main(String[] args) {
            ArrayList<Person> list=new ArrayList<>();
            list.add(new Person("linh",25,"HN"));
            list.add(new Person("Quaa",24,"HN"));
            list.add(new Person("Hoa",20,"HN"));
            list.add(new Person("An",27,"HN"));
            list.add(new Person("Thuy",19,"HN"));
//            for(Person p:list){
//                System.out.println(p);
//            }
       // Collections.sort(list);
        System.out.println("<========================================>");
        for(Person p:list){
            System.out.println(p);
        }
        System.out.println("<========================================>");
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Person p:list){
            System.out.println(p);
        }
        System.out.println("<========================================>");
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        for(Person p:list){
            System.out.println(p);
        }


    }
}
