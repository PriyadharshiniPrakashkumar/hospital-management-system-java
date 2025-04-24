package models;

public class Appointment {
    private int id;
    private int patientId;
    private String doctorName;
    private String date;
    private String time;

    public Appointment(int id, int patientId, String doctorName, String date, String time) {
        this.id = id;
        this.patientId = patientId;
        this.doctorName = doctorName;
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    
    public String toString() {
        return "Appointment ID: " + id + ", Patient ID: " + patientId +
               ", Doctor: " + doctorName + ", Date: " + date + ", Time: " + time;
    }
}
