package com.example.springbootcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCourseApplication.class, args);
    }


    @GetMapping
    Customer getCustomer(){
        return new Customer(1L,"James Bond");
    }


    class Customer {
        private final long id;
        private final String name;

        public Customer(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
