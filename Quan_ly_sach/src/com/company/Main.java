package com.company;

import jdk.swing.interop.SwingInterOpUtils;
import model.Book;
import service.BookService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    Book book1=new Book( 1,"Heaven's Burning",new String[]{"Action","Drama"},"Shawn Calvey",
            61, 2009);
    Book book2=new Book( 2,"Operator 13",new String[]{"Drama","Romance", "War"},"Daisi Richold",
            131, 2009);
    Book book3=new Book( 3,"Ghosts... of the Civil Dead",new String[]{"Crime","Drama"},"Chauncey Antrobus",
                154, 2004);
    Book book4=new Book( 4,"The African",new String[]{"Adventure","Comedy"},"Marina Barnicott",
                142, 2007);
    Book book5=new Book( 5,"House on Sorority Row, The",new String[]{"Horror","Mystery","Thriller"},"Casar Danes",
                191, 2011);
    Book book6=new Book( 6,"Bang, Bang, You're Dead",new String[]{"Drama"},"Trix Drennan",
                193, 2013);
    Book book7=new Book( 7,"The Bone Snatcher",new String[]{"Horror","Sci-Fi"},"Beck Sneaker",
                42, 1995);
    Book book8=new Book( 8, "Mummy, The", new String[]{"Horror"}, "Charla Durtnel",
            76, 2006);
    Book book9=new Book( 9, "Hope Springs", new String[]{"Comedy","Romance"}, "Alejandrina Oswell",
                 176, 2001);
    Book book10=new Book( 10, "Masseurs and a Woman, The (Anma to onna)", new String[]{"Drama"}, "Iolande Glanville",
                96, 2008);

        ArrayList<Book> listBook
 = new ArrayList<>();
        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);
        listBook.add(book4);
        listBook.add(book5);
        listBook.add(book6);
        listBook.add(book7);
        listBook.add(book8);
        listBook.add(book9);
        listBook.add(book10);
        int choose;
        Scanner scanner=new Scanner(System.in);
        do{
           display();
            System.out.println("Nhap lua chon cua ban,choose= : ");
            choose=scanner.nextInt();
            scanner.nextLine();
            switch(choose){
                case 1: for(int i=0;i<listBook.size();i++){
                    System.out.println("Sach thu "+(i+1)+listBook.get(i).toString());
                }
                    break;
                case 2:
                    System.out.println("nhap ten sach ban muon tim: ");
                    String sach=scanner.nextLine();
                    for(int i=0;i<listBook.size();i++){
                    if(listBook.get(i).getTitle().equalsIgnoreCase(sach)){
                        System.out.println(listBook.get(i).toString());
                    };
                }
                    break;
                case 3 :
                    System.out.println("nhap the loai sach ban muon tim: ");
                    String theloai=scanner.nextLine();
                    for(int i=0;i<listBook.size();i++){
                        for(int j=0;j<listBook.get(i).getCategory().length;j++){
                            if(listBook.get(i).getCategory()[j].equals(theloai)){
                                System.out.println(listBook.get(i).toString());
                            }
                        }

                    }

                    break;
                case 4:
                        Collections.sort(listBook, new Comparator<Book>() {
                            @Override
                            public int compare(Book o1, Book o2) {
                                return o1.getPage_number()-o2.getPage_number();
                            }
                        });

                    for(int i=0;i<listBook.size();i++){

                            System.out.println(listBook.get(i).toString());

                    }

                    break;
                case 5:
                    Collections.sort(listBook, new Comparator<Book>() {
                        @Override
                        public int compare(Book o1, Book o2) {
                            return o2.getRelease_year()-o1.getRelease_year();
                        }
                    });

                    for(int i=0;i<listBook.size();i++){

                        System.out.println(listBook.get(i).toString());

                    }

                    break;
                case 6:
                    System.out.println("Thoat");
                    break;
                default:  System.out.println("Chon lai choose = ");
            }


        }while(choose!=6);


    }
    public static void display(){
        System.out.println("1.Lấy thông tin toàn bộ sách");
        System.out.println("2.Tim sách theo tên");
        System.out.println("3.Tìm sách theo thể loại");
        System.out.println("4.Sắp xếp sách theo số trang");
        System.out.println("5.Sắp xếp sách theo năm xuất bản");
        System.out.println("6.Thoat");
    }



}
