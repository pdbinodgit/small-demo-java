package com.onetoone.onetoone.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CustomResponse<T> {

    private HttpStatus status;
    private String message;
    private T data;

    public CustomResponse(HttpStatus status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public ResponseEntity<CustomResponse<T>> customResponseResponseEntity(){
        return new ResponseEntity<>(this,this.status);
    }
}
