package service;

import com.company.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    Scanner scanner = new Scanner(System.in);
    Product p1=new Product(1,"ok1","ok11",1,11,"cm");
    Product p2=new Product(2,"ok2","ok22",2,22,"cm");
    ArrayList<Product> list=new ArrayList<>();
    public void service() {
        list.add(p1);
        list.add(p2);



        String yourchoice;
        do {
            display();
            System.out.println("nhập lựa chọn của bạn");
            yourchoice = scanner.nextLine();
            switch (yourchoice) {
                case "1":
                    xemDanhSach();
                    break;
                case "2":
                        findSpName();
                    break;
                case "3":findSpId();
                    break;
                case "4":System.out.println("Exit");
                    break;

                default:
                    System.out.println("Nhập lại lựa chọn");


            }
        } while (!yourchoice.equals("4"));

    }

    public void display(){

        System.out.println("1.Xem danh sách sản phẩm");
        System.out.println("2.Tìm sản phẩm theo tên");
        System.out.println("3.Tìm sản phẩm theo id");

        System.out.println("4 thoát");
    }
    public void subMenu(){
        System.out.println("3.1 xóa sản phẩm theo id tìm");
        System.out.println("3.2 cập nhật sản phẩm theo id tìm");
    }
    public void xemDanhSach(){
        for(Product i:list){
            System.out.println(i);
        }
    }
    public void findSpName(){
        String name="nhap ten san pham ban muon tim";
        for(Product i:list){
            if(i.getTenSanPham().equalsIgnoreCase(name)){
                System.out.println(i);
            }

        }
    }
    public Product findSpId(){
        System.out.println("nhap id san pham ban muon tim: ");
        int id=scanner.nextInt();
        int k;
        for( k=0;k< list.size()-1;k++){
            if(list.get(k).getId()==id){
                System.out.println(list.get(k));
            }
        }
////        subMenu();
////        String choice2="nhap lua chon cua ban";
////        switch(choice2){
////            case "3.1":list.remove(list.get(k));
////            case "3.2":
////                int newVolume= scanner.nextInt();
////                scanner.nextLine();
////                list.get(k).setSoLuong(newVolume);
////            case "3.3":
////                System.out.println("Exit");
//        }
        return list.get(k);
    }


}
