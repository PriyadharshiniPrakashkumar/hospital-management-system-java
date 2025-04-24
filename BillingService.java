package services;

import models.Bill;
import java.util.ArrayList;
import java.util.List;

public class BillingService {
    private List<Bill> bills = new ArrayList<>();
    private int billCounter = 1;

    public void generateBill(int patientId, String doctorName, double consultationFee, double medicineCharges) {
        Bill bill = new Bill(billCounter++, patientId, doctorName, consultationFee, medicineCharges);
        bills.add(bill);
        System.out.println("Bill Generated: \n" + bill);
    }

    public void viewAllBills() {
        if (bills.isEmpty()) {
            System.out.println("No bills generated yet.");
        } else {
            for (Bill b : bills) {
                System.out.println(b);
            }
        }
    }
}

