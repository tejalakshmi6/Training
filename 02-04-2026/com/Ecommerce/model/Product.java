package com.Ecommerce.model;

public class Product{
    public String prodName;
    public int stock;
    public int price;
    public Product(String name, int stock, int price){
        prodName = name;
        this.stock = stock;
        this.price = price;
    }
}