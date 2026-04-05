package com.restaurant.booking;

public abstract class BookingType {
    public abstract double calculateCharge(int guests); // Abstraction
    public abstract String getType();
}