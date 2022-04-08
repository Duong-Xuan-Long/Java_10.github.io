package bookservice;

import com.company.Book;

import java.util.Scanner;

public class BookService {
    Book b;
    public Book addNewBook(){
        Scanner scanner=new Scanner(System.in);
         b=new Book();
        System.out.println("Enter id");
        b.id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter title");
        b.title=scanner.nextLine();
        System.out.println("Enter description");
        b.description=scanner.nextLine();
        System.out.println("Enter author");
        b.author=scanner.nextLine();
        System.out.println("enter category");
        b.category=scanner.nextLine();
        System.out.println("Enter pulishing year");
        b.publishingYear=scanner.nextInt();

        return b;
    }
}
