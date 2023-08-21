package org.example;

import java.util.ArrayList;

public class SchedulerDTO {

    private ArrayList<Appointment> appointments;
    private String providerName;
    private int officeCode;

    public SchedulerDTO(ArrayList<Appointment> appointments, String providerName, int officeCode) {
        this.appointments = appointments;
        this.providerName = providerName;
        this.officeCode = officeCode;
    }

    public SchedulerDTO(){
        this.appointments = new ArrayList<>();
        this.providerName = "";
        this.officeCode = -1;
    }

    public void addAppointment(Appointment appt){
        appointments.add(appt);
    }

    public void addAppointments(ArrayList<Appointment> appts){
        appointments.addAll(appts);
    }

    public SchedulerDTO getAppointInfo(){
        return this;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public int getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(int officeCode) {
        this.officeCode = officeCode;
    }
}
