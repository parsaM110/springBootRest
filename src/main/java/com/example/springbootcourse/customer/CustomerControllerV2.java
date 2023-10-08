package com.example.springbootcourse.customer;

import com.example.springbootcourse.exception.ApiRequestException;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Collections;
import java.util.List;

@RequestMapping(path = "api/v2/customers")
@RestController
@AllArgsConstructor
public class CustomerControllerV2 {

    private final CustomerService customerService;


    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long id)  {
        return customerService.getCustomer(id);
    }

    @GetMapping(path = "{customerId}/exception")
    Customer getCustomerException(@PathVariable("customerId") Long id)  {
        throw new ApiRequestException(
                "ApiRequestException for customer " + id
        );
    }

    @GetMapping()
    List<Customer> getCustomers() {
        return customerService.getcustomers();
    }


    @PostMapping //we map request json body into customer obj
    void updateCustomer(@RequestBody @Valid Customer customer) {
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

        System.out.println("\u001B[32m" + "Delete  Request  for customer with ID " + id + "\u001B[0m");

    }
}
