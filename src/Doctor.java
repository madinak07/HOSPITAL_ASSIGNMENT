public class Doctor {
    private int doctorID;
    private String fullName;
    private int experienceYears;
    private String specialization;

    public Doctor(int doctorID, String fullName, int experienceYears, String specialization) {
        this.doctorID = doctorID;
        this.fullName = fullName;
        this.experienceYears = experienceYears;
        this.specialization = specialization;
    }

    public Doctor() {
        this.doctorID = 0;
        this.fullName = "Unknown";
        this.experienceYears = 0;
        this.specialization = "Unknown";
    }

    public int getDoctorID() {
        return doctorID;
    }

    public String getFullName() {
        return fullName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String isExperienced() {
        if(experienceYears >= 10) {
            return "Great experienced doctor";
        } else {
            return "Good beginner doctor";
        }
    }

    public boolean canPerformSurgery() {
        return specialization.equalsIgnoreCase("Surgeon");
    }

    public String toString() {
        return "Doctor{" +
                "doctorID=" + doctorID +
                ", fullName=" + fullName + '\'' +
                ", specialization=" + specialization + '\'' +
                '}';
    }
}