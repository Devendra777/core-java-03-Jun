package com.xworkz.patapp.hospital.impl;

import com.xworkz.patapp.hospital.Hospital;
import com.xworkz.patapp.patient.Patient;

public class HospitalImpl implements Hospital {

       Patient patient[] = { null ,null, null};
       int index;

    @Override
    public boolean addPatient(Patient patient) {
       boolean isAdded = false;
       if(patient != null){
           if(patient.getPatientName() != null){
               this.patient[index++]     =   patient  ;
               isAdded = true;
           }
       }
       return isAdded;
    }

    @Override
    public void getAllPatient() {
        for (Patient patient: patient ) {
            System.out.println(patient);
        }
    }

    @Override
    public boolean updatePatientAge(int newAge) {
     /*   System.out.println("inside updatePatientAge");
        boolean isAgeUpdated = false;
        if(newAge > 0 ){
                  this.patient.setAge(newAge);
        }else System.out.println("age is invalid");

        System.out.println("inside updatePatientAge");
        return isAgeUpdated;*/
        return false;
    }

    @Override
    public boolean deletePatient() {
        return false;
    }
}
