package com.DataMigrationTool.service;

import com.DataMigrationTool.model.*;
import java.util.Comparator;

public class NameComparator implements Comparator<DataRecord> {
    public int compare(DataRecord r1, DataRecord r2) {
        return r1.getName().compareToIgnoreCase(r2.getName());
    }
}