package com.restaurant.model;

public class Table {
    private int tableID;
    private int capacity;
    private boolean isAvailable;

    public Table(int tableID, int capacity) {
        this.tableID = tableID;
        this.capacity = capacity;
        this.isAvailable = true;
    }

    public int getTableID() {
        return tableID;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void reserve() {
        isAvailable = false;
    }
}