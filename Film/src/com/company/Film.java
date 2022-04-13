package com.company;

public class Film {
    private int id;
    private String title;
    private String type;
    private String director;
    private String publicationDate;

    public Film(int id, String title, String type, String director, String publicationDate) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.director = director;
        this.publicationDate = publicationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Film() {
    }



}
