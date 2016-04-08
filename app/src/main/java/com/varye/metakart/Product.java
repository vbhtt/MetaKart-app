package com.varye.metakart;

import java.io.Serializable;

/**
 * Created by Varun on 07-03-2016.
 */
public class Product implements Serializable{
    String id, name, description, rating, image, price;

    Product(String id, String name, String description, String rating, String image, String price){
        this.id=id;
        this.name=name;
        this.description=description;
        this.rating=rating;
        this.image=image;
        this.price=price;
    }
}
