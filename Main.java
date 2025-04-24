import java.util.Scanner;
import services.PatientService;
import services.AppointmentService;
import services.BillingService;
import services.HealthRecordService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatientService patientService = new PatientService();
        AppointmentService appointmentService = new AppointmentService();
        BillingService billingService = new BillingService();
        HealthRecordService healthRecordService = new HealthRecordService();

        while (true) {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Register Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View All Appointments");
            System.out.println("5. Generate Bill");
            System.out.println("6. View All Bills");
            System.out.println("7. Create Health Record");
            System.out.println("8. View Health Record");
            System.out.println("9. View All Health Records");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();
                    System.out.print("Enter Contact: ");
                    String contact = sc.nextLine();
                    patientService.registerPatient(name, age, gender, contact);
                    break;

                case 2:
                    patientService.viewAllPatients();
                    break;

                case 3:
                    System.out.print("Enter Patient ID: ");
                    int patientId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Doctor Name: ");
                    String doctor = sc.nextLine();
                    System.out.print("Enter Date (YYYY-MM-DD): ");
                    String date = sc.nextLine();
                    System.out.print("Enter Time (e.g. 10:00 AM): ");
                    String time = sc.nextLine();
                    appointmentService.scheduleAppointment(patientId, doctor, date, time);
                    break;

                case 4:
                    appointmentService.viewAllAppointments();
                    break;

                case 5:
                    System.out.print("Enter Patient ID: ");
                    int billPatientId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Doctor Name: ");
                    String billDoctor = sc.nextLine();
                    System.out.print("Enter Consultation Fee: ₹");
                    double fee = sc.nextDouble();
                    System.out.print("Enter Medicine Charges: ₹");
                    double medicine = sc.nextDouble();
                    billingService.generateBill(billPatientId, billDoctor, fee, medicine);
                    break;

                case 6:
                    billingService.viewAllBills();
                    break;

                case 7:
                    System.out.print("Enter Patient ID: ");
                    int recordPatientId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Medical History: ");
                    String medicalHistory = sc.nextLine();
                    System.out.print("Enter Current Medications: ");
                    String medications = sc.nextLine();
                    System.out.print("Enter Allergies: ");
                    String allergies = sc.nextLine();
                    System.out.print("Enter Previous Conditions: ");
                    String conditions = sc.nextLine();
                    healthRecordService.createHealthRecord(recordPatientId, medicalHistory, medications, allergies, conditions);
                    break;

                case 8:
                    System.out.print("Enter Patient ID: ");
                    int healthRecordPatientId = sc.nextInt();
                    healthRecordService.viewHealthRecord(healthRecordPatientId);
                    break;

                case 9:
                    healthRecordService.viewAllHealthRecords();
                    break;

                case 10:
                    System.out.println("Exiting the system. Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

