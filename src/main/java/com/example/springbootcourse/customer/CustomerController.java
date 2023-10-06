package com.example.springbootcourse.customer;

import com.example.springbootcourse.SpringBootCourseApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private final CustomerService customerService ;

    public CustomerController(){
        customerService = new CustomerService();
    }

    @GetMapping
    Customer getCustomer(){
        return customerService.getCustomer();
    }
}
