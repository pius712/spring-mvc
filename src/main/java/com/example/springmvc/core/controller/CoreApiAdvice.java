package com.example.springmvc.core.controller;

import com.example.springmvc.core.support.error.GlobalExceptionType;
import com.example.springmvc.core.support.error.TypeException;
import com.example.springmvc.core.support.response.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice(basePackageClasses = {CoreApiAdvice.class})
public class CoreApiAdvice {

    @ExceptionHandler(TypeException.class)
    ResponseEntity<ApiResponse<Void>> typeException(TypeException e) {

        return new ResponseEntity<>(
                ApiResponse.fail(e.exceptionType),
                e.exceptionType.getHttpStatus()
        );
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    ApiResponse<Void> unknownException() {
        return ApiResponse.fail(
                GlobalExceptionType.UNHANDLED_ERROR
        );
    }
}
