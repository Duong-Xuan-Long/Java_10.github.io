package com.company;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("hoa",20,"ha noi",8));
        students.add(new Student("quang",21,"ha noi",9));
        students.add(new Student("huy",17,"ha noi",7));

        ArrayList<Teacher> teachers=new ArrayList<>();
        teachers.add(new Teacher("ba",26,"ha noi",8000000));
        teachers.add(new Teacher("cuong",26,"ha noi",8000000));
        teachers.add(new Teacher("hien",26,"ha noi",8000000));


    }
    public static void showList(ArrayList<? super Student > list){
        for(Object o:list){
            System.out.println(o);
        }

    }
}
