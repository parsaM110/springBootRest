package com.example.springbootcourse.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

class Customer {
    private final long id;
    @NotBlank
    private final String name;

    @NotBlank
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private final String password;

    public Customer(long id,
                    String name,
                    String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @JsonProperty("customerId")
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //customerId
//    public Long getCustomerId(){
//        return id;
//    }
    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}