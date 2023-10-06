package com.example.springbootcourse.customer;

import java.util.Collections;
import java.util.List;


public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers(){
        //Todo connect to real DB
//        return Arrays.asList(
//                new Customer(1L, " to do. Implement DB")
//        );
        return Collections.singletonList(
                new Customer(1L, " Todo. Implement DB", "todo", "email@gmail.com")
        );
        // no difference
    }
}
