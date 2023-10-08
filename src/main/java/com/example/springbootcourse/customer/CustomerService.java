package com.example.springbootcourse.customer;


import com.example.springbootcourse.exception.NotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
@Slf4j
public class CustomerService {


    private final CustomerRepository customerRepository;


    List<Customer> getcustomers() {
        log.info("getcustomers was called");
        return customerRepository.findAll();
    }

    Customer getCustomer(Long id) {
        return customerRepository
                .findById(id)
                .orElseThrow(() -> {

                    NotFoundException notFoundException = new NotFoundException("customer with id " + id + " not found");
                    log.error("error in getCustomer : {}",id ,notFoundException );
                    return notFoundException;
                });
    }

}
