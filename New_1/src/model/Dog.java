package model;

public class Dog {
    String breed;
    String size;
    int age;
    String color;
    Dog(String breed,String size,int age,String color){
        this.breed=breed;
        this.size=size;
        this.age=age;
        this.color=color;
    }
    public void eat(){
        System.out.println("this dog eats a lot");

    }
    public void sleep(){
        System.out.println("this dog sleeps a lot");

    }
    public void run(){
        System.out.println("this dog runs a lot");

    }
}
