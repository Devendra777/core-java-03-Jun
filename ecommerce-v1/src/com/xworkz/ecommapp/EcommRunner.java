package com.xworkz.ecommapp;

import com.xworkz.ecommapp.customer.Customer;
import com.xworkz.ecommapp.ecommerce.ECommerce;
import com.xworkz.ecommapp.ecommerce.impl.AmazonImpl;

public class EcommRunner {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setCustomerId(1);
        customer.setCustomerName("Baba");
        customer.setAddress("Rrnagar");
        customer.setEmail("Baba@gmail.com");
        customer.setPhoneNumber(68686868686L);
        customer.setPassword("Baba@123");

        Customer customer1 = new Customer();
        customer1.setCustomerId(2);
        customer1.setCustomerName("Babi");
        customer1.setAddress("Jpnagar");
        customer1.setEmail("Babi@gmail.com");
        customer1.setPhoneNumber(8968685686L);
        customer1.setPassword("Babi@123");

        ECommerce eCommerce = new AmazonImpl();
        eCommerce.addCustomer(customer);
        eCommerce.addCustomer(customer1);
        eCommerce.getAllCustomers();
    }
}
