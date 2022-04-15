package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
//        ArrayList<String> strList=new ArrayList<>();

//        ArrayList<Double> dList=new ArrayList<>();
//        ArrayList<Character> chList=new ArrayList<>();
//        strList.add("Java");
//        strList.add("HTML");
//        strList.add("python");
//        strList.add("Ruby");
//        for(String s: strList){
//            System.out.println(s);
//        }
//        Collections.sort(strList);
//        System.out.println("the list after sorting ");
//        for(String s: strList){
//            System.out.println(s);
//        }
//        System.out.println(strList.get(1));
//        for(int i=0;i<strList.size();i++){
//            if(strList.get(i).contains("y")){
//                System.out.println(strList.get(i));
//            }
//        }
//        System.out.println(strList.contains("Ruby"));
//        ArrayList<String> strList2= new ArrayList<>();
//        strList2.add("C/C++");
//        strList2.add("PHP");
//        strList2.addAll(strList);
//        System.out.println(strList2);
//        strList.set(1,"MySQL");
//        System.out.println("the list after updating ");
//        for(String s: strList){
//            System.out.println(s);
//        }
//        strList.remove("Java");
//        System.out.println("the list after removing ");
//        for(String s: strList){
//            System.out.println(s);
//        }
//        strList.remove(1);
//        System.out.println("the list after removing ");
//        for(String s: strList){
//            System.out.println(s);
//        }
//        strList.clear();
//        System.out.println("the list after clearing ");
//        for(String s: strList){
//            System.out.println(s);
//        }
//        System.out.println("the number of components is "+ strList.size());
//        ArrayList<Integer> intList=new ArrayList<>();
//        int count=0;
//        for(int i=0;i<=10;i++){
//            intList.add(i);
//
//        if(intList.get(i)%2==0){
//            System.out.print(intList.get(i)+" ");
//            count++;
//        }
//        }
//        System.out.println();
//        System.out.println("the number of even numbers is "+ count);
//        Person p=new Person("ngoc",26,"ha GIang");
        ArrayList<Person> personList=new ArrayList<>();
//        personList.add(p);
//        personList.add(new Person("huy",28,"ha noi"));
//        personList.add(new Person("quang",20,"ha noi"));
//        personList.add(new Person("thinh",24,"ha noi"));
//        personList.add(new Person("linh",27,"ha noi"));

        for(Person person:personList){
            System.out.println(person.getName()+" - "+person.getAge()+" - "+ person.getAddress());
        }
        Person findPerson=null;
        for(Person person: personList){
            if(person.getName().equals("quang")){
                findPerson=person;
            }
        }
        personList.remove(findPerson);
        System.out.println("dsskx");
        for(Person person:personList){
            System.out.println(person.getName()+" - "+person.getAge()+" - "+ person.getAddress());
        }
    }
}
