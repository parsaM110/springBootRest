package com.example.springbootcourse.exception;

import lombok.Data;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@Data //everything is taken care of
public class ApiException {

    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;

    private final ZonedDateTime zonedDateTime;

}
