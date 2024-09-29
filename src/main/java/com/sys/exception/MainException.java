package com.sys.exception;

import org.springframework.http.ResponseEntity;

import com.sys.response.Response;

public abstract class MainException extends RuntimeException {
    
    public MainException(String message){
        super(message);
    }

    abstract ResponseEntity<Response> repsonse();

}
