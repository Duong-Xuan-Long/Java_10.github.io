package productService;

import com.company.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    ArrayList<Product> list=new ArrayList<Product>();
    Scanner scanner=new Scanner(System.in);
    public void service(){
        list.add(new Product(123,"Bánh gạo","Ăn được",3,30000,"gói"));
        list.add(new Product(124,"socola","Ngon",4,80000,"hộp"));
        list.add(new Product(125,"kem đánh răng ","Dùng được",400,25000,"típ"));
        list.add(new Product(128,"xe đạp","Tốt",250,2500000,"chiếc"));
        list.add(new Product(129,"áo phao","Hơi lạnh",100,300000,"  chiếc"));
        String choice;
        do{
            display();

            System.out.println(" Lựa chọn của bạn là: ");
             choice=scanner.nextLine();
            switch(choice){
                case "1":
                    System.out.println("Danh sách sản phẩm là: ");
                    for(Product i :list){

                        System.out.println(i.toString());
                    }
                    break;
                case "2":
                    System.out.println("nhập tên sản phẩm bạn muốn tìm");
                    String ten=scanner.nextLine();
                    for(Product i :list){
                        if(i.getName().equalsIgnoreCase(ten)){
                            System.out.println("Sản phẩm bạn muốn tìm là");
                            System.out.println(i.toString());
                        }
                    }
                    break;
                case "3":
                    System.out.println("nhập id sản phẩm bạn muốn tìm");
                    int id=scanner.nextInt();
                    scanner.nextLine();
                    Product p=null;
                    for(Product i :list){
                        if(i.getId()==id){
                            System.out.println("Sản phẩm bạn muốn tìm là");
                            System.out.println(i.toString());
                            p=i;
                        }
                    }
                    subMenu3();
                    System.out.println("Lựa chon  của bạn là: ");
                    String choice2=scanner.nextLine();
                    if(choice2.equals("3.1")){
                        list.remove(p);
                        System.out.println("Danh sách sản phẩm sau xóa  là: ");
                        for(Product i :list){

                            System.out.println(i.toString());
                        }
                    }
                    else if(choice2.equals("3.2")){
                        System.out.println("nhập số lương sản phẩm bạn muốn cập nhật :");
                        int a=scanner.nextInt();
                        scanner.nextLine();
                        if (p != null) {
                            p.setTheNumberOfProducts(a);
                            System.out.println("Danh sách sau cập nhật :");
                            for(Product i :list){

                                System.out.println(i.toString());
                            }
                        }
                    }

                    break;
                case "4":
                    for(Product i :list){
                        System.out.println("Danh sách các sản phẩn có số lượng dưới 5 là: ");
                        if(i.getTheNumberOfProducts()<5){
                            System.out.println(i.toString());
                        }
                    }

                    break;
                case "5":
                    subMenu5();
                    System.out.println("Lựa chọn của bạn là: ");
                    String choice3=scanner.nextLine();
                    if(choice3.equals("5.1")){
                        System.out.println("Danh sách các sản phẩn có giá dưới 50000 là: ");
                        for(Product i :list){

                            if(i.getPrice()<50000){
                                System.out.println(i.toString());
                            }
                        }
                    }
                    if(choice3.equals("5.2")){
                        System.out.println("Danh sách các sản phẩn có giá từ 50000 đến 100000 là: ");
                        for(Product i :list){

                            if((i.getPrice()>=50000)&&(i.getPrice()<100000)){
                                System.out.println(i.toString());
                            }
                        }
                    }
                    if(choice3.equals("5.3")){
                        System.out.println("Danh sách các sản phẩn có giá trên 100000 là: ");
                        for(Product i :list){

                            if(i.getPrice()>100000){
                                System.out.println(i.toString());
                            }
                        }
                    }

                    break;
                case "6":
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Nhập lại");;
                    break;

            }

        }while(!choice.equals("6"));
    }
    public void display(){
        System.out.println("1 - Xem danh sách sản phẩm");
        System.out.println("2 - Tìm sản phẩm theo tên");
        System.out.println("3 - Tìm sản phẩm theo id:");
        System.out.println("4 - Tìm các sản phẩn có số lượng dưới 5");
        System.out.println("5 - Tìm sản phẩm theo mức giá:");
        System.out.println("6-Thoát");
    }
    public void subMenu3(){
        System.out.println("3.1: Xóa sn phẩm");
        System.out.println("3.2: Cập nhật số lượng sản phẩm");
    }
    public void subMenu5(){
        System.out.println("5.1: Dưới 50.000");
        System.out.println("5.2: Từ 50.000 đến dưới 100.000");
        System.out.println("5.3: Từ 100.000 trở lên");

    }
}
