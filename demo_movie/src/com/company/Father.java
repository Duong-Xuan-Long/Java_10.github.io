package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Father {
    int id;
    String name;
    String slug;
    String description;
    ArrayList<String> type;
    long view;
    LocalDate publishDate;

    public Father(int id, String name, String slug, String description, ArrayList<String>  type, long view, LocalDate publishDate) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.type = type;
        this.view = view;
        this.publishDate = publishDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String>  getType() {
        return type;
    }

    public void setType(ArrayList<String>  type) {
        this.type = type;
    }

    public long getView() {
        return view;
    }

    public void setView(long view) {
        this.view = view;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Father{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", view=" + view +
                ", publishDate=" + Datee.changeDate(publishDate) +
                '}';
    }
}
