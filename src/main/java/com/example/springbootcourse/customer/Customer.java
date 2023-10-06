package com.example.springbootcourse.customer;

class Customer {
    private final long id;
    private final String name;
    private final String password;

    public Customer(long id,
                    String name,
                    String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //customerId
    public Long getCustomerId(){
        return id;
    }

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