package com.company;

import bookservice.BookService;

public class Main {

    public static void main(String[] args) {
        BookService service=new BookService();
        Book b1=service.addNewBook();
        System.out.println(b1);;
    }
}
