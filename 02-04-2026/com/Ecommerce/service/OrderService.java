package com.Ecommerce.service;

import com.Ecommerce.model.*;

public class OrderService {
   public void placeOrder(Order o) {
      System.out.println("User Name: "+o.user.name);
      System.out.println("Product Name: "+o.prod.prodName);
      System.out.println("Quantity: "+o.quantity);
      double total = o.prod.price * o.quantity;
      System.out.println("Total Price: "+total);
      System.out.println("Order Placed Successfully.");
   }
}
