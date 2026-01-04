public class Doctor {

    private int doctorID;
    private String fullName;
    private String specialization;
    private int experienceYears;

    public Doctor(int doctorID, String fullName, String specialization, int experienceYears) {
        this.doctorID = doctorID;
        setFullName(fullName);
        this.specialization = specialization;
        setExperienceYears(experienceYears);
    }

    public int getDoctorID() {
        return doctorID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setFullName(String fullName) {
        if (fullName != null && !fullName.trim().isEmpty()) {
            this.fullName = fullName;
        } else {
            this.fullName = "Unknown";
        }
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears >= 0) {
            this.experienceYears = experienceYears;
        } else {
            this.experienceYears = 0;
        }
    }

    public String toString() {
        return "Doctor ID: " + doctorID +
                ", Name: " + fullName +
                ", Specialization: " + specialization +
                ", Experience: " + experienceYears + " years";
    }
}
