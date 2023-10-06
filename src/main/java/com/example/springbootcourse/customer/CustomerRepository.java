package com.example.springbootcourse.customer;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers(){
        //Todo connect to real DB
        return Collections.emptyList();
    }
}
