package com.example.springbootcourse.customer;

import com.example.springbootcourse.SpringBootCourseApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping
    Customer getCustomer(){
        return new Customer(1L,"James Bond");
    }
}
