package com.sys.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.sys.response.Response;

public class BadRequestException extends MainException {

    public BadRequestException(String message){
        super(message);
    }

    @Override
    ResponseEntity<Response> repsonse() {
       return new ResponseEntity<>(new Response(getMessage(),null),HttpStatus.BAD_REQUEST);
    }
    
}
