package com.company;

import upcastingdowncasting.Animal;
import upcastingdowncasting.Dog;

public class Main {

    public static void main(String[] args) {
        Animal animal =new Dog();
//        animal.method1();
        Dog dog= (Dog) animal;
        dog.method3();
    }
}
