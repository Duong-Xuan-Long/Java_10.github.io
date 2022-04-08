package model;

import java.util.Scanner;

public class Student {
    public int id;
    public String name;
    public float theoryPoint;
    public float practicalPoint;
    public String school="techmaster";

    public Student() {
    }

    public Student(int id, String name, float theoryPoint, float practicalPoint, String school) {
        this.id = id;
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.practicalPoint = practicalPoint;
        this.school = school;
    }

    public Student(int id, String name, float theoryPoint, float practicalPoint) {
    }

    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter id: ");
        this.id=Integer.parseInt(sc.nextLine());
        System.out.println("enter name");
        this.name=sc.nextLine();
        System.out.println("enter theory point");
        this.theoryPoint=sc.nextFloat();
        System.out.println("enter practice point");
        this.practicalPoint=sc.nextFloat();

    }
    public float average(){

        return (this.theoryPoint+this.practicalPoint)/2;
    }
    public void output(){
        System.out.println(this.id+" - "+ this.name+" - "+this.theoryPoint+" - "+this.practicalPoint+" - "+average());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theoryPoint=" + theoryPoint +
                ", practicalPoint=" + practicalPoint +
                ", school='" + school + '\'' +
                '}';
    }
}
