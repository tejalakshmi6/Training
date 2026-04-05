package com.restaurant.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Table> tables;

    public Restaurant() {
        tables = new ArrayList<>();
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public Table findTable(int guestCount) {
        for (Table t : tables) {
            if (t.isAvailable() && t.getCapacity() >= guestCount) {
                return t;
            }
        }
        return null;
    }
}