package org.example.Test;

import org.example.Exception.NoRoomAvailableException;
import org.example.models.Booking;
import org.example.models.Guest;
import org.example.models.RoomType;
import org.example.services.BookingService;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class BookingServiceTest {
    @Test
    public void testbooking(){
        BookingService service=new BookingService();
        Guest guest=new Guest("aman","aman@gmail.com","1234567895");
        Booking book=service.bookRoom(guest, RoomType.DELUXE);
       assertNotNull(book);
    }
    @Test(expected = NoRoomAvailableException.class)
    public void testRoomUnavailable() throws Exception {
        BookingService service = new BookingService();
        Guest g1 = new Guest("A", "a@test.com", "9999999999");
        Guest g2 = new Guest("B", "b@test.com", "8888888888");

        service.bookRoom(g1, RoomType.DELUXE);
        service.bookRoom(g2, RoomType.DELUXE);
    }
}






















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
            System.out.println("===== Hospital Appointment System =====");
            System.out.println("1. Book Appointment");
            System.out.println("2. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    try {
                        System.out.print("\nEnter Patient ID: ");
                        String patientId = sc.nextLine();
                        System.out.print("Enter Patient Name: ");
                        String patientName = sc.nextLine();
                        System.out.print("Enter Patient Email: ");
                        String patientEmail = sc.nextLine();
                        System.out.print("Enter Patient Phone: ");
                        String patientPhone = sc.nextLine();
                        patient p = new patient(
                                patientId, patientName, patientEmail, patientPhone
                        );
                        
                        System.out.print("Enter Doctor ID: ");
                        String doctorId = sc.nextLine();
                        System.out.print("Enter Doctor Specialization: ");
                        String specialization = sc.nextLine();
                        doctor d = new doctor(doctorId, specialization);
                        System.out.print("Enter Appointment ID: ");
                        int appointmentId = sc.nextInt();
                        sc.nextLine();
                        appointment<Integer> appointment =
                                new appointment<>(appointmentId, p, d);
                        service.bookAppointment(appointment);
                        System.out.println("Appointment booked successfully");
                    } catch (Exception e) {
                        System.out.println("Booking failed: " + e.getMessage());
                    }
                    break;
                case 2:
                    running = false;
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }
}

