package models;

public class Bill {
    private int billId;
    private int patientId;
    private String doctorName;
    private double consultationFee;
    private double medicineCharges;
    private double totalAmount;

    public Bill(int billId, int patientId, String doctorName, double consultationFee, double medicineCharges) {
        this.billId = billId;
        this.patientId = patientId;
        this.doctorName = doctorName;
        this.consultationFee = consultationFee;
        this.medicineCharges = medicineCharges;
        this.totalAmount = consultationFee + medicineCharges;
    }

    public int getBillId() {
        return billId;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public double getMedicineCharges() {
        return medicineCharges;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String toString() {
        return "Bill ID: " + billId + ", Patient ID: " + patientId +
               ", Doctor: " + doctorName + ", Consultation Fee: ₹" + consultationFee +
               ", Medicine Charges: ₹" + medicineCharges + ", Total: ₹" + totalAmount;
    }
}
