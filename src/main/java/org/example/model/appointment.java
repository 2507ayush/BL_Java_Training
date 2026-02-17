package org.example.model;

public class appointment<T extends Comparable<T>> {
    private T appointmentId;
    private patient patient;
    private doctor doctor;

    public appointment(T appointmentId, patient patient, doctor doctor) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
    }

    public patient getPatient() {
        return patient;
    }

    public doctor getDoctor() {
        return doctor;
    }

    public T getAppointmentId() {
        return appointmentId;
    }
}
