package com.DataMigrationTool.service;

import com.DataMigrationTool.model.DataRecord;

import java.io.*;
import java.util.*;

public class MigrationService {

    public void migrate(String inputFile, String outputFile) {

        List<DataRecord> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 2) {
                    int id = Integer.parseInt(data[0].trim());
                    String name = data[1].trim();

                    records.add(new DataRecord(id, name));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Transform
        for (DataRecord r : records) {
            r.setName(r.getName().toUpperCase());
        }

        // Sort
        Collections.sort(records, new NameComparator());

        // Write
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            for (DataRecord r : records) {
                bw.write(r.getId() + "," + r.getName());
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Migration Completed!");
    }
}