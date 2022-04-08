package service;

import model.Student;

import java.util.Scanner;
//this class is used to process all the methods related to the students

public class StudentService {

    public Student createStudent(){
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        System.out.println("ENter id: ");
        s.id=Integer.parseInt(sc.nextLine());
        System.out.println("enter name");
        s.name=sc.nextLine();
        System.out.println("enter theory point");
       s.theoryPoint=sc.nextFloat();
        System.out.println("enter practice point");
       s.practicalPoint=sc.nextFloat();
        return s;
    }
    public Student createNewStudent(){
        Scanner sc=new Scanner(System.in);

        System.out.println("ENter id: ");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter theory point");
        float theoryPoint=sc.nextFloat();
        System.out.println("enter practice point");
        float practicalPoint=sc.nextFloat();
        Student s=new Student(id,name,theoryPoint,practicalPoint);
        return s;
    }

}
