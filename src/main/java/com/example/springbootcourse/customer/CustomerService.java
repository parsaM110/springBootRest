package com.example.springbootcourse.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {

    private final CustomerRepo customerRepo ;

    @Autowired
    public CustomerService(
            @Qualifier("fake") CustomerRepo customerRepo){
        this.customerRepo =  customerRepo;

    }
//    Customer getCustomer(){
//        return new Customer(1L,"James Bond");
//    }

    List<Customer> getCustomer() {
        return customerRepo.getCustomers();
    }

}
