package com.example.springbootcourse.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Objects;

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

    Customer getCustomer(Long id)  {
        return getcustomers()
                .stream()
                .filter(customer -> Objects.equals(customer.getId(), id))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("customer not found"));
    }

}
