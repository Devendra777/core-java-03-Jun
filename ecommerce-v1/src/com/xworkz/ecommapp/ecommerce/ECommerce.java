package com.xworkz.ecommapp.ecommerce;

import com.xworkz.ecommapp.customer.Customer;

public interface ECommerce {

       boolean addCustomer(Customer customer);
       void getAllCustomers();
}
