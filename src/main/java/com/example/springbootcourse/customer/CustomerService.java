package com.example.springbootcourse.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo ;

    @Autowired
    public CustomerService(
             CustomerRepo customerRepo){
        this.customerRepo =  customerRepo;

    }
//    Customer getCustomer(){
//        return new Customer(1L,"James Bond");
//    }

    List<Customer> getcustomers() {
        return customerRepo.getCustomers();
    }

}
