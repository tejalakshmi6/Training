package com.DataMigrationTool.main;

import com.DataMigrationTool.service.*;

public class Main {
    public static void main(String[] args) {

        String inputFile = "input.csv";
        String outputFile = "output.csv";

        MigrationService service = new MigrationService();
        service.migrate(inputFile, outputFile);
    }
}