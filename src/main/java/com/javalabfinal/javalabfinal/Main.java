package com.javalabfinal.javalabfinal;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BookAppointment system = new BookAppointment();
        Scanner scanner = new Scanner(System.in);

        int option;

        while (true) {
            System.out.println("Doctor's Appointment Management System");
            System.out.println("1.Add Doctors");
            System.out.println("2.Add Patient");
            System.out.println("3.Available Doctors & Schedules");
            System.out.println("4.View Patient");
            System.out.println("5.Book Appointment");
            System.out.println("6.View Appointment");
            System.out.println("7.Exit");

            System.out.print("Enter your choice: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("***** Add Doctors *****");
                    System.out.print("Enter Doctor Name: ");
                    String doctorName = scanner.nextLine();
                    System.out.print("Enter Doctor Department: ");
                    String doctorDept = scanner.nextLine();
                    System.out.print("Enter Doctor Type (General/Special): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter Doctor Schedule (ex: 05:00-08:00,10:00-12:00): ");
                    String[] SechduleArray = scanner.nextLine().split(",");
                    List<String> schedule = Arrays.asList(SechduleArray);

                    if(type.equalsIgnoreCase("General")) {
                        GeneralDoctor general = new GeneralDoctor(doctorName, doctorDept, schedule);
                        system.addDoctor(general);
                    } else if (type.equalsIgnoreCase("Special")) {
                        SpecialDoctor special = new SpecialDoctor(doctorName,doctorDept, schedule);
                        system.addDoctor(special);
                    } else {
                        System.out.println("Invalid Type.");
                    }
                    break;
                case 2:
                    System.out.println("***** Add Patient *****");
                    System.out.print("Enter Patient Name: ");
                    String patientName = scanner.nextLine();
                    
                    System.out.print("Enter Patient Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Enter Patient Problem: ");
                    String problem = scanner.nextLine();
                    
                    System.out.print("Enter Patient Contact: ");
                    String contact = scanner.nextLine();
                    
                    Patient patient = new Patient();
                    patient.setName(patientName);
                    patient.setAge(age);
                    patient.setProblem(problem);
                    patient.setContact(contact);
                    system.addPatient(patient);
                    break;
                case 3:
                    System.out.println("***** Doctors List *****");
                    system.displayDoctors();
                    System.out.print("Enter the name of the doctor to see schedules: ");
                    String doctorNam = scanner.nextLine();
                    system.displayDoctorSchedule(doctorNam);
                    break;
                case 4:
                    System.out.println("***** Patients List *****");
                    system.displayPatients();
                    break;
                case 5:
                    System.out.println("***** Book Appointment *****");
                    System.out.print("Enter Patient's Name: ");
                    String patientNam = scanner.nextLine();
                    System.out.print("Enter Doctor's Name: ");
                    doctorName = scanner.nextLine();
                    System.out.print("Enter Appointment Time (e.g., 09:00): ");
                    String time = scanner.nextLine();

                    system.bookAppointment(patientNam, doctorName, time);
                    break;
                case 6:
                    System.out.println("***** View Appointments *****");
                    system.displayAppointments();
                    break;
                case 7:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
