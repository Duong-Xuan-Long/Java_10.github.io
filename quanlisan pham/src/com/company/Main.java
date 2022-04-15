package com.company;

import service.ProductService;

public class Main {

    public static void main(String[] args) {
        ProductService service=new ProductService();
        service.service();
    }
}
