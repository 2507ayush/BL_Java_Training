package org.example.model;

public class doctor {
    private String doctorId;
    private String specialization;

    public doctor(String doctorId, String specialization) {
        this.doctorId = doctorId;
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getDoctorId() {
        return doctorId;
    }
}
