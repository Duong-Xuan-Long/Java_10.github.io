package com.company;

import java.util.ArrayList;

public class Product {
    private int id;
    private String name;
    private String description;
    private long price;
    private int quantity;
    private int soldQuantity;
    private String brand;
    private ArrayList<String> directory;

    public Product(int id, String name, String description, long price, int quantity, int soldQuantity, String brand, ArrayList<String> directory) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.soldQuantity = soldQuantity;
        this.directory = directory;
        this.brand=brand;
    }

    public Product() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public ArrayList<String> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<String> directory) {
        this.directory = directory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", quantity=" + quantity +
                ", soldQuantity=" + soldQuantity +
                ", brand='" + brand + '\'' +
                ", directory=" + directory +
                '}';
    }
}
