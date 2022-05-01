package com.company;

import java.util.Scanner;

public class Service {
    public Student addStudent(){
        Student s= new Student();
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap id");
        s.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("nhap ten: ");
        s.setName(scanner.nextLine());
        System.out.println("nhap tuoi");
        s.setAge(scanner.nextInt());
        
        return s;
    }
    public Employee addEmployee(){
        Employee s= new Employee();
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap id");
        s.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("nhap ten: ");
        s.setName(scanner.nextLine());
        System.out.println("nhap luong");
        s.setSalary(scanner.nextInt());

        return s;
    }
}
