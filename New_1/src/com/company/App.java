package com.company;

import model.Student;
import service.StudentService;

public class App{
        public static void main(String[] args) {
//            Student s1=new Student();
//            Student s2=new Student();
//            s1.input();
////            s2.input();
//            s1.toString();
//            s2.output();
//            StudentService service=new StudentService();
//            Student s3=service.createStudent();
//            System.out.println(s3);
    Student[] arrStudent=new Student[3];
    Student s =new Student(1,"ngoc",8,8);
    arrStudent[0]=s;
    arrStudent[1]=new Student(2,"linh",9,9);
    arrStudent[2]=new Student(3,"tuan",9,8);
    for(int i=0;i< arrStudent.length;i++){
        System.out.println(arrStudent[i]);

    }
    for(Student student:arrStudent){
        System.out.println();
    }

}}
