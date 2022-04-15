package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonService {
    
    public ArrayList<Person> addAllPerson(){
        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person(1,"huy",28,"ha noi"));
        list.add(new Person(2,"quang",20,"ha noi"));
        list.add(new Person(3,"thinh",24,"ha noi"));
        list.add(new Person(4,"linh",27,"ha noi"));
        return list;
    }
    public void Show(ArrayList<Person> list){
        for(Person p:list){
            System.out.println(p);
        }
    }
    public Person createPerson(){
        Scanner sc=new Scanner(System.in);
        Person p=new Person();
        System.out.println("nhap id");
        p.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap ten");
        p.setName(sc.nextLine());
        System.out.println("nhap tuoi ");
        p.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap address");
        p.setAddress(sc.nextLine());
        return p;
        
    }
    public Boolean addPerson(ArrayList<Person> list,Person p){
        boolean flag=list.add(p);
        return flag;
    }

   public Person findPersonById(ArrayList<Person> list,int id){
        Person fPerson=null;
        for(Person p: list){
            if(p.getId()==id){
                fPerson=p;
            }
        }
        return fPerson;
   }
   public void removePerson(ArrayList<Person> list,Person person){
        list.remove(person);
   }
   public void updateAddress(String address,Person person){
        person.setAddress(address);
   }
}
