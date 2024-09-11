package com.xworkz.patapp.patient;

import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@ToString
public class Patient {
    private int patientId;
    private String patientName;
    private int age;
    private String address;
}
