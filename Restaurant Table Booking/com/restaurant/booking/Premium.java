package com.restaurant.booking;

public class Premium extends BookingType { //Inheritance
    @Override
    public double calculateCharge(int guests) {
        return guests * 100;
    }
    @Override
    public String getType() {
        return "Premium";
    }
}

