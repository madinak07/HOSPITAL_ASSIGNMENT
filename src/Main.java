public class Main {
    public static void main(String[] args) {

        System.out.println("=== Hospital Management System ===");
        System.out.println();

        // Patients
        Patient p1 = new Patient(1, "Aruzhan Kim", 17, "O+");
        Patient p2 = new Patient(2, "Dias Nurlan", 45, "A+");

        // Doctors
        Doctor d1 = new Doctor(101, "Dr. Smith", 12, "Surgeon");
        Doctor d2 = new Doctor(102, "Dr. Brown", 5, "Therapist");

        // Appointment
        Appointment a1 = new Appointment(1001, "Aruzhan Kim", "Dr. Smith", "12.10.2025");

        System.out.println("--- PATIENTS ---");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println();

        System.out.println("--- DOCTORS ---");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println();

        System.out.println("--- APPOINTMENTS ---");
        System.out.println(a1);
        System.out.println();

        System.out.println("--- TESTING GETTERS ---");
        System.out.println("Patient name: " + p1.getFullName());
        System.out.println("Doctor specialization: " + d1.getSpecialization());
        System.out.println("Appointment date: " + a1.getDate());
        System.out.println();

        System.out.println("--- TESTING SETTERS ---");
        p2.setAge(50);
        d2.setExperienceYears(10);
        a1.setDate("15.10.2025");

        System.out.println(p2);
        System.out.println(d2);
        System.out.println(a1);
        System.out.println();

        System.out.println("--- TESTING METHODS ---");

        System.out.println("Is " + p1.getFullName() + " minor? " + p1.isMinor());
        System.out.println("Age category: " + p2.getAgeType());

        System.out.println("Is doctor experienced? " + d1.isExperienced());
        System.out.println("Can perform surgery? " + d1.canPerformSurgery());

        a1.reschedule("20.10.2025");
        System.out.println("Rescheduled appointment: " + a1);

        a1.cancel();
        System.out.println("Cancelled appointment: " + a1);

        System.out.println();
        System.out.println("=== Program Complete ===");
    }
}
