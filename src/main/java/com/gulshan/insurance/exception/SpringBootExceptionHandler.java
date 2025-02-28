package com.gulshan.insurance.exception;

import com.gulshan.insurance.dto.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class SpringBootExceptionHandler {

    @ExceptionHandler(value = IdNotFoundException.class)
    public ResponseEntity<ResponseStructure<String>> handleIdNotFound(IdNotFoundException exception) {
        ResponseStructure<String> responseStructure = new ResponseStructure<>();
        responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
        responseStructure.setMsg(exception.getMessage());
        responseStructure.setData(null);

        return new ResponseEntity<>(responseStructure, HttpStatus.NOT_FOUND);
    }
}
