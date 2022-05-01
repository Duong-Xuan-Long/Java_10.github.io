package productService;

import com.company.Product;

import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ProductService {
    ArrayList<Product> list=new ArrayList<Product>();
    Scanner scanner=new Scanner(System.in);
    public ArrayList<Product> service(){
        list.add(new Product(1,"iPhone SE 2022 64GB ",
                "4.7 inch, HD, 1334 x 750 Pixels",
                12990000L,3,1,"Apple", new ArrayList<>(Arrays.asList("Điện thoại", "Appe"))));
        list.add(new Product(2,"MacBook Air 13 2020 M1 256GB ",
                "13.3 inch, 2560 x 1600 Pixels, IPS, IPS LCD LED Backlit, True Tone",
                24499000L,10,3,"Apple", new ArrayList<>(Arrays.asList("Laptop", "Appe"))));
        list.add(new Product(3,"Chuột Magic Mouse 2 2022 ",
                "Chuột không dây",
                2691000L,13,5,"Apple", new ArrayList<>(Arrays.asList("Phụ kiện", "Appe"))));
        list.add(new Product(4,"Bàn Phím Gập Không Dây Mipow Miffy Mini Slim-Fold MPC-003  ",
                "Bàn Phím Gập Không Dây",
                1590000L,9,6,"Mipow", new ArrayList<>(Arrays.asList("Phụ kiện"))));
        list.add(new Product(5,"Xiaomi Redmi Note 11 4GB - 64GB   ",
                "4GB - 64GB ",
                4390000L,8,2,"Xiaomi", new ArrayList<>(Arrays.asList("Điện thoại"))));
String choice1;
            do{
                display1();
                System.out.println("Nhập lựa chọn của bạn :");
                choice1=scanner.nextLine();
                switch(choice1){
                    case "1":
                        showDirectory(list);
                        break;
                    case "2":
                        showBrand(list);
                        break;
                    case "3":
                        showPrice(list);
                        break;
                    case "4":
                        findName(list);
                        break;
                    case "5":
                        findBrand(list);
                        break;
                    case "6":
                        System.out.println("thoát!");
                        break;
                    default:
                        System.out.println("Nhập lại");
                }
            }while(!choice1.equals("6"));


        return list;
    }
    void display1(){
        System.out.println("1 In thông tin dựa trên danh mục.");
        System.out.println("2 In thông tin các sản phẩm dựa theo hãng và số sản phẩm của hãng đó");
        System.out.println("3 In thông tin sản phẩm dựa trên mức giá và danh mục." +
                "Các mức giá:" + "\\Dưới 2 triệu" + "\\Từ 2 - 4 triệu" + "\\Từ 4 - 7 triệu" + "\\Từ 7 - 13 triệu" + "\\Trên 13 triệu");
        System.out.println("4 Tìm sản phẩm theo tên và số sản phẩm tìm được");
        System.out.println("5 Liệt kê các hãng và số lượng sản phẩm của mỗi hãng");
        System.out.println("6 Thoát");
    }
    void display2(){
        System.out.println("1. Điện thoại\n"+"2. Laptop\n"+"3. Appe\n"+"4. Phụ kiện\n"+"5. Quay lại\n");
    }
    public void showDirectory(ArrayList<Product> list){
        String choice2;
        do{
            display2();
            System.out.println("Nhập lựa chọn của bạn :");
            choice2=scanner.nextLine();
            switch(choice2){
                case "1":
                    for(Product p:list){
                        for(int i=0;i<p.getDirectory().size();i++){
                            if(p.getDirectory().get(i).equals("Điện thoại")){
                                System.out.println(p.toString());
                            }
                        }

                    }
                    break;
                case "2":
                    for(Product p:list){
                        for(int i=0;i<p.getDirectory().size();i++){
                            if(p.getDirectory().get(i).equals("Laptop")){
                                System.out.println(p.toString());
                            }
                        }

                    }
                    break;
                case "3":
                    for(Product p:list){
                        for(int i=0;i<p.getDirectory().size();i++){
                            if(p.getDirectory().get(i).equals("Appe")){
                                System.out.println(p.toString());
                            }
                        }

                    }
                    break;
                case "4":
                    for(Product p:list){
                        for(int i=0;i<p.getDirectory().size();i++){
                            if(p.getDirectory().get(i).equals("Phụ kiện")){
                                System.out.println(p.toString());
                            }
                        }

                    }
                    break;
                case "5": service(); break;
                default:
                    System.out.println("Nhập lại");
            }
        }while(!choice2.equals("5"));
    }
    public void showBrand(ArrayList<Product> list){
            HashMap<String,Integer> map=new HashMap<String, Integer>();
        for(Product p: list){
            if(map.containsKey(p.getBrand())){
                map.put(p.getBrand(),map.get(p.getBrand())+1);
            }
            else{
                map.put(p.getBrand(),1);
            }
        }
        for(Product p: list){
            for (String key: map.keySet()){
                if(key.equals(p.getBrand())){
                    System.out.println(p.getName()+"( Hãng Apple"+key+ ", số lượng : " + map.get(key)+")");
                }

            }
        }


    }
    public void showPrice(ArrayList<Product> list){

        String pr;
        do {
            System.out.println("chọn danh mục sản phẩm bạn muốn xem giá : "+"\n1.Điện thoại\n"
                    +"2.Laptop\n"+"3.Appe\n"+"4.Phụ kiện\n"+"5.Quay lại\n");
            
            pr=scanner.nextLine();
            switch(pr){
                case "1":
                    checkDirectory(list,"Điện thoại");
                    break;
                case "2":
                    checkDirectory(list,"Laptop");
                    break;
                case "3":checkDirectory(list,"Appe");break;
                case "4":checkDirectory(list,"Phụ kiện");break;
                case "5": service();break;
                default:
                    System.out.println("Nhập lại");
            }
        }while(!pr.equals("5"));
    }
    public void findName(ArrayList<Product> list){
        System.out.println("nhập tên bạn muốn tìm: ");
        String ten=scanner.nextLine();
        boolean t=false;
        for(Product p:list){
            t=false;
            for(int i=0;i<p.getName().length();i++){
                for(int j=i+1;j<p.getName().length();j++){
                    if(p.getName().substring(i,j).equalsIgnoreCase(ten)){
                        System.out.println(p.toString()+",Có số lượng là :"+p.getQuantity());
                        t=true;
                    }
                }
                if(t==true){break;}
            }
        }
    }
    public void findBrand(ArrayList<Product> list){
        HashMap<String,Integer> map=new HashMap<>();
        for(Product p:list){
            if(map.containsKey(p.getBrand())){
                map.put(p.getBrand(),map.get(p.getBrand())+1);
            }
            else{
                map.put(p.getBrand(),1);
            }
        }
        System.out.println(map);
    }
    public void price(){
        System.out.println("Nhập lựa chọn của bạn: ");
        System.out.println("1. Dưới 2 triệu");
        System.out.println("2. Từ 2 - 4 triệu");
        System.out.println("3. Từ 4 - 7 triệu");
        System.out.println("4. Từ 7 - 13 triệu");
        System.out.println("5. Trên 13 triệu");
        System.out.println("6. Quay lại!");
    }
    public void checkDirectory(ArrayList<Product> list,String s){
        ArrayList<Product> listBelow2=new ArrayList<>();
        ArrayList<Product> listFrom2To4=new ArrayList<>();
        ArrayList<Product> listFrom4To7=new ArrayList<>();
        ArrayList<Product> listFrom7To13=new ArrayList<>();
        ArrayList<Product> listAbove13=new ArrayList<>();
        String pick;
        do{
            price();
            System.out.println("nhập lựa chọn của bạn: ");
            pick=scanner.nextLine();
            switch(pick){
                case "1":
                    listBelow2.clear();
                    for(Product p:list){
                        for(int i=0;i<p.getDirectory().size();i++){
                            if((p.getDirectory().get(i).equals(s))&&(p.getPrice()<2000000)){
                                listBelow2.add(p);
                            }
                        }


                    }
                    if(listBelow2.isEmpty()){
                        System.out.println("Không có sản phẩm");
                    }
                    else{
                        System.out.println("Danh sách sp có giá dưới hai triệu là: ");
                        System.out.println(listBelow2);
                    }

                    break;
                case "2":
                    listFrom2To4.clear();
                    for(Product p:list){
                        for(int i=0;i<p.getDirectory().size();i++){
                            if((p.getDirectory().get(i).equals(s))&&(p.getPrice()>=2000000)&&(p.getPrice()<=4000000)){
                                listFrom2To4.add(p);
                            }
                        }


                    }
                    if(listFrom2To4.isEmpty()){
                        System.out.println("Không có sản phẩm");
                    }
                    else{
                        System.out.println("Danh sách sp có giá từ hai triệu đến bốn triệu là: ");
                        for(Product k:listFrom2To4){
                            System.out.println(k.toString());
                        }

                    }

                    break;
                case "3":
                    listFrom4To7.clear();
                    for(Product p:list){
                        for(int i=0;i<p.getDirectory().size();i++){
                            if((p.getDirectory().get(i).equals(s))&&(p.getPrice()>4000000)&&(p.getPrice()<=7000000)){
                                listFrom4To7.add(p);
                            }
                        }


                    }
                    if(listFrom4To7.isEmpty()){
                        System.out.println("Không có sản phẩm");
                    }
                    else{
                        System.out.println("Danh sách sp có giá từ bốn triệu đến bảy triệu là: ");
                        System.out.println(listFrom4To7);
                    }
                    break;
                case "4":
                    listFrom7To13.clear();
                    for(Product p:list) {
                        for (int i = 0; i < p.getDirectory().size(); i++) {
                            if ((p.getDirectory().get(i).equals(s)) && (p.getPrice() > 7000000) && (p.getPrice() <= 13000000)) {
                                listFrom7To13.add(p);
                            }
                        }

                    }
                    if(listFrom7To13.isEmpty()){
                        System.out.println("Không có sản phẩm");
                    }
                    else{
                        System.out.println("Danh sách sp có giá từ bảy triệu đến 13 triệu là: ");
                        System.out.println(listFrom7To13);
                    }
                    break;
                case "5":
                    listAbove13.clear();
                    for(Product p:list) {
                        for (int i = 0; i < p.getDirectory().size(); i++) {
                            if ((p.getDirectory().get(i).equals(s)) && (p.getPrice() > 13000000)) {
                                listAbove13.add(p);
                            }
                        }

                    }
                    if(listAbove13.isEmpty()){
                        System.out.println("Không có sản phẩm");
                    }
                    else{
                        System.out.println("Danh sách sp có giá trên 13 triệu là: ");
                        System.out.println(listAbove13);
                    }
                    break;
                case "6": showPrice(list);break;
                default:
                    System.out.println("Nhập lại");
            }
        }while(!pick.equals("6"));
        for(Product p:list){

        }
    }

}
