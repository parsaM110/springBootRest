package com.example.springbootcourse.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping(path = "api/v2/customer")
@RestController
public class CustomerControllerV2 {

    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "all")
    List<Customer> getCustomer() {
        return List.of(new Customer(0L, "v2", "v2"));
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

    @DeleteMapping(path = "{customerId}") // we can also make some more path variable by {customerId}/foo/{}
    void deleteCustomer(@PathVariable("customerId") Long id) {

        System.out.println("\u001B[32m" + "Delete  Request  for customer with ID " + id);

    }
}
