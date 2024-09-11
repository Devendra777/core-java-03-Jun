package com.xworkz.patapp.hospital;

import com.xworkz.patapp.patient.Patient;

public interface Hospital {

    boolean addPatient(Patient patient);
    void      getAllPatient();
    boolean  updatePatientAge(int newAge);
    boolean  deletePatient();

}
