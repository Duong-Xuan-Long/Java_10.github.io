package com.company;

public class Product {

    private int id;
    String name;
    String description;
    int theNumberOfProducts;
    long price;
    String unit;

    public Product(int id, String name, String description, int theNumberOfProducts, long price, String unit) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.theNumberOfProducts = theNumberOfProducts;
        this.price = price;
        this.unit = unit;
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

    public int getTheNumberOfProducts() {
        return theNumberOfProducts;
    }

    public void setTheNumberOfProducts(int theNumberOfProducts) {
        this.theNumberOfProducts = theNumberOfProducts;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", theNumberOfProducts=" + theNumberOfProducts +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                '}';
    }
}
