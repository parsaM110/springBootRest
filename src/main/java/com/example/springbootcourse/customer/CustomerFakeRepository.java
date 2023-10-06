package com.example.springbootcourse.customer;

import java.util.Arrays;
import java.util.List;


public class CustomerFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "James Bond", "password", "email@gmail.com"),
                new Customer(2L, "Jamila Ahmed", "password11", "email@gmail.com")
        );
    }
}