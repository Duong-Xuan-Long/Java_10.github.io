package com.company;

import service.Service;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Service s=new Service();
        ArrayList<Staff> list=s.showStaff();
        System.out.println(list.get(0).tinhluong());

    }
}
