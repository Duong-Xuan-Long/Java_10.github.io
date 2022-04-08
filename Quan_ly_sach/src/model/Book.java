package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Book {
    private int id;
    private String title;
    private String[] category;
    private String author;
    private int page_number;
    private int release_year;

    public Book(int id, String title, String[] category, String author, int page_number, int release_year) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.author = author;
        this.page_number = page_number;
        this.release_year = release_year;
    }

    public Book() {

    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category=" + Arrays.toString(category) +
                ", author='" + author + '\'' +
                ", page_number=" + page_number +
                ", release_year=" + release_year +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String[] getCategory() {
        return category;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage_number() {
        return page_number;
    }

    public int getRelease_year() {
        return release_year;
    }


    }

