package com.DataMigrationTool.model;

public class DataRecord {
    private int id;
    private String name;

    public DataRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }
}