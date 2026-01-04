import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Test data
        patients.add(new Patient(1, "Aruzhan", 20, "O+"));
        doctors.add(new Doctor(101, "Dr. Smith", "Cardiologist", 10));
        appointments.add(new Appointment(1001, "Aruzhan", "Dr. Smith", "2026-01-10"));

        boolean running = true;

        while (running) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // IMPORTANT

            switch (choice) {
                case 1 -> addPatient();
                case 2 -> viewPatients();
                case 3 -> addDoctor();
                case 4 -> viewDoctors();
                case 5 -> addAppointment();
                case 6 -> viewAppointments();
                case 0 -> {
                    System.out.println("Exiting system...");
                    running = false;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n=== HOSPITAL SYSTEM ===");
        System.out.println("1. Add Patient");
        System.out.println("2. View All Patients");
        System.out.println("3. Add Doctor");
        System.out.println("4. View All Doctors");
        System.out.println("5. Add Appointment");
        System.out.println("6. View All Appointments");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }

    private static void addPatient() {
        System.out.print("Enter patient ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter blood type: ");
        String blood = scanner.nextLine();

        patients.add(new Patient(id, name, age, blood));
        System.out.println("Patient added successfully!");
    }

    private static void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }
        for (Patient p : patients) {
            System.out.println(p);
        }
    }

    private static void addDoctor() {
        System.out.print("Enter doctor ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter specialization: ");
        String spec = scanner.nextLine();

        System.out.print("Enter experience years: ");
        int exp = scanner.nextInt();
        scanner.nextLine();

        doctors.add(new Doctor(id, name, spec, exp));
        System.out.println("Doctor added successfully!");
    }

    private static void viewDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
            return;
        }
        for (Doctor d : doctors) {
            System.out.println(d);
        }
    }

    private static void addAppointment() {
        System.out.print("Enter appointment ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter patient name: ");
        String patient = scanner.nextLine();

        System.out.print("Enter doctor name: ");
        String doctor = scanner.nextLine();

        System.out.print("Enter date: ");
        String date = scanner.nextLine();

        appointments.add(new Appointment(id, patient, doctor, date));
        System.out.println("Appointment added successfully!");
    }

    private static void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }
        for (Appointment a : appointments) {
            System.out.println(a);
        }
    }
}

