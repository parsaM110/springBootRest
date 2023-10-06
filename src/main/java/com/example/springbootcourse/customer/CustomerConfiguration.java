package com.example.springbootcourse.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Value("${app.useFakeCustomerRepo:false}")
    private Boolean useFakeCustomerRepo;

    @Bean // if you dont put this shit it wont work
    CommandLineRunner commandLineRunner(){
        return args -> {

            System.out.println("\u001B[34m" + "Command line runner hooray" + "\u001B[0m");

        };
    }

    @Bean
    CustomerRepo customerRepo(){

        System.out.println("useFakeCustomerRepo =" + useFakeCustomerRepo);

        return useFakeCustomerRepo ?
                new CustomerFakeRepository() :
                new CustomerRepository();

    }

}
