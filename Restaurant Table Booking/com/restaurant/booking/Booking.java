package com.restaurant.booking;

import com.restaurant.model.*;

public class Booking {
    private Customer customer;
    private Table table;
    private BookingType bookingType;
    private int guestCount;

    public Booking(Customer customer, Table table, BookingType bookingType, int guestCount) {

        if (table == null) {
            throw new IllegalArgumentException("Invalid table.");
        }
        if (!table.isAvailable()) {
            throw new IllegalArgumentException("Table not available!");
        }
        if (table.getCapacity() < guestCount) {
            throw new IllegalArgumentException("Guest count exceeds table capacity!");
        }

        this.customer = customer;
        this.table = table;
        this.bookingType = bookingType;
        this.guestCount = guestCount;

        table.reserve();
    
    }

    public double getBillAmount() {
        return bookingType.calculateCharge(guestCount);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Table getTable() {
        return table;
    }

    public int getGuestCount() {
        return guestCount;
    }
    

}
