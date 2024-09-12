package com.javalabfinal.javalabfinal;
import java.io.*;
class Appointment{
    private Patient patient;
    private Doctor doctor;
    private String time;

    public Appointment(Patient patient, Doctor doctor, String time){
        this.patient = patient;
        this.doctor = doctor;
        this.time = time;
    }
    
    public Patient getPatient(){
        return patient;
    }

    public Doctor getDoctor(){
        return doctor;
    }

    public String getTime(){
        return time;
    }

    public void saveAppointment(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("appointments.txt", true))) {
            writer.write("Patient: " + patient.getName() + " Doctor: " + doctor.getName() + " Time: " + time);
            writer.newLine();
            System.out.println("Appointment Saved.");
        }catch (IOException e){
            System.out.println("Appointment Not Svaing");
        }
    }
    
    
}
