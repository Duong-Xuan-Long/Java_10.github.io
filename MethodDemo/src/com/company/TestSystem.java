package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class TestSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PersonService service=new PersonService();
        ArrayList<Person> list= service.addAllPerson();
//        service.Show(list);
//        Person newPerson=service.createPerson();

//        service.addPerson(list,newPerson);
//        System.out.println("danh sach sau khi them");
//        service.Show(list);
//        System.out.println("nhap id doi tuong can xoa ");
//        int id=Integer.parseInt(sc.nextLine());
//        Person fPerson=service.findPersonById(list,id);
        //service.removePerson(list,fPerson);
        //fPerson.setAddress("bac ninh");
//        service.Show(list);
        System.out.println("nhap id doi tuong can tao moi dia chi");
        int fid=Integer.parseInt(sc.nextLine());
        Person updatePerson=service.findPersonById(list,fid);
        System.out.println("doi tuong ban tim duoc la");
        System.out.println(updatePerson);
        System.out.println("nhap dia chi moi");
        String newAddress=sc.nextLine();
        service.updateAddress(newAddress,updatePerson);
        service.Show(list);
    }

}
