package com.javalabfinal.javalabfinal;
import java.util.List;
import java.util.ArrayList;

public class BookAppointment {
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }

    public void addPatient(Patient patient){
        patients.add(patient);
    }

    public void displayDoctors(){
        if(doctors.isEmpty()){
                    System.out.println("No Doctors Added.");
        }else{
            for (Doctor doctor : doctors){
                System.out.println("Doctor: " + doctor.getName() + "  Department: " + doctor.getDepartment() + "  Type: " + doctor.getType());
            }
        }
    }
    
    public void displayPatients(){
        if (patients.isEmpty()){
            System.out.println("No Patient Added.");
         }else{
            for (Patient patient : patients){
                System.out.println("Name: " + patient.getName() + " Age: " + patient.getAge() + " Problem:" + patient.getProblem()+ " Contact:" + patient.getContact());
            }
        }
    }

    public void displayAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments have been booked.");
        } else {
            for (Appointment appointment : appointments) {
                System.out.println("Patient: " + appointment.getPatient().getName() + "  Doctor: " + appointment.getDoctor().getName() + "  Time: " + appointment.getTime());
            }
        }
    }

    public void bookAppointment(String patientName, String doctorName, String time) {
        Patient patient = patients.stream().filter(p -> p.getName().equals(patientName)).findFirst().orElse(null);
        Doctor doctor = doctors.stream().filter(d -> d.getName().equals(doctorName)).findFirst().orElse(null);
        if(patient != null && doctor != null){
            Appointment appointment = new Appointment(patient, doctor, time);
            appointments.add(appointment);  
            System.out.println("Appointment booked for " + patientName + " with Dr. " + doctorName + " at " + time + ".");
        }else{
            System.out.println("Not found.");
        }
    }
    public void displayDoctorSchedule(String doctorName){
        Doctor doctor = doctors.stream().filter(d -> d.getName().equals(doctorName)).findFirst().orElse(null);
        if(doctor!=null){
            doctor.displaySchedule();
        }else{
            System.out.println("Doctor not found.");
        }
    }
}
