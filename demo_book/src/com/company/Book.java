package com.company;

public class Book {
    public int id;
    public String title;
    public String description;
    public String author;
    public String category;
    public int publishingYear;

    public Book(int id, String title, String description, String author, String category, int publishingYear) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = author;
        this.category = category;
        this.publishingYear = publishingYear;
    }

    public Book() {

    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", publishingYear='" + publishingYear + '\'' +
                '}';
    }
}
