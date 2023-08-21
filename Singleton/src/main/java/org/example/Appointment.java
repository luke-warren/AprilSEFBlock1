package org.example;

public class Appointment {
    private String patientName;
    private String dob;
    private String reasonForVisit;

    public Appointment(String patientName, String dob, String reasonForVisit) {
        this.patientName = patientName;
        this.dob = dob;
        this.reasonForVisit = reasonForVisit;
    }
}
