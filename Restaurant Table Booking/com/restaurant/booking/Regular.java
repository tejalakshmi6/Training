package com.restaurant.booking;

public class Regular extends BookingType {
    @Override
    public double calculateCharge(int guests) {
        return guests * 200;
    }
    @Override
    public String getType() {
        return "Regular";
    }
}
