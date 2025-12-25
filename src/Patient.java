public class Patient {
    private int patientID;
    private String fullName;
    private int age;
    private String bloodType;

    public Patient(int patientID, String fullName, int age, String bloodType) {
        this.patientID = patientID;
        this.fullName = fullName;
        this.age = age;
        this.bloodType = bloodType;
    }

    public Patient() {
        this.patientID = 0;
        this.fullName = "Unknown";
        this.age = 0;
        this.bloodType = "Unknown";
    }

    public int getPatientID() {
        return patientID;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public boolean isMinor() {
        return age < 18;
    }

    public String getAgeType() {
        if(age < 18) {
            return "Child";
        } else if (age < 60) {
            return "Adult";
        } else {
            return "Grand";
        }
    }

    public String toString() {
        return "Patient{" +
                "patientID=" + patientID +
                ", fullName=" + fullName + '\'' +
                ", bloodType=" + bloodType + '\'' +
                '}';
    }
}
