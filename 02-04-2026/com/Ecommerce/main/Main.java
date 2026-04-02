package com.Ecommerce.main;

import com.Ecommerce.model.*;
import com.Ecommerce.service.*;

public class Main {
    public static void main(String[] args) {
        User u = new User("Maverick","Chennai");
        Product p = new Product("Soap",20,20);
        Order o = new Order(p,u,10);
        OrderService service = new OrderService();
        service.placeOrder(o);
    }
}
