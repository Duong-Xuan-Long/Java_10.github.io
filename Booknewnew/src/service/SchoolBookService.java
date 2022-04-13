package service;

import model.SchoolBook;

import java.util.Scanner;

public class SchoolBookService {
    public SchoolBook creatBook(){
            Scanner sc=new Scanner(System.in);
        SchoolBook s=new SchoolBook();
        System.out.println("nhap id ");
        s.setMasach(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten sach ");
        s.setTensach(sc.nextLine());
        System.out.println("Nhap nha xuat ban ");
        s.setNhaxuatban(sc.nextLine());
        System.out.println("nhap nam xuat ban ");
        s.setSoluong(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap so trang ");
        s.setSotrang(sc.nextInt());
        System.out.println("nhap tinh trang");
        s.setTinhtrang(sc.nextInt());
        System.out.println("nhap so luong muon");
        s.setSoluongmuon(sc.nextInt());
        return s;
    }

}
