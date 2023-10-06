package com.example.springbootcourse.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getCustomer() {
        return customerService.getCustomer();
    }

    @PostMapping //we map request json body into customer obj
    void updateCustomer(@RequestBody Customer customer) {
        System.out.println("\u001B[35m" + "Post Request ...");
        System.out.println(customer + "\u001B[0m");
    }

    @PutMapping //we map request json body into customer obj
    void createNewCustomer(@RequestBody Customer customer) {
        System.out.println("\u001B[35m" + "Update Request ...");
        System.out.println(customer + "\u001B[0m");
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id) {

        System.out.println("\u001B[32m" + "Delete  Request  for customer with ID " + id);

    }
}
