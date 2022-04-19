package com.company;

public abstract class Person {
  private  String name;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public abstract void show();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
     public void method(){
        System.out.println("pt method");
    }
}
