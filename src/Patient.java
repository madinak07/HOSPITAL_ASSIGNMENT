public class Patient {

    private int patientID;
    private String fullName;
    private int age;
    private String bloodType;

    public Patient(int patientID, String fullName, int age, String bloodType) {
        this.patientID = patientID;
        setFullName(fullName);
        setAge(age);
        setBloodType(bloodType);
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
        if (patientID >= 0) {
            this.patientID = patientID;
        }
    }

    public void setFullName(String fullName) {
        if (fullName != null && !fullName.trim().isEmpty()) {
            this.fullName = fullName;
        } else {
            this.fullName = "Unknown";
        }
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public void setBloodType(String bloodType) {
        if (bloodType != null && !bloodType.trim().isEmpty()) {
            this.bloodType = bloodType;
        } else {
            this.bloodType = "Unknown";
        }
    }

    public boolean isMinor() {
        return age < 18;
    }

    public String getAgeType() {
        if (age < 18) {
            return "Child";
        } else if (age < 60) {
            return "Adult";
        } else {
            return "Senior";
        }
    }

    public String toString() {
        return "Patient ID: " + patientID +
                ", Name: " + fullName +
                ", Age: " + age +
                ", Blood Type: " + bloodType +
                ", Category: " + getAgeType();
    }
}

