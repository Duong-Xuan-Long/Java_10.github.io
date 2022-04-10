package bookservice;

import com.company.Book;

import java.util.Scanner;

public class BookService {
        Book book1=new Book(123456,"Cuốn theo chiều gió","Margaret Mitchell",
                "Tình cảm","Macmillan",1936);
    Book book2=new Book(145896,"Only a Monster","Vanessa Len",
            "Young adult fiction","A&U Children's",2022);
    Book book3=new Book(178986,"Somebody's Land: Welcome to Our Country","Adam Goodes",
            "Children's","A&U Children's",2021);
    Book book4=new Book(187561,"The Paris Apartment","Lucy Foley",
            "thriller","William Morrow",2022);
    Book book5=new Book(151542,"Who's Hiding in the Desert?","Katharine McEwen",
            "Young adult non-fiction","Nosy Crow",2020);
        Book[] book=new Book[5];
    String choose;
    Scanner scanner=new Scanner(System.in);
        public void service(){
            book[0]=book1;
            book[1]=book2;
            book[2]=book3;
            book[3]=book4;
            book[4]=book5;
                do{
                    display();
                    System.out.println("nhập số để chọn xử lí: ");
                    choose=scanner.nextLine();
                    switch(choose){
                        case "1": findBook();break;
                        case "2": findType();break;
                        case "3": listBook();break;
                        case "4":
                            System.out.println("Thoát!");
                            break;
                        default:
                            System.out.println("nhập lại số");

                    }
                }while(!choose.equals("4"));

        }

        public void display() {
            System.out.println("1.Tìm sách theo tên");
            System.out.println("2.Tìm sách theo thể loại");
            System.out.println("3.Liệt kê các sách xuất bản trong năm nay");
            System.out.println("4.Thoát");


        }
        public void findBook(){
            System.out.println("Nhập tên sách muốn tìm: ");
            String name= scanner.nextLine();
            int count=0;
            for(Book i: book){
                if(name.equalsIgnoreCase(i.getName())){
                    System.out.println(i.toString());
                }
            }
            if(count==0)System.out.println("Không có sách này");
        }
        public void findType(){
            System.out.println("Nhập tên thể loại sách muốn tìm: ");
            String name= scanner.nextLine();
            int count=0;
            for(Book i: book){
                if(name.equalsIgnoreCase(i.getType())){
                    System.out.println(i.toString());
                   count++;
                }
            }
            if(count==0)System.out.println("Không có sách thể loại này");
        }
        public void listBook(){
            for(Book i: book){
                if(i.getYear()==2022){
                    System.out.println(i.toString());

                }
            }
        }

}
