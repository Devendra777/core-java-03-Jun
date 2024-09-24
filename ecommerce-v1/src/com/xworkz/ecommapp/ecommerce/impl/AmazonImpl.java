package com.xworkz.ecommapp.ecommerce.impl;

import com.xworkz.ecommapp.customer.Customer;
import com.xworkz.ecommapp.ecommerce.ECommerce;

public class AmazonImpl implements ECommerce {

    Customer customer[] = new Customer[2];
    int index;
    @Override
    public boolean addCustomer(Customer customer) {
         boolean isCustomerAdded = false;
         if(customer != null){
                 this.customer[index++]    =  customer;
                 isCustomerAdded = true;
         }
         return isCustomerAdded;
    }

    @Override
    public void getAllCustomers() {
        for (Customer customer1 : customer) {
            System.out.println(customer1.getCustomerId());
            System.out.println(customer1.getCustomerName());
        }
    }


}
