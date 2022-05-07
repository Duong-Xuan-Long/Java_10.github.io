package service;

import com.company.Category;
import com.company.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    public ArrayList<Product> getAllProduct(){
        ArrayList<Product> list=new ArrayList<>();
list.add(new Product("Iphone 11","Phone",20000000,30,
        10,"Apple", new Category[]{Category.APPLE, Category.PHONE}));
list.add(new Product("Iphone 12","Phone",30000000,30,
                10,"Apple", new Category[]{Category.APPLE, Category.PHONE}));
list.add(new Product("Iphone 5","Phone",7000000,30,
                10,"Apple", new Category[]{Category.APPLE, Category.PHONE}));
list.add(new Product("Oppo A3s","Oppo",30000000,30,
                10,"Apple", new Category[]{Category.PHONE}));
list.add(new Product("Oppo reno","Oppo",4000000,30,
                10,"Apple", new Category[]{ Category.PHONE}));
list.add(new Product("lAPtop","Laptop",19000000,30,
                10,"Acer", new Category[]{Category.LAPTOP}));
list.add(new Product("Macbook","Macbook",24000000,30,
                10,"Apple", new Category[]{Category.LAPTOP,Category.APPLE}));
list.add(new Product("earphones","earphone",4000000,30,
                10,"Apple", new Category[]{Category.ACCESSORIES,Category.APPLE}));
list.add(new Product("WiredMouse","Mouse",400000,30,
                10,"Apple", new Category[]{Category.ACCESSORIES,Category.APPLE}));
list.add(new Product("WireLessMouse","Mouse",400000,30,
                10,"Apple", new Category[]{Category.ACCESSORIES,Category.APPLE}));

        return list;
    }
    public ArrayList<Product> getProductByBrand(ArrayList<Product> list,String brand){
        ArrayList<Product> listProductByBrand=new ArrayList<>();
        for(Product p: list){
            if(p.getBrand().equalsIgnoreCase(brand)){
                listProductByBrand.add(p);
            }
        }
        return listProductByBrand;
    }
    public ArrayList<Product> getProductByCategory(ArrayList<Product> list,Category category){
        ArrayList<Product> listProductByCategory=new ArrayList<>();
        for(Product p: list){
            for(Category c: p.getCategory()){
                if(c.equals(category)){
                    listProductByCategory.add(p);
                }
            }

        }
        return listProductByCategory;
    }
    public ArrayList<Product> getProductByPrice(ArrayList<Product> list,long startPrice,long endPrice){
        ArrayList<Product> listByPrice=new ArrayList<>();
        for(Product p:list){
            if(p.getPrice()>=startPrice&&p.getPrice()<=endPrice){
                listByPrice.add(p);
            }
        }

        return listByPrice;
    }
    public void findName(ArrayList<Product> list){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập tên bạn muốn tìm: ");
        String ten=scanner.nextLine();
        boolean t=false;
        for(Product p:list){
            String[] array=p.getName().split(" ");
            t=false;
            for(int k=0;k<array.length;k++){
                    for(int j=1;j<=array[k].length();j++){
                        if(array[k].substring(0,j).equalsIgnoreCase(ten)){
                            System.out.println(p.toString());
                            t=true;
                        }
                }
                if(t){break;}
            }

        }
    }
}
