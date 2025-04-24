package services;

import models.HealthRecord;
import java.util.HashMap;
import java.util.Map;

public class HealthRecordService {
    private Map<Integer, HealthRecord> records = new HashMap<>();

    public void createHealthRecord(int patientId, String medicalHistory, String currentMedications, String allergies, String previousConditions) {
        HealthRecord record = new HealthRecord(patientId, medicalHistory, currentMedications, allergies, previousConditions);
        records.put(patientId, record);
        System.out.println("Health Record created for Patient ID: " + patientId);
    }

    public void viewHealthRecord(int patientId) {
        HealthRecord record = records.get(patientId);
        if (record == null) {
            System.out.println("No health record found for Patient ID: " + patientId);
        } else {
            System.out.println(record);
        }
    }

    public void viewAllHealthRecords() {
        if (records.isEmpty()) {
            System.out.println("No health records available.");
        } else {
            for (HealthRecord record : records.values()) {
                System.out.println(record);
                System.out.println("----------------------------");
            }
        }
    }
}

