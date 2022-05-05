package com.company;

import java.util.ArrayList;

public class Personmain {
    public static void main(String[] args) {
        ArrayList<Person> people=new ArrayList<>();
        people.add(new Person("Hoa",20,"HN"));
        people.add(new Person("Quang",25,"HN"));
        people.add(new Person("Anh",21,"HN"));
        people.add(new Person("Dung",17,"HN"));


        people.sort((p1,p2)->{
            return p1.getName().compareTo(p2.getName());
        });
        //people.forEach(System.out::println);
        people.stream().sorted((o1,o2)->{return o1.getAge()-o2.getAge();}).forEach(i-> System.out.println(i.toString()));


    }
}
