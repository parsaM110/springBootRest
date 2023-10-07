package com.example.springbootcourse.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class CustomerConfiguration {

    @Value("${app.useFakeCustomerRepo:false}")
    private Boolean useFakeCustomerRepo;

    @Value("${info.company.name}")
    private String companyName;

    @Autowired
    private Environment environment;

    @Bean
        // if you dont put this shit it wont work
    CommandLineRunner commandLineRunner() {
        return args -> {

            System.out.println("\u001B[34m" + "Command line runner hooray" + "\u001B[0m");
            System.out.println(companyName);
            System.out.println(environment.getProperty("info.company.name"));


        };
    }

    @Bean
    CustomerRepo customerRepo() {

        System.out.println("useFakeCustomerRepo =" + useFakeCustomerRepo);

        return new CustomerFakeRepository();


    }

}
