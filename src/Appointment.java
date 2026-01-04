public class Appointment {

    private int appointmentID;
    private String patientName;
    private String doctorName;
    private String date;

    public Appointment(int appointmentID, String patientName, String doctorName, String date) {
        this.appointmentID = appointmentID;
        setPatientName(patientName);
        setDoctorName(doctorName);
        setDate(date);
    }

    public Appointment() {
        this.appointmentID = 0;
        this.patientName = "Unknown";
        this.doctorName = "Unknown";
        this.date = "Not scheduled";
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

    public void setPatientName(String patientName) {
        if (patientName != null && !patientName.trim().isEmpty()) {
            this.patientName = patientName;
        } else {
            this.patientName = "Unknown";
        }
    }

    public void setDoctorName(String doctorName) {
        if (doctorName != null && !doctorName.trim().isEmpty()) {
            this.doctorName = doctorName;
        } else {
            this.doctorName = "Unknown";
        }
    }

    public void setDate(String date) {
        if (date != null && !date.trim().isEmpty()) {
            this.date = date;
        } else {
            this.date = "Not scheduled";
        }
    }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentID +
                ", Patient: " + patientName +
                ", Doctor: " + doctorName +
                ", Date: " + date;
    }
}
