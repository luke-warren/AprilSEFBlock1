package org.example;

public class ScheduleService {

    Calendar calendar = Calendar.getInstance();


    public boolean requestAppointByDoctor(Doctor doctor, Appointment appt){
        SchedulerDTO schedulerDTO = new SchedulerDTO();

        //add hasn't been written yet.
        //Boolean addedEvent = calendar.add(doctor, appt);
        schedulerDTO.addAppointment(appt);
        schedulerDTO.setOfficeCode(123);
        schedulerDTO.setProviderName(doctor.toString());

        //Send the SchedulerDTO


        return true;

    }
}
