package services;

import models.Patient;
import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private List<Patient> patients = new ArrayList<>();

    
    public void registerPatient(String name, int age, String gender, String contact) {
        Patient patient = new Patient(patients.size() + 1, name, age, gender, contact);
        patients.add(patient);
        System.out.println("Patient registered: " + patient);
    }

    
    public void viewAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients registered.");
        } else {
            System.out.println("--- All Registered Patients ---");
            for (Patient patient : patients) {
                System.out.println(patient);
                System.out.println("-------------------------------");
            }
        }
    }
}


