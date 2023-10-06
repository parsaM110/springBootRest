package com.example.springbootcourse.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.ZonedDateTime;

public class ExceptionHandler {


    public ResponseEntity<Object> handleApiRequestException(
            ApiRequestException e
    ){
        ApiException apiException = new ApiException(
                e.getMessage(),
                e,
                HttpStatus.BAD_REQUEST,
                ZonedDateTime.now()
        ); // payload for client

        return new ResponseEntity<>(apiException,
                HttpStatus.BAD_REQUEST);
    }
}
