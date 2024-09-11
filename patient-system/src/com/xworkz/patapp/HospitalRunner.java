package com.xworkz.patapp;

import com.xworkz.patapp.hospital.Hospital;
import com.xworkz.patapp.hospital.impl.HospitalImpl;
import com.xworkz.patapp.patient.Patient;

import java.util.Scanner;

public class HospitalRunner {


    public static void main(String[] args) {
        Hospital hospital = new HospitalImpl();
        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < 3 ; index++) {
            Patient patient = new Patient();
            System.out.println("Enter the patient Id");
            int pId =  scanner.nextInt();
            patient.setPatientId(pId);
            System.out.println("Enter the patient Name");
            String patientName = scanner.next() ;
            patient.setPatientName(patientName);
            System.out.println("Enter the patient Age");
             int age =  scanner.nextInt();
            patient.setAge(age);
            System.out.println("Enter the Patient address");
            String address = scanner.next();
            patient.setAddress(address);

            boolean patientAdded=        hospital.addPatient(patient);
            System.out.println(" is Patient added "+ patientAdded);
        }

        hospital.getAllPatient();

    }
}
