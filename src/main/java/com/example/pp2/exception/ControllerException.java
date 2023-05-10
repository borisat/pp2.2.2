package com.example.pp2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ControllerException extends Exception {
    public ControllerException(String message) {
        super("SORT_BY " + message + " IS DISABLED");
    }
}
