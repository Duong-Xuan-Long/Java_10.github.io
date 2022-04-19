package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import service.Service;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Service s=new Service();
//        ArrayList<Staff> list=s.showStaff();
//        System.out.println(list.get(0).tinhluong());
        Gson gson=new Gson();
//        String gsonData=gson.toJson(s.showStaff().get(0));
//        System.out.println(gsonData);
//        Type objectType =new TypeToken<Tester>(){}.getType();
//        Tester d11=gson.fromJson(gsonData,objectType);
        String jsonData=gson.toJson(s.showDeveloper());
        System.out.println(jsonData);
        Type objecType=new TypeToken<ArrayList<Developer>>(){}.getType();
        ArrayList<Developer> lis=gson.fromJson(jsonData,objecType);
        }
    }

