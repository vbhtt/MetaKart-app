package com.varye.metakart;

/**
 * Created by Varun on 07-03-2016.
 */
public class Product {
    String productName, brand;
    int price;
    double rating;
    int thumb;

    Product(String productName, String brand, int price, double rating, int thumb) {
        this.productName = productName;
        this.brand = brand;
        this.price = price;
        this.rating = rating;
        this.thumb = thumb;
    }
}
