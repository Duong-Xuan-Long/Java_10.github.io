package com.company;

public class Book {
   private int bookBarCode;
    private String name;
    private String author;
    private String type;
    private String publisher;
    private int year;

    public Book(int bookBarCode, String name, String author, String type, String publisher, int year) {
        this.bookBarCode = bookBarCode;
        this.name = name;
        this.author = author;
        this.type = type;
        this.publisher = publisher;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookBarCode=" + bookBarCode +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                '}';
    }

    public int getBookBarCode() {
        return bookBarCode;
    }

    public void setBookBarCode(int bookBarCode) {
        this.bookBarCode = bookBarCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
