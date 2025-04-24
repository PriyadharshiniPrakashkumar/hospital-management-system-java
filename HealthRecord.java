package models;

public class HealthRecord {
    private int patientId;
    private String medicalHistory;
    private String currentMedications;
    private String allergies;
    private String previousConditions;

    public HealthRecord(int patientId, String medicalHistory, String currentMedications, String allergies, String previousConditions) {
        this.patientId = patientId;
        this.medicalHistory = medicalHistory;
        this.currentMedications = currentMedications;
        this.allergies = allergies;
        this.previousConditions = previousConditions;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public String getCurrentMedications() {
        return currentMedications;
    }

    public String getAllergies() {
        return allergies;
    }

    public String getPreviousConditions() {
        return previousConditions;
    }

    
    public String toString() {
        return "Patient ID: " + patientId + "\n" +
               "Medical History: " + medicalHistory + "\n" +
               "Current Medications: " + currentMedications + "\n" +
               "Allergies: " + allergies + "\n" +
               "Previous Conditions: " + previousConditions;
    }
}

