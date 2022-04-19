package service;

import com.company.Developer;
import com.company.Gender;
import com.company.Staff;
import com.company.Tester;


import java.util.ArrayList;

public class Service {
    Developer d1=new Developer(1,"d1","1/1/1999","HN",
            Gender.MALE,12345678L,"d1@gmail.com",10000000,2);
    Developer d2=new Developer(2,"d2","7/1/1999","DN", Gender.FEMALE,12344978L,"d2gmail.com",10000000,1);
    Tester t1=new Tester(3,"t1","1/5/1999","HN",
            Gender.MALE,12342378L,"t1@gmail.com",8000000,2);
    Tester t2=new Tester(4,"t2","1/9/1999","HP",
            Gender.FEMALE,12342628L,"t2@gmail.com",8000000,1);
    public ArrayList<Staff> showStaff(){
        ArrayList<Staff> list=new ArrayList<Staff>();
        list.add(t1);
        list.add(t2);
        list.add(d1);
        list.add(d2);
        return list;
    }
    public ArrayList<Developer> showDeveloper(){
        ArrayList<Developer> listD=new ArrayList<>();

        listD.add(d1);
        listD.add(d2);

        return listD;
    }
    public ArrayList<Tester> showTester(){
        ArrayList<Tester> listT=new ArrayList<>();

            listT.add(t1);
            listT.add(t2);
        return listT;
    }


}
