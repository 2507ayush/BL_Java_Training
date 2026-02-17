package org.example.Services;

import org.example.Exception.InvalidPatientException;
import org.example.Exception.DoctorUnavialableException;
import org.example.annotations.AppointmentValidation;
import org.example.model.*;
import org.example.utils.Validation;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AppointmentService {

    private List<appointment<Integer>> confirmed = new ArrayList<>();
    private Queue<appointment<Integer>> waitingQueue = new LinkedList<>();
    private Stack<appointment<Integer>> undoStack = new Stack<>();
    private Set<String> uniquePatient = new HashSet<>();
    private Map<String, AtomicInteger> doctorSlots = new HashMap<>();

    public AppointmentService() {
        doctorSlots.put("Cardiologist", new AtomicInteger(1));
        doctorSlots.put("Neurologist", new AtomicInteger(2));
        doctorSlots.put("Dentist", new AtomicInteger(2));
        doctorSlots.put("Surgeon",new AtomicInteger(1));
    }

    @AppointmentValidation(requiredFields = {"patient", "doctor"})
    public void bookAppointment(appointment<Integer> appoint)
            throws DoctorUnavialableException {

        String specialization = appoint.getDoctor().getSpecialization();
        String email = appoint.getPatient().getEmail();

        if (uniquePatient.contains(email)) {
            throw new InvalidPatientException("Email already exists: " + email);
        }

        if (!Validation.isValidEmail(email)) {
            throw new InvalidPatientException("Invalid email format");
        }

        if (!Validation.isValidPhone(appoint.getPatient().getPhone())) {
            throw new InvalidPatientException("Invalid phone number");
        }

        AtomicInteger slots = doctorSlots.get(specialization);

        if (slots == null || slots.get() <= 0) {
            waitingQueue.add(appoint);
            throw new DoctorUnavialableException("Doctor not available for " + specialization);
        }

        confirmed.add(appoint);
        undoStack.push(appoint);
        uniquePatient.add(email);
        slots.decrementAndGet();
    }

    public appointment<?> findByEmail(String email) {
        for (appointment<?> app : confirmed) {
            if (app.getPatient().getEmail().equalsIgnoreCase(email)) {
                return app;
            }
        }
        return null;
    }

}
