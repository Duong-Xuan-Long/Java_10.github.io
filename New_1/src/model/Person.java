package model;

public class Person {
    public String name;
    public int age;
    public String address;
    public static String school="TECHMASTER";

    Person(String ten,int tuoi,String diachi){
        name=ten;
        age=tuoi;
        address=diachi;
    }


    public void study(){
        System.out.println("call to study method");
        school="ok";
    }
    public static void method(){
        System.out.println("karama");
    }
    static{
        System.out.println("static block");
    }
}
