package org.example.main;

import org.example.model.*;
import org.example.Services.*;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AppointmentService service = new AppointmentService();
        boolean running = true;
        while (running) {
            System.out.println("Hospital Appointment System");
            System.out.println("1. Book Appointment");
            System.out.println("2. Check Appointment");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    try {
                        sc.nextLine();
                        System.out.println("Enter Patient ID: ");
                        String patientId = sc.nextLine();
                        System.out.println("Enter Patient Name: ");
                        String patientName = sc.nextLine();
                        System.out.println("Enter Patient Email: ");
                        String patientEmail = sc.nextLine();
                        System.out.println("Enter Patient Phone: ");
                        String patientPhone = sc.nextLine();
                        patient p = new patient(patientId, patientName, patientEmail, patientPhone);

                        System.out.println("Enter Doctor ID: ");
                        String doctorId = sc.nextLine();
                        System.out.println("Enter Doctor Specialization: ");
                        String specialization = sc.nextLine();
                        doctor d = new doctor(doctorId, specialization);
                        System.out.println("Enter Appointment ID: ");
                        int appointmentId = sc.nextInt();
                        sc.nextLine();
                        appointment<Integer> appointment = new appointment<>(appointmentId, p, d);
                        service.bookAppointment(appointment);
                        System.out.println("Appointment booked successfully");
                    } catch (Exception e) {
                        System.out.println("Booking failed: " + e.getMessage());
                    }
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Enter Email to search: ");
                    String email = sc.nextLine();
                    appointment<?> found = service.findByEmail(email);
                    if (found != null) {
                        System.out.println("Appointment Found!");
                        System.out.println("Patient Name: " + found.getPatient().getName());
                        System.out.println("Doctor ID: " + found.getDoctor().getDoctorId());
                        System.out.println("Specialization: " + found.getDoctor().getSpecialization());
                        System.out.println("Appointment ID: " + found.getAppointmentId());
                    } else {
                        System.out.println("No appointment found with this email.");
                    }
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting System");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}

