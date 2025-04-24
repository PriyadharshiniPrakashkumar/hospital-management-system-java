package services;

import models.Appointment;
import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
    private List<Appointment> appointments = new ArrayList<>();

    
    public void scheduleAppointment(int patientId, String doctorName, String date, String time) {
        Appointment appointment = new Appointment(appointments.size() + 1, patientId, doctorName, date, time);
        appointments.add(appointment);
        System.out.println("Appointment scheduled: " + appointment);
    }


    public void viewAllAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            System.out.println("--- All Scheduled Appointments ---");
            for (Appointment appointment : appointments) {
                System.out.println(appointment);
                System.out.println("----------------------------------");
            }
        }
    }
}
