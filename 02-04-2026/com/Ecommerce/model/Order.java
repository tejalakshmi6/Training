package com.Ecommerce.model;

public class Order {
    public Product prod;
    public User user;
    public int quantity;
    public Order(Product p, User u, int quantity) {
        this.prod = p;
        this.user = u;
        this.quantity = quantity;
    }
}
