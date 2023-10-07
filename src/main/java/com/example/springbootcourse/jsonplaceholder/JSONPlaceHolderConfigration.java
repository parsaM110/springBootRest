package com.example.springbootcourse.jsonplaceholder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JSONPlaceHolderConfigration {

    @Bean("jsonplaceholder")
    CommandLineRunner runner(JSONPlaceHolderClient jsonPlaceHolderClient){
        return args -> {
            System.out.println("\u001B[34m"+"https://jsonplaceholder.typicode.com/posts"+"\u001B[0m");
            System.out.println(jsonPlaceHolderClient.getPosts().size());
            System.out.println("\u001B[34m"+"https://jsonplaceholder.typicode.com/post/1"+"\u001B[0m");
            System.out.println(jsonPlaceHolderClient.getPost(1));
        };
    }
}
