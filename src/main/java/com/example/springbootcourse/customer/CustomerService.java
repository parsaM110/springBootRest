package com.example.springbootcourse.customer;


import com.example.springbootcourse.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(
            CustomerRepository customerRepository){
        this.customerRepository = customerRepository;

    }

    List<Customer> getcustomers() {
        return customerRepository.findAll();
    }

    Customer getCustomer(Long id)  {
        return customerRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException( "customer with id " + id +" not found"));
    }

}
