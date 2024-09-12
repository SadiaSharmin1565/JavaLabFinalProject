Task Overview
You are tasked with developing a Doctor's Appointment Management System for a local clinic. The clinic has multiple doctors, each specializing in different areas, and patients can book appointments based on doctor availability. The system should allow patients to register, view available doctors, and book an appointment, while doctors can view their appointment schedules. The system should store and retrieve all data through file handling to maintain persistence across sessions.
Implement appropriate classes for Doctors, Patients, and Appointments with private attributes. Create getter and setter methods to manage the data safely.
Use inheritance to create different types of doctors (e.g., GeneralPractitioner, Specialist) that share common attributes and behaviors from a base Doctor class. The derived classes should have unique functionalities based on specialization.
Implement method overriding where each type of doctor (General Practitioner, Specialist) has a unique way of displaying their availability. For example, a General Practitioner might show availability for walk-in patients, while a Specialist might require an appointment confirmation first. This allows the system to call the same method (e.g., displayAvailability()), but each doctor type will have a different implementation. You do not need to use method overloading. Just focus on how the same method can behave differently for different doctor types.
Store all information related to doctors, patients, and appointments in external text files. Implement file handling to save appointment details in a file after each booking. (Optional)


System Overview
The system's functionality is implemented using Java and provides the following features:
Add Doctors: Allows the user to add doctor information, including their name, department, type, and schedule.
Add Patients: Enables users to register patients with details such as name, age, problem, and contact information.
Display Available Doctors & Schedules: Provides a list of doctors and allows users to view each doctor's schedule.
View Patients: Lists all registered patients.
Book Appointments: Enables users to book appointments by selecting a patient, doctor, and time slot.
View Appointments: Displays all booked appointments.
Exit: Exits the system
