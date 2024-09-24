package com.xworkz.ecommapp.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private int customerId;
    private String customerName;
    private String email;
    private String address;
    private long phoneNumber;
    private String password;
}
