package com.restaurant.main;

import com.restaurant.model.*;
import com.restaurant.booking.*;

public class Main {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        restaurant.addTable(new Table(1, 2));
        restaurant.addTable(new Table(2, 4));
        restaurant.addTable(new Table(3, 6));

        Customer c1 = new Customer("Ramesh", "9876543210");
        Customer c2 = new Customer("Suresh", "9898987650");

        createBooking(restaurant, c1, 2, new Regular());
        createBooking(restaurant, c2, 3, new Premium());
    }

    public static void createBooking(Restaurant restaurant, Customer customer,
                                     int guests, BookingType type) {
        try {
            Table table = restaurant.findTable(guests);

            if (table == null) {
                System.out.println("Sorry...No table available for " + customer.getName());
                return;
            }

            Booking booking = new Booking(customer, table, type, guests);

            System.out.println("Booking successful!!");
            System.out.println("Customer Name: "+customer.getName());
            System.out.println("Guests: "+booking.getGuestCount());
            System.out.println("Table ID: " + table.getTableID());
            System.out.println("Booking Type: "+type.getType());
            System.out.println("Bill: " + booking.getBillAmount());
            System.out.println();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}