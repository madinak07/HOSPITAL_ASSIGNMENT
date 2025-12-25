public class Appointment {
    private int appointmentID;
    private String patientName;
    private String doctorName;
    private String date;

    public Appointment(int appointmentID, String patientName, String doctorName, String date) {
        this.appointmentID = appointmentID;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
    }

    public Appointment() {
        this.appointmentID = 0;
        this.patientName = "Unknown";
        this.doctorName = "Unknown";
        this.date = "Unknown";
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDate() {
        return date;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void reschedule(String newDate) {
        this.date = newDate;
    }

    public void cancel() {
        this.date = "Cancelled";
    }

    public String toString() {
        return "Appointment{" +
                "appointmentId=" + appointmentID +
                ", patientName='" + patientName + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
